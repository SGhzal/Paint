import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Window extends JFrame implements ActionListener{
    private Drawing monDessin=new Drawing();



    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();


        if(cmd.equals("Rouge")){
            monDessin.setColor(Color.red);
        }

        else if(cmd.equals("Orange")){
            monDessin.setColor(Color.orange);
        }

        else if(cmd.equals("Jaune")){
            monDessin.setColor(Color.yellow);
        }

        else if(cmd.equals("Vert")){
            monDessin.setColor(Color.green);
        }

        else if(cmd.equals("Bleu")){
            monDessin.setColor(Color.blue);
        }

        else if(cmd.equals("Magenta")){
            monDessin.setColor(Color.magenta);
        }

        else if(cmd.equals("Rose")){
            monDessin.setColor(Color.pink);
        }

        else if(cmd.equals("Noir")){
            monDessin.setColor(Color.black);
        }

        else if(cmd.equals("Open")){
            JFileChooser fdo=new JFileChooser();
            int x=fdo.showOpenDialog(this);
            String nameFileOpen=fdo.getSelectedFile().getAbsolutePath();
            monDessin.recallDrawing(nameFileOpen);
        }

        else if(cmd.equals("New")){
            monDessin.reset();
        }

        else if(cmd.equals("Save")){
        }

        else if(cmd.equals("Auteurs")){
            JOptionPane info = new JOptionPane();
            info.showInternalMessageDialog(
                    info, "GHZAl Bouziane !",
                    "Vive Java",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else if(cmd.equals("Ellipse")){
            monDessin.setnomFigure(cmd);
        }

        else if(cmd.equals("Square")){
            monDessin.setnomFigure(cmd);
        }

        else if(cmd.equals("Circle")){
            monDessin.setnomFigure(cmd);
        }

        else if(cmd.equals("Rectangle")){
            monDessin.setnomFigure(cmd);
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

        contentPane.add(monDessin);

        JPanel panneau=new JPanel();
        panneau.setLayout(new GridLayout(1,2));
        contentPane.add(panneau,"South");

        this.setVisible(true);

        JPanel panneauCouleur=new JPanel();
        panneauCouleur.setLayout(new GridLayout(2,4));

        JButton boutonrouge=new JButton("Rouge");
        boutonrouge.setBackground(Color.red);
        boutonrouge.addActionListener(this);

        JButton boutonorange=new JButton("Orange");
        boutonorange.setBackground(Color.orange);
        boutonorange.addActionListener(this);


        JButton boutonjaune=new JButton("Jaune");
        boutonjaune.setBackground(Color.yellow);
        boutonjaune.addActionListener(this);


        JButton boutonvert=new JButton("Vert");
        boutonvert.setBackground(Color.green);
        boutonvert.addActionListener(this);


        JButton boutonbleu=new JButton("Bleu");
        boutonbleu.setBackground(Color.blue);
        boutonbleu.addActionListener(this);


        JButton boutonmagenta=new JButton("Magenta");
        boutonmagenta.setBackground(Color.magenta);
        boutonmagenta.addActionListener(this);


        JButton boutonrose=new JButton("Rose");
        boutonrose.setBackground(Color.pink);
        boutonrose.addActionListener(this);


        JButton boutonnoir=new JButton("Noir");
        boutonnoir.setBackground(Color.black);
        boutonnoir.addActionListener(this);

        panneauCouleur.add(boutonrouge);
        panneauCouleur.add(boutonorange);
        panneauCouleur.add(boutonjaune);
        panneauCouleur.add(boutonvert);
        panneauCouleur.add(boutonbleu);
        panneauCouleur.add(boutonmagenta);
        panneauCouleur.add(boutonrose);
        panneauCouleur.add(boutonnoir);

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


