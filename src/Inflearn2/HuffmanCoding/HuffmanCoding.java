package Inflearn2.HuffmanCoding;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class HuffmanCoding {
    private ArrayList<Run> runs = new ArrayList<Run>();
    private void collectRuns(RandomAccessFile fIn) throws IOException{
        /*데이터 파일에 등장하는 모든 run들과 각각의 등장횟수를 count하여
        * ArrayList runs에 저장한다.*/

    }

    static public void main(String args[]){
        HuffmanCoding app = new HuffmanCoding();
        RandomAccessFile fIn;
        try{
            fIn = new RandomAccessFile("sample.txt","r");
            app.collectRuns(fIn);
            fIn.close();
        } catch (IOException io){
            System.err.println("Cannot open" + fileName);
        }
    }
}
