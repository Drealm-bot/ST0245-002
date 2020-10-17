package Taller_10_Datos;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Read{
	int[] n;
	ArrayList<String> info = new ArrayList<>();
	public void readFile(String fileName) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(fileName));
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			info.add(line);
		}
	}
	private ArrayList<String> getInfo() {
		return info;
	}
	public int[] number() {
		n = new int[info.size()-2];
		for(int i=1;i<info.size(); i++) {
			String[] s = info.get(i).split("[,]");
			s[3].replace("-", "");
			int a = Integer.parseInt(s[3]);
			n[i-1] = a;
		}
		return n;
	}
}
