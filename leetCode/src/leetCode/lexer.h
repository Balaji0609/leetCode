/*

 * lexer.h
 *
 *  Created on: Feb 25, 2016
 *      Author: Balaji Chandrasekaran
 */

#ifndef LEXER_H_
#define LEXER_H_

typedef enum {
	END_OF_FILE = -1,
	HASH = 1,
	DOUBLEHASH,
	ARROW,
	ID,
	ERROR
}token_type;

#define MAX_TOKEN_LENGTH 200

extern char current_token[MAX_TOKEN_LENGTH];
extern int token_length;
extern token_type t_type;
extern int line;

token_type getToken();

void ungetToken();

#endif /* LEXER_H_ */
