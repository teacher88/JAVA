package thread12.CharMulti;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;

public class ServerArr extends Thread {
	private Socket socket;
	public static List<PrintWriter> list=Collections.synchronizedList(new ArrayList<PrintWriter>());   
																		// µ¿±âÈ­ ¸®½ºÆ®, static Vector<PrintWriter> »ç¿ë°¡´É
	private PrintWriter pw;		
	
	public ServerArr(Socket socket){	  // ¿µÈñ,  Ã¶¼ö
		this.socket=socket;
		this.sendArr();
	}
	
	// 2¹ø -------------------------------------------
	public void sendArr(){
		try{
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw=new PrintWriter(bw);
			
			list.add(pw);  			 // ¿µÈñ printWirter Ã¶¼ö printWriter
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void sendPrintAll(String str){
		for(PrintWriter pw:list){    // for(int i=0;i<list.size();i++){ PrintWriter pw=list.get(i) }
			pw.println(str);
			pw.flush();
		}
	}
	
	// 1¹ø ----------------------------------------------------
	@Override
	public void run(){
		BufferedReader br=null;	
		String name=null;
		
		try{			
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);		

			name=br.readLine();
			
			// System.out.println("#" + name + "´ÔÀÌ µé¾î¿À¼Ì½À´Ï´Ù.");
			this.sendPrintAll("#" + name + "´ÔÀÌ µé¾î¿À¼Ì½À´Ï´Ù.");	
			
			while(true){				
				String inputMsg=br.readLine();
				
				if(inputMsg.equalsIgnoreCase("Q")) {
					this.sendPrintAll("#" + name + "´ÔÀÌ Ã¤ÆÃ¹æÀ» ³ª°¬½À´Ï´Ù.");
					// System.out.println("#" + name + "´ÔÀÌ Ã¤ÆÃ¹æÀ» ³ª°¬½À´Ï´Ù.");
					
					list.remove(pw);
					break;
				}
				
				// System.out.println(name + ">>" + inputMsg);
				this.sendPrintAll(name + ">>" + inputMsg);
			}
		
		}catch(SocketException | NullPointerException e){
			this.sendPrintAll("#" + name + "´ÔÀÌ Ã¤ÆÃ¹æÀ» ³ª°¬½À´Ï´Ù.");
			list.remove(pw);
		}catch(IOException e){
			System.out.println("ServerArr Error");
			e.printStackTrace();
		}
	}
}
