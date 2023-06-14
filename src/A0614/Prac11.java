package A0614;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Prac11 {
    public static void main(String[] args) {
        //서버단
        ServerSocket ser = null;

        try{
            ser = new ServerSocket();//1.서버소켓 생성
            ser.bind(new InetSocketAddress("localhost", 5001));
            //2.서버소켓과 연결될 ip주소와 포트번호
            
            while (true){
                System.out.println("연결되기를 기다림");
                Socket so = ser.accept();
                //3 연결 요청을 수락하면서 소켓 생성한다.

                byte b[] = null;
                String msg = null;
                
                //친구(클라이언트)가 보낸 메세지를 읽어들인다
                InputStream in =so.getInputStream();//인풋스트림은 바이트로 읽기때문에 '안녕'이라는 문자열
                b= new byte[100];//인식이 안됀다.
                //매시지 바이트 배열 읽는다
                int r = in.read(b);

                //바이트 배열을 문자열로 바꾼다.
                msg = new String(b,0,r,"UTF-8");
                
                System.out.println("데이터받기 성공");

                OutputStream os = so.getOutputStream();
                msg = "hi Client";
                //문자열을 다시 바이트로 변경해서 전송한다.
                b = msg.getBytes("UTF-8");

                os.write(b);
                System.out.println("데이터 보내기 성공");

                os.close();
                in.close();
                so.close();
                ser.close();
            }


        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
