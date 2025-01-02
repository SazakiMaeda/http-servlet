package com.sazakimaeda.http.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;

public class DatagramServerRunner {
    public static void main(String[] args) throws Exception {

        try (DatagramSocket datagramSocket = new DatagramSocket(7777);
        ){
            byte[] buffer = new byte[128];
            DatagramPacket packet =
                    new DatagramPacket(buffer, buffer.length);
            datagramSocket.receive(packet);

            System.out.println(new String(buffer));
        }
    }
}
