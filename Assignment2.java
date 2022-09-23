 /*MIT License

  * Copyright (c) 2022 Rudra Shah

  * Permission is hereby granted, free of charge, to any person obtaining a copy
  * of this software and associated documentation files (the "Software"), to deal
  * in the Software without restriction, including without limitation the rights
  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  * copies of the Software, and to permit persons to whom the Software is
  * furnished to do so, subject to the following conditions:
  *
  * The above copyright notice and this permission notice shall be included in all
  * copies or substantial portions of the Software.
  *
  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
  * SOFTWARE.
  *
  * -- LICENSE ENDS --
  *
  * Name: Rudra Shah
  * Roll No: 21BCM054
  * Class: 2nd Year CSE-MBA
  * Section: I
  * College: Nirma University
  * Subject: OOAD -> OBJECT ORIENTED APPLICATION DEVELOPMENT
  * Assignment: 2
  */

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.out;             

public class Assignment2{
    String gender1of = "";
    String errorMessage = "";
    Assignment2(){
        // Initialize Labels
        Frame f = new Frame("21BCM054: Assignments2");
        Label name = new Label("First Name: ");
        Label mname = new Label("Middle Name: ");
        Label lname = new Label("Last Name: ");
        Label dob = new Label("Date of Birth: ");
        Label gender = new Label("Gender: ");
        Label email = new Label("Email: ");
        Label password = new Label("Password: ");
        Label hobbies = new Label("Hobbies: ");
        Label language = new Label("Language(s): ");
        Label address = new Label("Address: ");
        Label pincode = new Label("Pincode: ");
        Label city = new Label("City name: ");

        // Initialize different type fields
        TextField name1 = new TextField();
        name1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
            }
        });
        TextField mname1 = new TextField();
        mname1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
            }
        });
        TextField lname1 = new TextField();
        lname1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
            }
        });
        Choice date = new Choice();
        Choice month = new Choice();
        Choice year = new Choice();
        for(int i=1;i<=31;i++){
            date.add(String.valueOf(i));
        }
        for(int i=1;i<=12;i++){
            month.add(String.valueOf(i));
        }
        for(int i=1998;i<=2003;i++){
            year.add(String.valueOf(i));
        }
        CheckboxGroup gender1 = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", gender1, false);
        Checkbox female = new Checkbox("Female", gender1, false);
        TextField temail = new TextField();
        TextField tpass = new TextField();
        tpass.setEchoChar('*');
        Checkbox h1 = new Checkbox("Coding");
        Checkbox h2 = new Checkbox("Dancing");
        Checkbox h3 = new Checkbox("Singing");
        Checkbox l1 = new Checkbox("English");
        Checkbox l2 = new Checkbox("Hindi");
        Checkbox l3 = new Checkbox("Gujarati");
        TextField taddress = new TextField();
        TextField tpincode = new TextField();
        Choice tcity = new Choice();
        tcity.add("Select City");
        tcity.add("Ahmedabad");
        tcity.add("Surat");
        tcity.add("Vadodara");
        tcity.add("Rajkot");
        tcity.add("Bhavnagar");
        tcity.add("Jamnagar");
        tcity.add("Junagadh");
        tcity.add("Gandhinagar");
        tcity.add("Anand");
        tcity.add("Nadiad");
        tcity.add("Navsari");
        tcity.add("Bharuch");
        tcity.add("Patan");
        tcity.add("Porbandar");
        tcity.add("Surendranagar");
        tcity.add("Morvi");
        tcity.add("Veraval");
        tcity.add("Godhra");
        tcity.add("Palanpur");
        tcity.add("Botad");
        tcity.add("Valsad");
        Button submit = new Button("Submit");
        TextArea ta = new TextArea();

        // Initialize Bounds
        name.setBounds(50,50,100,25);
        name1.setBounds(150,50,150,25);
        mname.setBounds(50,80,100,25);
        mname1.setBounds(150,80,150,25);
        lname.setBounds(50,110,100,25);
        lname1.setBounds(150,110,150,25);
        dob.setBounds(50,140,90,25);
        date.setBounds(145,140,80,25);
        month.setBounds(225,140,80,25);
        year.setBounds(305,140,90,25);
        gender.setBounds(50,170,90,25);
        male.setBounds(150,170,70,25);
        female.setBounds(220,170,80,25);
        email.setBounds(50,200,100,25);
        temail.setBounds(150,200,150,25);
        password.setBounds(50,230,100,25);
        tpass.setBounds(150,230,150,25);
        hobbies.setBounds(50,260,95,25);
        h1.setBounds(145,260,90,25);
        h2.setBounds(240,260,90,25);
        h3.setBounds(340,260,90,25);
        language.setBounds(50,290,95,25);
        l1.setBounds(145,290,90,25);
        l2.setBounds(240,290,90,25);
        l3.setBounds(340,290,90,25);
        address.setBounds(50,320,95,25);
        taddress.setBounds(150,320,150,25);
        pincode.setBounds(50,350,95,25);
        tpincode.setBounds(150,350,150,25);
        city.setBounds(50,380,95,25);
        tcity.setBounds(145,380,150,25);
        submit.setBounds(150,420,100,25);
        ta.setBounds(50,460,400,210);

        // Initialize Action Listener
        date.addItemListener(e->{
            if(month.getSelectedItem().equals("2")){
                if(Integer.parseInt(year.getSelectedItem())%4==0){
                    if(Integer.parseInt(date.getSelectedItem())>29){
                        date.select("29");
                    }
                }else{
                    if(Integer.parseInt(date.getSelectedItem())>28){
                        date.select("28");
                    }
                }
            }else if(month.getSelectedItem().equals("4")||month.getSelectedItem().equals("6")||month.getSelectedItem().equals("9")||month.getSelectedItem().equals("11")){
                if(Integer.parseInt(date.getSelectedItem())>30){
                    date.select("30");
                }
            }
            else{
                if(Integer.parseInt(date.getSelectedItem())>31){
                    date.select("31");
                }
            }
        });
        month.addItemListener(e->{
            if(month.getSelectedItem().equals("2")){
                if(Integer.parseInt(year.getSelectedItem())%4==0){
                    if(Integer.parseInt(date.getSelectedItem())>29){
                        date.select("29");
                    }
                }else{
                    if(Integer.parseInt(date.getSelectedItem())>28){
                        date.select("28");
                    }
                }
            }else if(month.getSelectedItem().equals("4")||month.getSelectedItem().equals("6")||month.getSelectedItem().equals("9")||month.getSelectedItem().equals("11")){
                if(Integer.parseInt(date.getSelectedItem())>30){
                    date.select("30");
                }
            }
            else{
                if(Integer.parseInt(date.getSelectedItem())>31){
                    date.select("31");
                }
            }
        });
        year.addItemListener(e->{
            if(month.getSelectedItem().equals("2")){
                if(Integer.parseInt(year.getSelectedItem())%4==0){
                    if(Integer.parseInt(date.getSelectedItem())>29){
                        date.select("29");
                    }
                }else{
                    if(Integer.parseInt(date.getSelectedItem())>28){
                        date.select("28");
                    }
                }
            }else if(month.getSelectedItem().equals("4")||month.getSelectedItem().equals("6")||month.getSelectedItem().equals("9")||month.getSelectedItem().equals("11")){
                if(Integer.parseInt(date.getSelectedItem())>30){
                    date.select("30");
                }
            }
            else{
                if(Integer.parseInt(date.getSelectedItem())>31){
                    date.select("31");
                }
            }
        });
        male.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                gender1of = "Male";
            }
        });
        female.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                gender1of = "Female";
            }
        });
        submit.addActionListener(e->{
            //append all 12 fields to text area
            ta.setText("");
            ta.append("Name: "+name1.getText()+" "+mname1.getText()+" "+lname1.getText()+"\n");
            ta.append("Date of Birth: "+date.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"\n");
            ta.append("Gender: "+gender1of);
            String emailc = temail.getText();
            if(emailc.matches(".*[@].*")){
                ta.append("\n");
                ta.append("Email: "+emailc);
            }else{
                errorMessage+="\nEmail must contain @";
            }
            String pasc = tpass.getText();
            if(pasc.matches(".*[!@#$%^&*()_+].*") && pasc.length()>=10){
                ta.append("\n");
                ta.append("Password: "+pasc);
            }else{
                errorMessage+="Password must contain atleast one special character and 10 characters";
            }
            ta.append("\n");
            ta.append("Hobbies: ");
            if(h1.getState()){
                ta.append(h1.getLabel()+" ");
            }
            if(h2.getState()){
                ta.append(h2.getLabel()+" ");
            }
            if(h3.getState()){
                ta.append(h3.getLabel()+" ");
            }
            ta.append("\n");
            ta.append("Language: ");
            if(l1.getState()){
                ta.append(l1.getLabel()+" ");
            }
            if(l2.getState()){
                ta.append(l2.getLabel()+" ");
            }
            if(l3.getState()){
                ta.append(l3.getLabel()+" ");
            }
            String addressc = taddress.getText();
            if(addressc.matches(".*[0-9].*")){
                ta.append("\n");
                ta.append("Address: "+addressc);
            }else{
                errorMessage+="\nAddress must contain atleast one number";
            }
            String pincodec = tpincode.getText();
            if(pincodec.matches(".*[0-9].*") && pincodec.length()==6){
                ta.append("\n");
                ta.append("Pincode: "+pincodec);
            }else{
                errorMessage+="\nPincode must contain atleast one number";
            }
            String cityc = tcity.getSelectedItem();
            if(!cityc.equals("Select City")){
                ta.append("\n");
                ta.append("City: "+cityc);
            }else{
                errorMessage+="\nCity must be selected";
            }
            if(errorMessage!=""){
                //set title and message
                ta.setText("");
                ta.append(errorMessage);
                errorMessage="";
            }
        });
        
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        // Adding to Frame
        f.add(name);
        f.add(name1);
        f.add(mname);
        f.add(mname1);
        f.add(lname);
        f.add(lname1);
        f.add(dob);
        f.add(date);
        f.add(month);
        f.add(year);
        f.add(gender);
        f.add(male);
        f.add(female);
        f.add(email);
        f.add(temail);
        f.add(password);
        f.add(tpass);
        f.add(hobbies);
        f.add(h1);
        f.add(h2);
        f.add(h3);
        f.add(language);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(address);
        f.add(taddress);
        f.add(pincode);
        f.add(tpincode);
        f.add(city);
        f.add(tcity);
        f.add(submit);
        f.add(ta);

        // Configure Frame
        f.setSize(500,700);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new Assignment2();
    }
    private static <T>void print(T s){
        out.print(s);
    }
    public static void endl(){
        out.println();
    }
}
/* 21BCM054 RUDRA SHAH */