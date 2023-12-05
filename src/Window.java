import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Window extends JFrame implements ActionListener{
    private Drawing mD=new Drawing();
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();


        if(cmd.equals("Rojo")){
            mD.setColor(Color.red);
        }

        else if(cmd.equals("Orange")){
            mD.setColor(Color.orange);
        }

        else if(cmd.equals("Yellow")){
            mD.setColor(Color.yellow);
        }

        else if(cmd.equals("Green")){
            mD.setColor(Color.green);
        }

        else if(cmd.equals("Blue")){
            mD.setColor(Color.blue);
        }

        else if(cmd.equals("Magenta")){
            mD.setColor(Color.magenta);
        }

        else if(cmd.equals("Rose")){
            mD.setColor(Color.pink);
        }

        else if(cmd.equals("Black")){
            mD.setColor(Color.black);
        }

        else if(cmd.equals("Open")){
            JFileChooser fdo=new JFileChooser();
            int x=fdo.showOpenDialog(this);
            String nameFileOpen=fdo.getSelectedFile().getAbsolutePath();
            mD.recallDrawing(nameFileOpen);
        }

        else if(cmd.equals("New")){
            mD.reset();
        }

        else if(cmd.equals("Save")){JFileChooser fds=new JFileChooser();
            int c=fds.showSaveDialog(this);
            if (c==JFileChooser.CANCEL_OPTION)
            {System.out.println("Cancelled");}
            String nameFile=fds.getSelectedFile().getAbsolutePath();
            mD.saveDrawing(nameFile);
        }

        else if(cmd.equals("Auteurs")){
            JOptionPane info = new JOptionPane();
            info.showInternalMessageDialog(
                    info, "GHZAL Bouziane !",
                    "Vive Java",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else if(cmd.equals("Ellipse")){
            mD.setnomFigure(cmd);
        }

        else if(cmd.equals("Square")){
            mD.setnomFigure(cmd);
        }

        else if(cmd.equals("Circle")){
            mD.setnomFigure(cmd);
        }

        else if(cmd.equals("Rectangle")){
            mD.setnomFigure(cmd);
        }

        else if(cmd.equals("Quit")) {
            System.exit(0);
        }

        else {
            System.err.println(cmd);
        }
    }


    public Window(String titre, int x, int y){
        super(titre);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,0);
        this.setSize(x,y);
        this.setVisible(true);

        Container contentPane = getContentPane() ;

        JMenuBar m= new JMenuBar();
        JMenu menu1=new JMenu("File");
        JMenuItem ouvrir = new JMenuItem("New") ;
        ouvrir.addActionListener(this);
        menu1.add(ouvrir);

        ouvrir.setAccelerator(KeyStroke.getKeyStroke('U',
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),
                false));
        menu1.addSeparator();

        JMenuItem nouveau=new JMenuItem("Open");
        nouveau.addActionListener(this);
        menu1.add(nouveau);
        m.add(menu1);

        JMenuItem enregistrer=new JMenuItem("Save");
        enregistrer.addActionListener(this);
        menu1.add(enregistrer);
        m.add(menu1);

        menu1.addSeparator();

        JMenuItem quitter=new JMenuItem("Quit");
        quitter.addActionListener(this);
        menu1.add(quitter);
        m.add(menu1);

        JMenu menu2 = new JMenu("A propos");
        JMenuItem auteurs=new JMenuItem("Auteurs");
        auteurs.addActionListener(this);
        menu2.add(auteurs);

        m.add(menu2);
        setJMenuBar(m);

        contentPane.add(mD);

        JPanel panneau=new JPanel();
        panneau.setLayout(new GridLayout(1,2));
        contentPane.add(panneau,"South");

        this.setVisible(true);

        JPanel panneauCouleur=new JPanel();
        panneauCouleur.setLayout(new GridLayout(2,4));

        JButton boutonred=new JButton("Rojo");
        boutonred.setBackground(Color.red);
        boutonred.addActionListener(this);

        JButton boutonorange=new JButton("Orange");
        boutonorange.setBackground(Color.orange);
        boutonorange.addActionListener(this);


        JButton boutonyellow=new JButton("Yellow");
        boutonyellow.setBackground(Color.yellow);
        boutonyellow.addActionListener(this);


        JButton boutongreen=new JButton("Green");
        boutongreen.setBackground(Color.green);
        boutongreen.addActionListener(this);


        JButton boutonblue=new JButton("Blue");
        boutonblue.setBackground(Color.blue);
        boutonblue.addActionListener(this);


        JButton boutonmagenta=new JButton("Magenta");
        boutonmagenta.setBackground(Color.magenta);
        boutonmagenta.addActionListener(this);


        JButton boutonrose=new JButton("Rose");
        boutonrose.setBackground(Color.pink);
        boutonrose.addActionListener(this);


        JButton boutonblack=new JButton("Black");
        boutonblack.setBackground(Color.black);
        boutonblack.addActionListener(this);

        panneauCouleur.add(boutonred);
        panneauCouleur.add(boutonorange);
        panneauCouleur.add(boutonyellow);
        panneauCouleur.add(boutongreen);
        panneauCouleur.add(boutonblue);
        panneauCouleur.add(boutonmagenta);
        panneauCouleur.add(boutonrose);
        panneauCouleur.add(boutonblack);

        JPanel panneauOutil=new JPanel();
        JButton boutonSquare=new JButton("square");
        boutonSquare.addActionListener(this);

        JButton boutonRectangle=new JButton("Rectangle");
        boutonRectangle.addActionListener(this);

        JButton boutonCircle=new JButton("Circle");
        boutonCircle.addActionListener(this);

        JButton boutonEllipse=new JButton("Ellipse");
        boutonEllipse.addActionListener(this);


        panneauOutil.setLayout(new GridLayout(2,2));


        panneauOutil.add(boutonSquare);
        panneauOutil.add(boutonRectangle);
        panneauOutil.add(boutonCircle);
        panneauOutil.add(boutonEllipse);

        panneau.add(panneauCouleur);
        panneau.add(panneauOutil);
        this.setVisible(true);

    }
}


