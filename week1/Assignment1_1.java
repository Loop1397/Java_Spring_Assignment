
public class Assignment1_1 {
    public static void main(String[] args) {
        char name1 = '노';
        char name2 = '찬';
        char name3 = '우';
        String str1 = "";
        String str2 = "";
        String str3 = "";

        int count = 0;

        for (int i = Character.MIN_VALUE; i <= Character.MAX_VALUE; i++) {
            if (name1 == i) {
                // String.format("%0xX%n", 숫자) ->10진수 숫자를 16진수 문자열로 바꿔주는 메소드
                str1 = "0x" + String.format("%02X", (int) name1);
                count++;
            } else if (name2 == i) {
                // String.format("%0xX%n", 숫자) ->10진수 숫자를 16진수 문자열로 바꿔주는 메소드
                str2 = "0x" + String.format("%02X", (int) name2);
                count++;
            } else if (name3 == i) {
                // String.format("%0xX%n", 숫자) ->10진수 숫자를 16진수 문자열로 바꿔주는 메소드
                str3 = "0x" + String.format("%02X", (int) name3);
                count++;
            }

            if (count == 3) {
                System.out.println(str1 + ", " + str2 + ", " + str3);
                break;
            }
        }
    }
}
