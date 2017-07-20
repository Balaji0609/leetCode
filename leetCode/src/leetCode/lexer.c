/*
 * lexer.cpp
 *
 *  Created on: Feb 25, 2016
 *      Author: Balaji Chandrasekaran
 */


#include <string.h>
#include <ctype.h>
#include <stdio.h>
#include <conio.h>
#include "lexer.h"

#define KEYWORDS 10
#define RESERVED 6

static int active_token = 0;
static char *reserved[] = {"","#","##","->","ID","ERROR"};

static void skip_space()
{
	char c;
	c = getchar();
	line += (c == '\n');
	while(!feof(stdin) && isspace(c))
	{
		c = getchar();
		line += (c == '\n');
	}
	if(!feof(stdin))
	{
		ungetc(c,stdin);
	}
}

static int is_keyword(char *s)
{
	int i;
	for( i = 1; i <= KEYWORDS; i++ )
	{
		if(strcmp(reserved[i], s) == 0)
		{
			return i;
		}
	}
	return 0;
}

static token_type scan_id()
{
    char c;
    int k;
    token_type the_type;

    c = getchar();
    if (isalpha(c))
    {
        while (isalnum(c) && token_length < MAX_TOKEN_LENGTH)
        {
            current_token[token_length] = c;
            token_length++;
            c = getchar();
        }
        current_token[token_length] = '\0';
        ungetc(c, stdin);
        k = is_keyword(current_token);
        if (k == 0)
        {
            the_type = ID;
        }
        else
        {
            the_type = (token_type) k;
        }
        return the_type;
    }
    else
    {
        return ERROR;
    }
}

token_type getToken()
{
    char c;

    if (active_token)
    {
        active_token = 0;
        return t_type;
    }
    skip_space();
    token_length = 0;
    current_token[0] = '\0';
    c = getchar();
    switch (c)
    {
        case '#' :
        	c = getchar();
        	if(c == '#')
        	{
        		t_type = DOUBLEHASH;
        	}
        	else
        	{
        		ungetc(c, stdin);
        		t_type = HASH;
        	}
        	  return t_type;
        case '-':
        	c = getchar();
        	if(c == '>')
        	{
        		t_type = ARROW;
        	}
        	else
        	{
        		ungetc(c, stdin);
        		t_type = ERROR;
        	}
        		return t_type;
        default:
            if (isalpha(c))
            {
                ungetc(c, stdin);
                t_type = scan_id();
            }
            else if (c == EOF)
            {
                t_type = END_OF_FILE;
            }
            else
            {
                t_type = ERROR;
            }
            return t_type;
    }
}

void ungetToken()
{
	active_token = 1;
}

