package aiproject;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.w3c.dom.css.RGBColor;

public class NewJFrame extends javax.swing.JFrame {     
    
    Graphics graphics;
    String stuts = "";
    
    object [] Array;
    object [] test_array;
    object test_point;
    
    int counter =0;
    int counter_test = 0;
    String im_in_testing_mode = "No";
    double xval_equ =0;
    double yval_equ =0;
    //in multi class
    double xval_equ1 =0;
    double yval_equ1 =0;
    double xval_equ2 =0;
    double yval_equ2 =0;
    public NewJFrame() {
        initComponents();
        graphics = panel.getGraphics();
        
    }
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new java.awt.Panel();
        rhombus = new javax.swing.JButton();
        triangle = new javax.swing.JButton();
        rectangle = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        Iteration = new javax.swing.JTextField();
        LearningRate = new javax.swing.JTextField();
        Theta = new javax.swing.JTextField();
        Instances = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        class3 = new javax.swing.JLabel();
        class1 = new javax.swing.JLabel();
        class2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Testing = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TRaining = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        test = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stauts = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(240, 255, 255));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(720, 555));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(251, 255, 255));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 360));

        rhombus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aiproject/sor/oval.png"))); // NOI18N
        rhombus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rhombusActionPerformed(evt);
            }
        });
        getContentPane().add(rhombus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 89, 41));

        triangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aiproject/sor/triangle.png"))); // NOI18N
        triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleActionPerformed(evt);
            }
        });
        getContentPane().add(triangle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 89, 41));

        rectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aiproject/sor/rectangle.png"))); // NOI18N
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });
        getContentPane().add(rectangle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 89, 41));

        jSlider1.setMaximum(1000);
        jSlider1.setMinimum(1);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 130, 30));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 380));

        Iteration.setText("50");
        Iteration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IterationActionPerformed(evt);
            }
        });
        getContentPane().add(Iteration, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 40, 30));

        LearningRate.setText("0.1");
        LearningRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LearningRateActionPerformed(evt);
            }
        });
        getContentPane().add(LearningRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 40, 30));

        Theta.setText("0");
        getContentPane().add(Theta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 40, 30));

        Instances.setText("10");
        Instances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstancesActionPerformed(evt);
            }
        });
        getContentPane().add(Instances, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 40, 30));

        jLabel2.setText("Max Iteration ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 70, 30));

        jLabel3.setText("Learning Rate");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 80, 30));

        jLabel4.setText("Instances");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 60, 30));

        jLabel5.setText("Theta");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 60, 30));

        jButton1.setText("Learn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 170, 30));

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 100, 30));

        class3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(class3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 100, 20));

        class1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(class1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 100, 20));

        class2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(class2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 100, 20));

        jLabel6.setText("Class3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, 20));

        jLabel7.setText("Class1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, 20));

        jLabel8.setText("Class2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, 20));

        Testing.setBackground(new java.awt.Color(255, 51, 51));
        Testing.setText("Testing");
        Testing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestingActionPerformed(evt);
            }
        });
        getContentPane().add(Testing, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 100, 30));

        jButton2.setText("Restart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 90, 30));

        TRaining.setBackground(new java.awt.Color(255, 51, 51));
        TRaining.setText("Training");
        TRaining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRainingActionPerformed(evt);
            }
        });
        getContentPane().add(TRaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 90, 30));

        jLabel9.setText("Mode:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, 30));

        jLabel10.setText("Action:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, 30));

        test.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aiproject/sor/test.png"))); // NOI18N
        test.setMaximumSize(new java.awt.Dimension(57, 33));
        test.setMinimumSize(new java.awt.Dimension(57, 33));
        test.setPreferredSize(new java.awt.Dimension(74, 33));
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });
        getContentPane().add(test, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 90, 40));

        stauts.setColumns(20);
        stauts.setRows(5);
        jScrollPane1.setViewportView(stauts);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 506, 570, 80));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(" Point status : ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 80, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
        // TODO add your handling code here:
        stuts = "rectangle";
    }//GEN-LAST:event_rectangleActionPerformed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        // TODO add your handling code here:
        if(im_in_testing_mode.equals("No")){
            Array[counter] = new object(evt.getX(),evt.getY(),stuts);
            counter++;
            if(stuts.equals("rectangle")){
                graphics.setColor(Color.RED);
                graphics.fillRect(evt.getX(), evt.getY(), 12, 12);
            }
            else if(stuts.equals("oval")){
                graphics.setColor(Color.BLUE);
                graphics.fillOval(evt.getX(), evt.getY(), 12, 12);
            }
            else if(stuts.equals("triangle")){
                graphics.setColor(Color.GREEN);
                graphics.fillPolygon(new int[] {evt.getX(), evt.getX()+10, evt.getX()+20}, new int[] {evt.getY()+10, evt.getY(), evt.getY()+10}, 3);
            }
            
        }
        else{
            //now im testing 
            //now i will start adding point to the array and test them 
            //test_array[counter_test] =new object(evt.getX(),evt.getY(),stuts);
            //counter_test++;
            test_point = new object(evt.getX(),evt.getY(),stuts);
            graphics.setColor(Color.BLACK);
            graphics.fillOval(evt.getX(), evt.getY(), 12, 12);
            double output;
            double weights[] = new double[4];
            if(xval_equ==0 && yval_equ==0){
                //3 classes
                System.out.print("x*"+xval_equ1+ "+ y*"+yval_equ1+" = 0");
                System.out.print("x*"+xval_equ2+ "+ y*"+yval_equ2+" = 0");
                this.stauts.append("The Linear Equation Used Line1 : "+xval_equ1+ "*x + "+yval_equ1+"*y = 0+\n");
                this.stauts.append("The Linear Equation Used Line2 : "+xval_equ2+ "*x + "+yval_equ2+"*y = 0+\n");
                weights[0]=xval_equ1;
                weights[1]=yval_equ1;
                weights[2]=0;
                weights[3]=0;
                output = calculateOutput(Integer.parseInt(Theta.getText()),weights, test_point.x, test_point.y, 0);
                if(output==1){
                    
                    this.stauts.append("This is "+this.class2.getText()+"\n");
                }
                else{
                   
                
                weights[0]=xval_equ2;
                weights[1]=yval_equ2;
                weights[2]=0;
                weights[3]=0;
                output = calculateOutput(Integer.parseInt(Theta.getText()),weights, test_point.x, test_point.y, 0);
                if(output==1){
                 
                    this.stauts.append("This is "+this.class1.getText()+"\n");
                }
                else{
                    
                    this.stauts.append("This is "+this.class3.getText()+"\n");
                }
                }
                
            }
            else{
                //2 Class
                this.stauts.append("The Linear Equation Used : "+xval_equ+ "*x + "+yval_equ+"*y = 0+\n");
                //System.out.print("x"+xval_equ+ "+ y"+yval_equ+" = 0");
                weights[0]=xval_equ;
                weights[1]=yval_equ;
                weights[2]=0;
                weights[3]=0;
                output = calculateOutput(Integer.parseInt(Theta.getText()),weights, test_point.x, test_point.y, 0);
                if(output==1){
                    System.err.println("This is "+this.class2.getText()+"\n");
                    this.stauts.append("This is "+this.class2.getText()+"\n");
                }
                else{
                    System.err.println("This is "+this.class1.getText()+"\n");
                    this.stauts.append("This is "+this.class1.getText()+"\n");
                }
            }
            
            
            //output = calculateOutput(theta,weights, x1, y1, z1);
            //now calling the function for the current Point
            
        }
    }//GEN-LAST:event_panelMouseClicked

    private void rhombusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rhombusActionPerformed
        // TODO add your handling code here:
        stuts ="oval";
    }//GEN-LAST:event_rhombusActionPerformed

    private void triangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleActionPerformed
        // TODO add your handling code here:
        stuts = "triangle";
    }//GEN-LAST:event_triangleActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        Iteration.setText(jSlider1.getValue()+"");
    }//GEN-LAST:event_jSlider1StateChanged

    private void LearningRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LearningRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LearningRateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Start Learning 
        int MAX_ITER = Integer.parseInt(this.Iteration.getText());
        double LEARNING_RATE = new Double(this.LearningRate.getText()); 
        int NUM_INSTANCES = Integer.parseInt(this.Instances.getText());
        int theta = Integer.parseInt(this.Theta.getText());
        
        double[] x = new double [NUM_INSTANCES];    
	double[] y = new double [NUM_INSTANCES];
	double[] z = new double [NUM_INSTANCES];
	int [] outputs = new int[NUM_INSTANCES];
        
        // now i will loop in order to see How many class's i have 
        int [] see_how_many_class = new int[3] ;
        for (int i = 0 ; i < NUM_INSTANCES ; i++){
            if(Array[i].type.equals("oval")){
                see_how_many_class[0]++;
            }
             if(Array[i].type.equals("triangle")){
                see_how_many_class[1]++;
            }
              if(Array[i].type.equals("rectangle")){
                see_how_many_class[2]++;
            }
        }
        if(see_how_many_class[0]==0 && see_how_many_class[1]==0 && see_how_many_class[2]==0){
            //No Class No Data
            JOptionPane.showMessageDialog(this,"No Data"); 
        }
        else if(see_how_many_class[0]==0 && see_how_many_class[1]==0){  
            JOptionPane.showMessageDialog(this,"Put 2 Class at least");
        }
        else if(see_how_many_class[1]==0 && see_how_many_class[2]==0){
            JOptionPane.showMessageDialog(this,"Put 2 Class at least");
        }
        else if(see_how_many_class[0]==0 && see_how_many_class[2]==0){
            JOptionPane.showMessageDialog(this,"Put 2 Class at least");
        }
        else if(see_how_many_class[0]>0 && see_how_many_class[1]>0 && see_how_many_class[2]>0){
            // here we have a 3 Class's multi nural network   
                String class1 = "oval";
                String class2 = "triangle";
                String class3 = "rectangle";
                int j = 0;
                for(int i =0 ; i < Array.length ; i++){
                if(Array[i].type.equals(class1)){
                    //add to output
                    x[j]=Array[i].x;
                    y[j]=Array[i].y;
                    z[j]=0;
                    outputs[j]=0;
                    j++;
                }
                else {
                    //wait for the next loop
                }
            }
            for(int i =0 ; i < Array.length ; i++){
                if(Array[i].type.equals(class2)){
                    //add to output
                    x[j]=Array[i].x;
                    y[j]=Array[i].y;
                    z[j]=0;
                    outputs[j]=1;
                    j++;
                }
                
                //class1 is 0 
                //class2 is 1
                else {
                    //wait for the next loop
                }
            }
            for(int i =0 ; i < Array.length ; i++){
                if(Array[i].type.equals(class3)){
                    //add to output
                    x[j]=Array[i].x;
                    y[j]=Array[i].y;
                    z[j]=0;
                    outputs[j]=2;
                    j++;
                }
                
                //class1 is 0 
                //class2 is 1
                else {
                    //wait for the next loop
                }
            }
            // iwill update all array to 0 and 1
            int [] outputstar0 = new int[NUM_INSTANCES];
            int [] outputstar1 = new int[NUM_INSTANCES];
            int [] outputstar2 = new int[NUM_INSTANCES];
            
            for(int i = 0 ; i < NUM_INSTANCES ; i++){
                if(outputs[i]==2){
                    //convert to 1
                    outputstar1[i]=0;
                }
                else{
                    outputstar1[i]=outputs[i];
                }
            }
            for(int i = 0 ; i < NUM_INSTANCES ; i++){
                if(outputs[i]==2){
                    //convert to 1
                    outputstar2[i]=0;
                }
                else{
                    outputstar2[i]=1;
                }
            }
                
            //now apply the algorthem 3time and generate 3 line    
            //data is ordered 
            //findmulticlass(NUM_INSTANCES, x, y, z, outputstar0, LEARNING_RATE, MAX_ITER);
            findmulticlass(NUM_INSTANCES, x, y, z, outputstar1, LEARNING_RATE, MAX_ITER,1);
            findmulticlass(NUM_INSTANCES, x, y, z, outputstar2, LEARNING_RATE, MAX_ITER,2);
            //
        }//if part
        else{
            //last case Any Two Class Togather binary Classification 
            String class1 = "";
            String class2 = "";
            if(see_how_many_class[0]==0){
                class1="triangle";
                class2="rectangle";
            }
            if(see_how_many_class[1]==0){
                class1="oval";
                class2="rectangle";
            }
            if(see_how_many_class[2]==0){
                class1="oval";
                class2="triangle";
            }
             
            int j = 0 ;
            for(int i =0 ; i < Array.length ; i++){
                if(Array[i].type.equals(class1)){
                    //add to output
                    x[j]=Array[i].x;
                    y[j]=Array[i].y;
                    z[j]=0;
                    outputs[j]=0;
                    j++;
                }
                else {
                    //wait for the next loop
                }
            }
            for(int i =0 ; i < Array.length ; i++){
                if(Array[i].type.equals(class2)){
                    //add to output
                    x[j]=Array[i].x;
                    y[j]=Array[i].y;
                    z[j]=0;
                    outputs[j]=1;
                    j++;
                }
                
                //class1 is 0 
                //class2 is 1
                else {
                    //wait for the next loop
                }
            }
            
            
            //data is ordered 
            double[] weights = new double[4];// 3 for input variables and one for bias
            double localError, globalError;
            int i, p, iteration, output;
            weights[0] = randomNumber(0,1);// w1
            weights[1] = randomNumber(0,1);// w2
            weights[2] = randomNumber(0,1);// w3
            weights[3] = randomNumber(0,1);// this is the bias
            
            iteration = 0;
            String perf = "";
            do {
			iteration++;
			globalError = 0;
			//loop through all instances (complete one epoch)
			for (p = 0; p < NUM_INSTANCES; p++) {
				// calculate predicted class
				output = calculateOutput(Integer.parseInt(Theta.getText()),weights, x[p], y[p], z[p]);
				// difference between predicted and actual class values
				localError = outputs[p] - output;
				//update weights and bias
				weights[0] += LEARNING_RATE * localError * x[p];
				weights[1] += LEARNING_RATE * localError * y[p];
				weights[2] += LEARNING_RATE * localError * z[p];
				weights[3] += LEARNING_RATE * localError;
				//summation of squared error (error value for all instances)
				globalError += (localError*localError);
			}

			/* Root Mean Squared Error */
			System.out.println("Iteration "+iteration+" : RMSE = "+Math.sqrt(globalError/NUM_INSTANCES));
                        perf = perf + "Iteration "+iteration+" : RMSE = "+Math.sqrt(globalError/NUM_INSTANCES) +"\n";
                        
		} while (globalError != 0 && iteration<=MAX_ITER);
            
                System.out.println("\n=======\nDecision boundary equation:");
		System.out.println(weights[0] +"*x + "+weights[1]+"*y +  "+weights[3]+" = 0");
                perf = perf + "\n=======\nDecision boundary equation:"+weights[0] +"*x + "+weights[1]+"*y +  "+weights[3]+" = 0 \n";
                
                
                
                
                Graphics g = this.panel.getGraphics();
                double x1 = 900;
                double x2 = -900;
                double y1,y2;
                double yval = weights[1];
                yval = yval*(-1);
                
                y1 = ((weights[0]*x1)/yval) +weights[3];
                y2 = ((weights[0]*x2)/yval) +weights[3];
                
                System.out.println(x1+" , "+(int)y1 +"  : "+x2 + " , "+(int)y2);
                
                g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
                xval_equ =weights[0];
                yval_equ =weights[1];
            
            
            for(int s =0 ; s < Array.length ; s++){
                System.out.println(x[s]+" "+y[s]+" "+outputs[s]);
            }
            System.err.println("Class1 is "+class1);
            System.err.println("Class2 is "+class2);
            this.class1.setText("Class1 is "+class1);
            this.class2.setText("Class2 is "+class2);
            perf = perf + "Class1 is "+class1 + "\n"+"Class2 is "+class2+"\n";
            JTextArea textArea = new JTextArea(perf);
            JScrollPane scrollPane = new JScrollPane(textArea);  
            textArea.setLineWrap(true);  
            textArea.setWrapStyleWord(true); 
            scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
            JOptionPane.showMessageDialog(this,scrollPane);
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    public static double randomNumber(int min , int max) {
		DecimalFormat df = new DecimalFormat("#.####");
		double d = min + Math.random() * (max - min);
		String s = df.format(d);
		double x = Double.parseDouble(s);
		return x;
	}
    static int calculateOutput(int theta, double weights[], double x, double y, double z)
	{
		double sum = x * weights[0] + y * weights[1] + z * weights[2] + weights[3];
		return (sum >= theta) ? 1 : 0;
	}
    void findmulticlass(int NUM_INSTANCES,double[]x,double[]y,double[]z,int []outputs,double LEARNING_RATE,int MAX_ITER,int indecator){
        
                String class1 = "oval";
                String class2 = "triangle";
                String class3 = "rectangle";
            double[] weights = new double[4];
            double localError, globalError;
            int i, p, iteration, output;
            weights[0] = randomNumber(0,1);// w1
            weights[1] = randomNumber(0,1);// w2
            weights[2] = randomNumber(0,1);// w3
            weights[3] = randomNumber(0,1);// this is the bias
            iteration = 0;
            String perf = "";
            
            do {
			iteration++;
			globalError = 0;
			//loop through all instances (complete one epoch)
			for (p = 0; p < NUM_INSTANCES; p++) {
				// calculate predicted class
				output = calculateOutput(Integer.parseInt("0"),weights, x[p], y[p], z[p]);
				// difference between predicted and actual class values
				localError = outputs[p] - output;
				//update weights and bias
				weights[0] += LEARNING_RATE * localError * x[p];
				weights[1] += LEARNING_RATE * localError * y[p];
				weights[2] += LEARNING_RATE * localError * z[p];
				weights[3] += LEARNING_RATE * localError;
				//summation of squared error (error value for all instances)
				globalError += (localError*localError);
			}

			/* Root Mean Squared Error */
			System.out.println("Iteration "+iteration+" : RMSE = "+Math.sqrt(globalError/NUM_INSTANCES));
                        perf = perf + "Iteration "+iteration+" : RMSE = "+Math.sqrt(globalError/NUM_INSTANCES) +"\n";
                        
            } while (globalError != 0 && iteration<=MAX_ITER); 
            System.out.println("\n=======\nDecision boundary equation:");
		System.out.println(weights[0] +"*x + "+weights[1]+"*y +  "+weights[3]+" = 0");
                perf = perf + "\n=======\nDecision boundary equation:"+weights[0] +"*x + "+weights[1]+"*y +  "+" = 0 \n";
                
                
                
                
                Graphics g = this.panel.getGraphics();
                double x1 = 900;
                double x2 = -900;
                double y1,y2;
                double yval = weights[1];
                yval = yval*(-1);
                
                y1 = ((weights[0]*x1)/yval) +weights[3];
                y2 = ((weights[0]*x2)/yval) +weights[3];
                
                System.out.println(x1+" , "+(int)y1 +"  : "+x2 + " , "+(int)y2);
                
                g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
                if(indecator == 1){
                    //equation number1 
                    xval_equ1 = weights[0];
                    yval_equ1 = weights[1];
                }
                else{
                    //equation number 2
                    xval_equ2 = weights[0];
                    yval_equ2 = weights[1];
                }
                this.class1.setText("Class1 is "+class1);
                this.class2.setText("Class2 is "+class2);
                this.class3.setText("Class3 is "+class3);
            perf = perf + "Class1 is "+class1 + "\n"+"Class2 is "+class2+"\n";
            JTextArea textArea = new JTextArea(perf);
            JScrollPane scrollPane = new JScrollPane(textArea);  
            textArea.setLineWrap(true);  
            textArea.setWrapStyleWord(true); 
            scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
            JOptionPane.showMessageDialog(this, scrollPane);
    } 

    private void InstancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstancesActionPerformed
        // TODO add your handling code here:
        Array = new object[Integer.parseInt(this.Instances.getText())];
        System.out.println(Array.length);
    }//GEN-LAST:event_InstancesActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        Array = new object[Integer.parseInt(this.Instances.getText())];
        test_array = new object[Integer.parseInt(this.Instances.getText())];
        JOptionPane.showMessageDialog(this,"Saved "+this.Instances.getText() +" as a new size for both testing and Training");
        
    }//GEN-LAST:event_SaveActionPerformed

    private void IterationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IterationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IterationActionPerformed

    private void TestingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestingActionPerformed
        // TODO add your handling code here:
        //now take a random point to test them 
        im_in_testing_mode = "Yes";
        System.err.println(im_in_testing_mode);
        this.Testing.setBackground(Color.GREEN);
        this.TRaining.setBackground(Color.RED);
    }//GEN-LAST:event_TestingActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        NewJFrame a = new NewJFrame();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TRainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRainingActionPerformed
        // TODO add your handling code here:
        im_in_testing_mode = "No";
        System.err.println(im_in_testing_mode);
        this.Testing.setBackground(Color.RED);
        this.TRaining.setBackground(Color.GREEN);
    }//GEN-LAST:event_TRainingActionPerformed

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
        // TODO add your handling code here:
         stuts = "test";
    }//GEN-LAST:event_testActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Instances;
    private javax.swing.JTextField Iteration;
    private javax.swing.JTextField LearningRate;
    private javax.swing.JButton Save;
    private javax.swing.JButton TRaining;
    private javax.swing.JButton Testing;
    private javax.swing.JTextField Theta;
    private javax.swing.JLabel class1;
    private javax.swing.JLabel class2;
    private javax.swing.JLabel class3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    public java.awt.Panel panel;
    private javax.swing.JButton rectangle;
    private javax.swing.JButton rhombus;
    private javax.swing.JTextArea stauts;
    private javax.swing.JButton test;
    private javax.swing.JButton triangle;
    // End of variables declaration//GEN-END:variables
}
