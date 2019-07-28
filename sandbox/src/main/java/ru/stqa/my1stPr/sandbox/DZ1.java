package ru.stqa.my1stPr.sandbox;
//Эта штука читает строчку и забирает слова из 3 строчек
import java.io.*;

public class DZ1 {
    public static void main (String[] args) {

        File file = new File("sandbox/dict (1).xdxf");
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
                st = br.readLine().trim(); //Читаем строчку, убираем пробелы
                if (!st.equals("</xdxf>")) { // если не равно </xdxf> (иначе мы уходим в брейк)

                    if(st.contains("<k>")){ //если мы натыкаемся на <k>
                        int start = st.indexOf("<k>") + 3; // натыкаясь на <k> мы читаем начиная с первого символа 3 символа?????????? НЕ ОЧЕНЬ ПОНЯТНО
                        int end = st.indexOf("</k>"); //  ТОЖЕ ПОКА НЕ ОЧЕНЬ ПОНЯТНО
                        russianLittle = st.substring(start, end); // ТОЖИ
                        counter++; // увеличиваем счетчик
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
                if(counter == 3){ // очень важно, чтобы этот if шел после елс, иначе конструкия нарушается
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