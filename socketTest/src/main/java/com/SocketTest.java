package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(80);


        try {

            System.out.println("开始监听 80 ");

            while (true) {
                Socket link = serverSocket.accept();

                InputStream in = link.getInputStream();

                BufferedReader br = new BufferedReader(new InputStreamReader(in));

                String result;
                while ((result = br.readLine()) != null) {
                    System.out.println(result);
                }
            }


        } catch (

                IOException e) {
            e.printStackTrace();
        }


    }

}
