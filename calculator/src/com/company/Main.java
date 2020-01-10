package com.company;
import  java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main extends  Frame implements ActionListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    TextField result;
    String temp = "",temp2 = "" ;
    int num1 =0 ,num2 = 0;
    String operation;
    int count = 0,count2=0;
    int sum;
    int math;
    ArrayList<Character> arr = new ArrayList<Character>();
    ArrayList<Character> arri = new ArrayList<Character>();
    Main(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
            }
        });
        setSize(300,420);
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);
        result = new TextField();
        result.setBounds(30,50,240,50);
        b1 = new Button("+");
        b1.setBounds(30,130,40,30);
        b2 = new Button("-");
        b2.setBounds(80,130,40,30);
        b3 = new Button("x");
        b3.setBounds(130,130,40,30);
        b4 = new Button("/");
        b4.setBounds(180,130,40,30);
        b5 = new Button("mod");
        b5.setBounds(230,130,40,30);
        b6 = new Button("1");
        b6.setBounds(30,170,40,30);
        b7 = new Button("2");
        b7.setBounds(80,170,40,30);
        b8 = new Button("3");
        b8.setBounds(130,170,40,30);
        b9 = new Button("4");
        b9.setBounds(180,170,40,30);
        b10 = new Button("5");
        b10.setBounds(230,170,40,30);
        b11 = new Button("6");
        b11.setBounds(30,210,40,30);
        b12 = new Button("7");
        b12.setBounds(80,210,40,30);
        b13 = new Button("8");
        b13.setBounds(130,210,40,30);
        b14 = new Button("9");
        b14.setBounds(180,210,40,30);
        b15 = new Button("0");
        b15.setBounds(230,210,40,30);
        b16 = new Button("C");
        b16.setBounds(180,250,40,30);
        b17 = new Button("=");
        b17.setBounds(230,250,40,30);

        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);
        add(result);
        add(b14);add(b15);add(b16);add(b17);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (count2 == 0) {
                        num1 = Integer.parseInt(temp);

                        result.setText(temp + "+");
                        temp = result.getText();
                        count = 1;
                        operation = "+";
                    } else if (count == 1) {
                        temp = "";
                        temp2 = "";
                        result.setText(String.valueOf(sum) + "+");
                        temp = result.getText();
                        for (int i = 0; i <= temp.length() - 1; i++) {
                            arr.add(i, temp.charAt(i));
                        }
                        count = 1;
                        operation = "+";


                    }

                }
                catch (Exception e3){
                    result.setText("Invalid number");

                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (count2 == 0) {
                        num1 = Integer.parseInt(temp);

                        result.setText(temp + "-");
                        temp = result.getText();
                        count = 1;
                        operation = "-";
                    } else if (count == 1) {
                        temp = "";
                        temp2 = "";
                        result.setText(String.valueOf(sum) + "+");
                        temp = result.getText();
                        for (int i = 0; i <= temp.length() - 1; i++) {
                            arr.add(i, temp.charAt(i));
                        }
                        count = 1;
                        operation = "*";


                    }

                }
                catch (Exception e3){
                    result.setText("Invalid number");

                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try {
                if (count2 == 0) {
                    num1 = Integer.parseInt(temp);

                    result.setText(temp + "*");
                    temp = result.getText();
                    count = 1;
                    operation = "*";
                } else if (count == 1) {
                    temp = "";
                    temp2 = "";
                    result.setText(String.valueOf(sum) + "*");
                    temp = result.getText();
                    for (int i = 0; i <= temp.length() - 1; i++) {
                        arr.add(i, temp.charAt(i));
                    }
                    count = 1;
                    operation = "*";


                }

            }
            catch (Exception e3){
                result.setText("Invalid number");

            }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (count2 == 0) {
                        num1 = Integer.parseInt(temp);

                        result.setText(temp + "/");
                        temp = result.getText();
                        count = 1;
                        operation = "/";
                    } else if (count == 1) {
                        temp = "";
                        temp2 = "";
                        result.setText(String.valueOf(sum) + "+");
                        temp = result.getText();
                        for (int i = 0; i <= temp.length() - 1; i++) {
                            arr.add(i, temp.charAt(i));
                        }
                        count = 1;
                        operation = "/";


                    }

                }
                catch (Exception e3){
                    result.setText("Invalid number");
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (count2 == 0) {
                        num1 = Integer.parseInt(temp);

                        result.setText(temp + "%");
                        temp = result.getText();
                        count = 1;
                        operation = "mod";
                    } else if (count == 1) {
                        temp = "";
                        temp2 = "";
                        result.setText(String.valueOf(sum) + "%");
                        temp = result.getText();
                        for (int i = 0; i <= temp.length() - 1; i++) {
                            arr.add(i, temp.charAt(i));
                        }
                        count = 1;
                        operation = "mod";


                    }

                }
                catch (Exception e3){

                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(count == 1){
                    result.setText(temp + "1");
                    temp =result.getText();

                    temp2 = temp2 + "1";
                }
                else {

                    result.setText(temp + "1");
                    temp =result.getText();


                }


            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(count == 1){
                    result.setText(temp + "2");
                    temp =result.getText();
                    temp2 = temp2 + "2";
                }
                else {
                    result.setText(temp + "2");
                    temp =result.getText();


                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(temp + "3");
                temp =result.getText();
            }
        });
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText("");
                temp = "";
                temp2 ="";
                num2 =0;
                num1=0;
                count2 = 0;
                count = 0;
            }
        });
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    if (operation == "+") {
                        if (count2 == 0) {
                            num2 = Integer.parseInt(temp2);
                            sum = num1 + num2;
                            result.setText(temp + "=" + String.valueOf(sum));
                            count2 = 1;
                        } else {
                            String c;
                            int cc;
                            c = String.valueOf(num1);
                            cc = c.length();
                            System.out.println(1);

                            arr.remove(cc);
                            System.out.println(1);

                            for (int k = 0; k <= temp2.length() + 1; k++) {

                            }


                            System.out.println(1);
                            int sc;
                            //  sc=Integer.parseInt(re);
                            // int r = num1 + sc;
                            //result.setText(String.valueOf(r));


                        }
                    }


                }
                catch (Exception e1){
                    result.setText("Invalid number");

                }
                {
                    try {

                        if (operation == "-") {
                            if (count2 == 0) {
                                num2 = Integer.parseInt(temp2);
                                sum = num1 - num2;
                                result.setText(temp + "=" + String.valueOf(sum));
                                count2 = 1;
                            } else {
                                String c;
                                int cc;
                                c = String.valueOf(num1);
                                cc = c.length();
                                System.out.println(1);

                                arr.remove(cc);
                                System.out.println(1);

                                for (int k = 0; k <= temp2.length() + 1; k++) {

                                }


                                System.out.println(1);
                                int sc;
                                //  sc=Integer.parseInt(re);
                                // int r = num1 + sc;
                                //result.setText(String.valueOf(r));


                            }
                        }


                    }
                    catch (Exception e1){
                        result.setText("Invalid number");

                    }
                    {
                        try {

                            if (operation == "*") {
                                if (count2 == 0) {
                                    num2 = Integer.parseInt(temp2);
                                    sum = num1 * num2;
                                    result.setText(temp + "=" + String.valueOf(sum));
                                    count2 = 1;
                                } else {
                                    String c;
                                    int cc;
                                    c = String.valueOf(num1);
                                    cc = c.length();
                                    System.out.println(1);

                                    arr.remove(cc);
                                    System.out.println(1);

                                    for (int k = 0; k <= temp2.length() + 1; k++) {

                                    }


                                    System.out.println(1);
                                    int sc;
                                    //  sc=Integer.parseInt(re);
                                    // int r = num1 + sc;
                                    //result.setText(String.valueOf(r));


                                }
                            }


                        }
                        catch (Exception e1){
                            result.setText("Invalid number");

                        }
                        {
                            try {

                                if (operation == "/") {
                                    if (count2 == 0) {
                                        num2 = Integer.parseInt(temp2);
                                        sum = num1 / num2;
                                        result.setText(temp + "=" + String.valueOf(sum));
                                        count2 = 1;
                                    } else {
                                        String c;
                                        int cc;
                                        c = String.valueOf(num1);
                                        cc = c.length();
                                        System.out.println(1);

                                        arr.remove(cc);
                                        System.out.println(1);

                                        for (int k = 0; k <= temp2.length() + 1; k++) {

                                        }


                                        System.out.println(1);
                                        int sc;
                                        //  sc=Integer.parseInt(re);
                                        // int r = num1 + sc;
                                        //result.setText(String.valueOf(r));


                                    }
                                }


                            }
                            catch (Exception e1){
                                result.setText("Invalid number");

                            }
                            {
                                try {

                                    if (operation == "mod") {
                                        if (count2 == 0) {
                                            num2 = Integer.parseInt(temp2);
                                            sum = num1 % num2;
                                            result.setText(temp + "=" + String.valueOf(sum));
                                            count2 = 1;
                                        } else {
                                            String c;
                                            int cc;
                                            c = String.valueOf(num1);
                                            cc = c.length();
                                            System.out.println(1);

                                            arr.remove(cc);
                                            System.out.println(1);

                                            for (int k = 0; k <= temp2.length() + 1; k++) {

                                            }


                                            System.out.println(1);
                                            int sc;
                                            //  sc=Integer.parseInt(re);
                                            // int r = num1 + sc;
                                            //result.setText(String.valueOf(r));


                                        }
                                    }


                                }
                                catch (Exception e1){
                                    result.setText("Invalid number");

                                }
                            }
                        }
                    }
                }
            }
        });





    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b9){
            if(count == 1){
                result.setText(temp + "4");
                temp =result.getText();
                temp2 = temp2 + "4";
            }
            else {
                result.setText(temp + "4");
                temp =result.getText();


            }
        }
        if(e.getSource() == b10){
            if(count == 1){
                result.setText(temp + "5");
                temp =result.getText();
                temp2 = temp2 + "5";
            }
            else {
                result.setText(temp + "5");
                temp =result.getText();


            }
        }
        if(e.getSource() == b11){
            if(count == 1){
                result.setText(temp + "6");
                temp =result.getText();
                temp2 = temp2 + "6";
            }
            else {
                result.setText(temp + "6");
                temp =result.getText();


            }
        }
        if(e.getSource() == b12){
            if(count == 1){
                result.setText(temp + "7");
                temp =result.getText();
                temp2 = temp2 + "7";
            }
            else {
                result.setText(temp + "7");
                temp =result.getText();


            }

        }
        if(e.getSource() == b13){
            if(count == 1){
                result.setText(temp + "8");
                temp =result.getText();
                temp2 = temp2 + "8";
            }
            else {
                result.setText(temp + "8");
                temp =result.getText();


            }
        }
        if(e.getSource() == b14){
            if(count == 1){
                result.setText(temp + "9");
                temp =result.getText();
                temp2 = temp2 + "9";
            }
            else {
                result.setText(temp + "9");
                temp =result.getText();


            }
        }
        if(e.getSource() == b15){
            if(count == 1){
                result.setText(temp + "0");
                temp =result.getText();
                temp2 = temp2 + "0";
            }
            else {
                result.setText(temp + "0");
                temp =result.getText();


            }

        }

    }



    public static void main(String[] args) {
        new Main();
    }


}
