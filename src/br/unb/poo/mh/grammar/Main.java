package br.unb.poo.mh.grammar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import br.unb.poo.mh.grammar.miniHaskellParser.FileContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Informe a declaracao da funcao");
		Scanner reader = new Scanner(System.in);
		String nomeArquivo = reader.nextLine();
		StringBuilder fullText = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {

			String sCurrentLine;
			
			while ((sCurrentLine = br.readLine()) != null) {
				fullText.append(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(fullText.toString());

		miniHaskellLexer lexer = new miniHaskellLexer(new ANTLRInputStream(fullText.toString()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miniHaskellParser parser = new miniHaskellParser(tokens);
        
        FileContext sentenceContext = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        miniHaskellListener listener = new miniHaskellBaseListener();
        walker.walk(listener, sentenceContext);
        
        
        
        

		

	}

}
