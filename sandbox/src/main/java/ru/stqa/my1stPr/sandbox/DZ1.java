package ru.stqa.my1stPr.sandbox;
//Эта штука читает строчку и забирает слова из 3 строчек
import java.io.*;

public class DZ1 {
    public static void main (String[] args) {

        File file = new File("sandbox/dict (1).xdxf"); //???? ?????? ???? ?? ????? ??????? ??????? ?? ????????
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String st;
        try {
            int counter = 0;
            String russianLittle = "";
            String russianBig = "";
            String eng = "";
            while (true) {  //опасна
                assert br != null;
                st = br.readLine().trim();
                if (!st.equals("</xdxf>")) {

                    if(st.contains("<k>")){
                        int start = st.indexOf("<k>") + 3;
                        int end = st.indexOf("</k>");
                        russianLittle = st.substring(start, end);
                        counter++;
                    }
                    if(st.contains("&quot;")){
                        int start = st.indexOf("&quot;") + 6;
                        int end = st.lastIndexOf("&quot;");
                        russianBig = st.substring(start, end);
                        counter++;
                    }
                    if(st.contains("</ar>")){
                        int end = st.indexOf("</ar>");
                        eng = st.substring(0, end);
                        counter++;
                    }

                }
                else {
                    break;
                }
                if(counter == 3){
                    System.out.println(russianLittle + " " + russianBig + " " + eng);
                    counter = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert br != null;
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}