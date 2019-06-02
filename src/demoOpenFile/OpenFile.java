/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoOpenFile;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class OpenFile {
    public static void main(String[] args) throws URISyntaxException {
        try {
            //chỉ hoạt động được với địa chỉ tuyệt đối
            //Desktop.getDesktop().open(new File("E:\\FPoly\\project\\duan nháp\\Pro101_TheKings_AssigmentGD3\\DuAn_TheKings\\src\\TaiLieu\\Test.pdf"));
            //hoạt động với địa chỉ tương đối
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            URL resource = contextClassLoader.getResource("image/Test.pdf");
            Desktop.getDesktop().open(new File(resource.toURI()));
            //lý do xem tại lýdoOpenFile
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
