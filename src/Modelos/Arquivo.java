package Modelos;

import java.io.*;

import java.util.*;
public interface Arquivo {
	
	public static void leitor(String local) throws IOException{
		List<Item> menu = null;
        BufferedReader buffRead = new BufferedReader(new FileReader(local));
        String nome;
        String p;
        String c;
        String t;
        while (buffRead.ready()){
            nome = buffRead.readLine();
            p = buffRead.readLine();
            c = buffRead.readLine();
            t = buffRead.readLine();
            float preco = Float.parseFloat(p);
            int codigo = Integer.parseInt(c);
            int tipo = Integer.parseInt(t);
            menu.add(new Item());
        }
        buffRead.close();
    }
	 
	    public static void escritor(String local,List<Item> menu) throws IOException {
	    	
	        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(local));
	        String n;
	        float p;
	        int c;
	        int t;
	        String Spreco;
	        String Scodigo;
	        String Stipo;
	        for (Item teste : menu) {
				n = teste.nome;
				p = teste.preco;
				c = teste.codigo;
				t = teste.tipo;
				
				Spreco = Float.toString(p);
				Scodigo = Integer.toString(c);
				Stipo = Integer.toString(t);
				buffWrite.write(n + "\n");
				buffWrite.write(Spreco + "\n");
				buffWrite.write(Scodigo + "\n");
				buffWrite.write(Stipo + "\n");
	        }
	        buffWrite.close();
	    }

}



