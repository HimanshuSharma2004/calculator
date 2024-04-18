import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{
    TextField t1,t2,t3;
    Button b1,b2,b3,b4,b5;
    FDemo()
    {
        Font f = new Font("Brush Script MT",Font.BOLD,50);
        setFont(f);

        setTitle("Calculator");
        setLayout(null);
        Label l1= new Label("Enter 1st Number");
        l1.setSize(500,100);
        l1.setLocation(100,100);
        add(l1);

        t1 = new TextField();
        t1.setSize(500,100);
        t1.setLocation(700,100);
        add(t1);

        Label l2= new Label("Enter 2nd Number");
        l2.setSize(500,100);
        l2.setLocation(100,300);
        add(l2);

        t2 = new TextField();
        t2.setSize(500,100);
        t2.setLocation(700,300);
        add(t2);

        b1 = new Button("+");
        b1.setSize(100,100);
        b1.setLocation(100,500);
        add(b1);

        b2 = new Button("-");
        b2.setSize(100,100);
        b2.setLocation(300,500);
        add(b2);

        b3 = new Button("*");
        b3.setSize(100,100);
        b3.setLocation(500,500);
        add(b3);

        b4 = new Button("/");
        b4.setSize(100,100);
        b4.setLocation(700,500);
        add(b4);

        Label l3= new Label("Output : ");
        l3.setSize(200,100);
        l3.setLocation(100,700);
        add(l3);
        
        t3 = new TextField();
        t3.setSize(500,100);
        t3.setLocation(700,700);
        add(t3);

        Label l4= new Label("Made by Harsh Thakur ");
        l4.setSize(600,100);
        l4.setLocation(300,850);
        l4.setBackground(Color.green);
        add(l4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s1 = t1.getText();
        String s2 = t2.getText();

        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);

        if(b1 == e.getSource())
        {
            int z = x+y;
            t3.setText(""+z);
        }
    
        if(b2 == e.getSource())
        {
            int z = x-y;
            t3.setText(""+z);
        }
    
        if(b3 == e.getSource())
        {
            int z = x*y;
            t3.setText(""+z);
        }
    
        if(b4 == e.getSource())
        {
            int z = x/y;
            t3.setText(""+z);
        }
    }
}
class Demo40 {
    public static void main(String ar[]) {
        FDemo f = new FDemo();

        f.setVisible(true);
        f.setSize(1400, 1000);
        f.setLocation(10, 10);
        f.setBackground(Color.yellow);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}