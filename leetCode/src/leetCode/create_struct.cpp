/*
 * create_struct.cpp
 *
 *  Created on: Feb 25, 2016
 *      Author: Balaji Chandrasekaran
 */
#include <iostream>
#include <list>
#include <map>
#include "lexer.h"

using namespace std;

char current_token[MAX_TOKEN_LENGTH] = "";
int token_length = 0;
token_type t_type = END_OF_FILE;
int line = 0;

struct Rule
{
	string LHS;
	list<string> RHS;
	Rule *next;
}*Grammar;

list<string> NonTerminal;
map<string, int> Terminal;
string Start_Symbol;
int flag_start = 0;
int Map_Value = 0;

void Init_Start_Symbol()
{
	token_type ttype;
	ttype = getToken();
	cout<< current_token;
	if(ttype == HASH || ttype == DOUBLEHASH || ttype == ERROR || ttype == END_OF_FILE)
	{
		cout<<"Error: Wrong entry\n";
	}
	else if(ttype == ID)
	{
	    cout<< "Inside ID  ";
	    cout<< current_token;
		Start_Symbol = string(current_token);
		ungetToken();
	}
}
void GetNonTerminal()
{
	token_type ttype;
	ttype = getToken();
	while(1)
	{
		if(ttype == HASH)
		{
			break;
		}
		else if(ttype == ERROR || ttype == ARROW || ttype == DOUBLEHASH)
		{
			cout<<"Error: Wrong entry\n";
			break;
		}
		else if(ttype == ID)
		{
			string temp;
			list<string>::iterator it = NonTerminal.begin();
			temp = string(current_token);
			NonTerminal.insert(it, temp);
			++it;
			ttype = getToken();
		}
	}
}

int FindNonTerminal(string check)
{
	list<string>::iterator it = NonTerminal.begin();
	for(; it != NonTerminal.end(); ++it)
	{
		if(check == *it)
		{
			return 1;
		}
	}
	return 0;
}


list<string> RHS_Func()
{
	int flag = 0;
	token_type ttype = getToken();
	list<string> temp;
	if(ttype == ARROW)
	{
		ttype = getToken();
	}
	else
	{
		cout<<"Error: in Arrow";
	}
	while(1)
	{
			if(ttype == ID)
			{
				flag = 1;
				string tempo = string(current_token);
				temp.push_back(tempo);
				if(!FindNonTerminal(tempo))
				{
					Terminal.insert(pair<string, int>(tempo, ++Map_Value) );
				}
				ttype = getToken();
			}
			if(ttype == HASH)
			{
				if(flag == 0)
				{
					string tempo = string("#");
					temp.push_back(tempo);
					break;
				}
				else if(flag == 1)
				{
					break;
				}
			}
	}
	return temp;
}

Rule* NodeCreation()
{
	token_type ttype;
	ttype = getToken();
	if(ttype == HASH)
	{
		cout<<"Error: in LHS ";
		return NULL;
	}
	if(ttype == ID)
	{
		string temp;
		temp = string(current_token);
		if(FindNonTerminal(temp))
		{
			if(flag_start == 0)
				flag_start = 1;
			else
				flag_start = 2;
			Rule *Node = new Rule();
			Node->LHS = temp;
			Node->RHS = RHS_Func();
			Node->next = NULL;
			return Node;
		}
	}
	return NULL;
}


Rule* GetRule()
{
	Rule *end;
	Rule *start;
	token_type ttype;
	ttype = getToken();
	int flag = 0;
	while(ttype != DOUBLEHASH)
	{
		if(ttype == ID)
		{
			flag = 1;
			ungetToken();
			end = NodeCreation();
			if(flag_start == 1)
				start = end;
			end = end->next;
		}
	}
	if(flag == 0)
	{
		cout<<"Error : No Rule";
		return NULL;
	}
	else
		return start;
}

void Parse_Rules()
{
	Grammar = GetRule();
	if(Grammar == NULL)
		cout<<"Error : Fatal Check where for error";
}

void print_NonTerminals()
{
	list<string>::iterator it = NonTerminal.begin();
	for(; it != NonTerminal.end(); ++it)
	{
		cout<<*it<<" ";
	}
	cout<<"#";
}

void print_Terminals()
{
	map<string, int>::iterator it = Terminal.begin();
	for(; it != Terminal.end(); ++it)
	{
		cout<<it->first<<":"<<it->second<<"\n";
	}
}

void print_List(list<string> prin)
{
	list<string>::iterator it = prin.begin();
	for(; it != prin.end();++it)
	{
		cout<<*it<<" ";
	}
	cout<<"#";
}

void print_Grammar()
{
	Rule *print;
	print = Grammar;
	while(print != NULL)
	{
		cout<< (print->LHS) <<" -> ";
		print_List(print->RHS);
		cout<<"\n";
		print = print->next;
	}
	cout<<"##";
}


int main()
{
	cout<<"start of program";
	Init_Start_Symbol();
	cout<<"Start_Symbol : "<<Start_Symbol;
	//GetNonTerminal();
	//Parse_Rules();
	//print_NonTerminals();
	//print_Terminals();
	//print_Grammar();
	return 0;
}
