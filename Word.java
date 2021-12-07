package oop.hanu;
import java.util.*;
import java.io.*;

public class Word {
	public Set<String> stopWords;
	public Word createWord(String rawText) {
		
	}
	public boolean isKeyword() {
		
	}
	public String getText() {
		
	}
	public boolean loadStopWords() throws Exception {
		String url = "C:\\Users\\ADMIN\\eclipse-workspace\\Document Search Engine\\stopwords.txt";
		FileReader fr = new FileReader(url);
		BufferedReader reader = new BufferedReader(fr);
		int c; String word = "";
		while ((c = reader.read()) != -1) {
			if (c == ' ') {
				stopWords.add(word);
				word = "";
			}
			else word = word + c;
		}
		fr.close();
		reader.close();
		return true;
		
	}
	public boolean equals(Object o) {
		
	}
	public String toString() {
		
	}
}
