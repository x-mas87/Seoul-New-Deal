package A0614;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Prac12 {
    public static void main(String[] args) throws IOException {


//클라이언트단
    Socket s = null;
    
    try{
        s= new Socket();
        System.out.println("연결요청");
        
        s.connect(new InetSocketAddress("localhost", 5001));
        System.out.println("연결성공");

        byte b[] = null;
        String msg = null;

        OutputStream os = s.getOutputStream();
        msg = "hi Server";
        //문자열을 다시 바이트로 변경해서 전송한다.
        b = msg.getBytes("UTF-8");
        
        os.write(b);
        System.out.println("데이터 보내기 성공");

        InputStream in =s.getInputStream();//인풋스트림은 바이트로 읽기때문에 '안녕'이라는 문자열
        b= new byte[100];//인식이 안됀다.
        //매시지 바이트 배열 읽는다
        int r = in.read(b);

        //바이트 배열을 문자열로 바꾼다.
        msg = new String(b,0,r,"UTF-8");

        System.out.println("데이터받기 성공");

        in.close();
        os.close();
        s.close();


    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}