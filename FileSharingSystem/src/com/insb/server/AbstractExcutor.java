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
		System.out.println("Ŭ���̾�Ʈ ������ ��ٸ��� ��....");
		client=server.accept();
		System.out.println(client);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
	}

	protected abstract void excute();
	private void closeAll(){

	}
}
