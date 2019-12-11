
package jlabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlabel extends JFrame{

    public static void main(String[] args) {
        // TODO code application logic here
         JFrame frame = new JFrame("JLabel ");               // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(300, 250);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(new FlowLayout());                      // حتى نجعل الأشياء التي نضيفها في النافذة تترب وراء بعضها و في وسط النافذة FlowLayout إستخدمنا الـ
 
        Font newFont = new Font("Serif", Font.BOLD, 25);        // حجمه 25 serif يمثل نوع خط عريض إسمه Font هنا أنشأنا كائن من الكلاس

        JLabel label = new JLabel("Hello Word !");          // Label أي قمنا بإنشاء JLabel هنا أنشأنا كائن من الكلاس
        label.setFont(newFont);
        label.setForeground(Color.blue);                        //إلى اللون الأزرق label_1 هنا قمنا بتغيير لون الـ
        frame.add(label);                                       // frame في الـ label هنا أضفنا الـ
      
        frame.setVisible(true);
    }
    
}
