//작성자 : 노찬우

//파일입출력과 관련된 import
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment2_1 {

    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하기 위해 throws IOException을 함

        try {
            // 파일 생성 후 파일이 생성되었는지 검사해주는 기능
            File file = new File("/Users/nochan-u/Desktop/index123.html");
            if (file.createNewFile()) {
                System.out.println("파일이 생성되었습니다.");
            } else {
                System.out.println("파일을 생성하지 못했습니다");
            }
            // 동일한 이름의 파일이 생성 위치에 이미 있을 경우 파일 생성 불가능(오류 메세지 출력)

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            // BufferedWriter, BufferedReader는 주고받는 데이터 형식이
            // String으로 고정되기 때문에 데이터 가공이 필요함

            // html스타일 선언
            writer.write("<html>\n<head>\n<meta charset=\"UTF-8\">\n<style>\n");
            writer.write("table { border-collapse: collapse; width: 100%; }\nth, td { border:solid 1px #000;}\n");
            writer.write("</style>\n</head>\n<body>\n");
            // write는 개발자가 직접 개행 해줘야함

            writer.write("<h2>자바 환경정보</h2>\n<br>\n");
            writer.write("<table>\n");
            writer.write("<th>키</th><th></th>\n");

            // 시스템 속성값을 String변수에 저장한 후 table요소에 넣기
            for (Object k : System.getProperties().keySet()) {
                String key = k.toString();
                String value = System.getProperty(key);
                // System.out.println("key:" + key + " | value:" + value);

                writer.write("<tr>\n");
                writer.write("<td>" + key + "</td>\n");
                writer.write("<td>" + value + "</td>\n");
                writer.write("</tr>\n");
            }

            writer.write("</table>\n</body>\n</html>");
            writer.flush(); // write로 담은 내용을 출력한 후 버퍼를 비우는 기능
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
