package com.insb.server;

import java.net.ServerSocket;
import java.net.Socket;

public abstract class AbstractExcutor {
	ServerSocket server;
	Socket client;
	public void fileProcess(){
		try{
			connectClient();
			excute();
		}	catch(Exception e){
			e.printStackTrace();
		}finally{
			closeAll();
		}
	}

	private void connectClient() throws Exception{
		server=new ServerSocket(5555);
		System.out.println("클라이언트 연결을 기다리는 중....");
		client=server.accept();
		System.out.println(client);
		System.out.println("연결이 완료되었습니다.");
		
	}

	protected abstract void excute();
	private void closeAll(){

	}
}
