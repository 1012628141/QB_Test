package Test;

import QRTest.QRCodeUtil;

public class Qr {
    public static void main(String[] args) {
        String text = "123";
        try {
            QRCodeUtil.encode(text,"E:/MyWorkDoc", true);
        }catch (Exception e){

        }

    }

}
