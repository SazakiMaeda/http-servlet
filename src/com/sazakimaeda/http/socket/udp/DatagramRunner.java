package com.sazakimaeda.http.socket.udp;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;

public class DatagramRunner {
    public static void main(String[] args)
            throws SocketException, UnknownHostException, IOException {

        InetAddress inetAddress = InetAddress.getByName("localhost");
        try (DatagramSocket datagramSocket = new DatagramSocket();
        ){
            byte[] bytes = "Hello from UDP client, lox".getBytes();
            DatagramPacket packet =
                    new DatagramPacket(bytes, bytes.length, inetAddress, 7777);
            datagramSocket.send(packet);
        }
    }
}
