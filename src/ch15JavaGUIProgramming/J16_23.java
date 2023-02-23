package ch15JavaGUIProgramming;
/*	J16_23.java	*/
/* Using CardLayout Manager. */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class J16_23 extends Applet
  implements ActionListener, MouseListener
  {
  Checkbox Win7, Win8, Win10, C, CPP, Java;
  Panel osCards;
  CardLayout cardLO;
  Button Win, Lang;
  public void init(){
    Win = new Button("Windows");
    Lang = new Button("Language");
    add(Win);
    add(Lang);
    cardLO = new CardLayout();
    osCards = new Panel();
    osCards.setLayout(cardLO); 
// set panel layout to card layout
    Win7 = new Checkbox("Windows7", null, false);
    Win8 = new Checkbox("Windows8", null, true);
    Win10 = new Checkbox("Windows10", null, false);
    C = new Checkbox("C");
    CPP = new Checkbox("CPP");
    Java = new Checkbox("Java");
    // add Windows check boxes to a panel
    Panel WinPan = new Panel();
    WinPan.add(Win7);
    WinPan.add(Win8);
    WinPan.add(Win10);  
    // Add Lang check boxes to a panel
    Panel LangPan = new Panel();
    LangPan.add(C);
    LangPan.add(CPP);
    LangPan.add(Java);
    // add panels to card deck panel
    osCards.add(WinPan, "Windows");
    osCards.add(LangPan, "Language");
    // add cards to main applet panel
    add(osCards);
    // register to receive action events
    Win.addActionListener(this);
    Lang.addActionListener(this);
    // register mouse events
    addMouseListener(this);
  }
  // Cycle through panels.
  public void mousePressed(MouseEvent me) 
  {
    cardLO.next(osCards);
  }
 /* Provide empty implementations for the MouseListener methods. */
  public void mouseClicked(MouseEvent me) {  }
  public void mouseEntered(MouseEvent me) {  }
  public void mouseExited(MouseEvent me)  {  }
  public void mouseReleased(MouseEvent me){  }
  public void actionPerformed(ActionEvent ae) 
   {
    if(ae.getSource() == Win) 
    {
     cardLO.show(osCards, "Windows");
    }
    else{
     cardLO.show(osCards, "Language");
    }
  }
}
