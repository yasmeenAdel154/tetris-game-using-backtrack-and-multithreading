/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.logging.Level;
import java.util.logging.Logger;
import static test.Test.copyData;
import static test.Test.print;
import static test.Test.tryToPutJ0;
import static test.Test.tryToPutJ1;
import static test.Test.tryToPutJ2;
import static test.Test.tryToPutJ3;
import static test.Test.tryToPutS0;
import static test.Test.tryToPutS1;
import static test.Test.tryToPutT0;
import static test.Test.tryToPutT1;
import static test.Test.tryToPutT2;
import static test.Test.tryToPutT3;
import static test.Test.tryToPutZ0;
import static test.Test.tryToPutZ1;
import static test.Test.tryToPuti0;
import static test.Test.tryToPuti1;
import static test.Test.tryToPutl0;
import static test.Test.tryToPutl1;
import static test.Test.tryToPutl2;
import static test.Test.tryToPutl3;
import static test.Test.tryToPuto0;

/**
 *
 * @author yasmeen
 */
public class newThreads implements Runnable {

    char CurrentShape;
    int numberOfTheRotation;
    int indexOfCurrentShape;
    public boolean checkTheShape = false;
    boolean flag = false;
    public int copyOfSquareBoard[][] = new int[4][4];
    public int currentSquareBoard[][] = new int[4][4];

    newThreads(char CurrentShape, int numberOfTheRotation, int indexOfCurrentShape,
            int currentSquareBoard[][]) {
        this.CurrentShape = CurrentShape;
        this.numberOfTheRotation = numberOfTheRotation;
        this.indexOfCurrentShape = indexOfCurrentShape;
        copyData(copyOfSquareBoard, currentSquareBoard);
    }

    @Override
    public void run() {
        if (CurrentShape == 'l' && numberOfTheRotation == 0) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutl0(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = true;
            return;
        }
        if (CurrentShape == 'l' && numberOfTheRotation == 1) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutl1(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
                //copyData(currentSquareBoard,copyOfSquareBoard) ;
                flag = true;
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (CurrentShape == 'l' && numberOfTheRotation == 2) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutl2(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            //copyData(currentSquareBoard,copyOfSquareBoard) ;
            flag = true;
        }
        if (CurrentShape == 'l' && numberOfTheRotation == 3) {

            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutl3(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            //copyData(currentSquareBoard,copyOfSquareBoard) ;
            flag = true;
        }
        if (CurrentShape == 'j' && numberOfTheRotation == 0) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutJ0(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = true;
            return;
        }
        if (CurrentShape == 'j' && numberOfTheRotation == 1) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutJ1(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
                //copyData(currentSquareBoard,copyOfSquareBoard) ;
                flag = true;
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (CurrentShape == 'j' && numberOfTheRotation == 2) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutJ2(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            //copyData(currentSquareBoard,copyOfSquareBoard) ;
            flag = true;
        }
        if (CurrentShape == 'j' && numberOfTheRotation == 3) {

            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutJ3(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            //copyData(currentSquareBoard,copyOfSquareBoard) ;
            flag = true;
        }
        if (CurrentShape == 't' && numberOfTheRotation == 0) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutT0(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = true;
            return;
        }
        if (CurrentShape == 't' && numberOfTheRotation == 1) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutT1(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
                //copyData(currentSquareBoard,copyOfSquareBoard) ;
                flag = true;
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (CurrentShape == 't' && numberOfTheRotation == 2) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutT2(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            //copyData(currentSquareBoard,copyOfSquareBoard) ;
            flag = true;
        }
        if (CurrentShape == 't' && numberOfTheRotation == 3) {

            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutT3(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            //copyData(currentSquareBoard,copyOfSquareBoard) ;
            flag = true;
        }
        if (CurrentShape == 'i' && numberOfTheRotation == 0) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPuti0(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = true;
            return;
        }
        if (CurrentShape == 'i' && numberOfTheRotation == 1) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPuti1(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
                //copyData(currentSquareBoard,copyOfSquareBoard) ;
                flag = true;
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (CurrentShape == 'z' && numberOfTheRotation == 0) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutZ0(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = true;
            return;
        }
        if (CurrentShape == 'z' && numberOfTheRotation == 1) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutZ1(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
                //copyData(currentSquareBoard,copyOfSquareBoard) ;
                flag = true;
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (CurrentShape == 's' && numberOfTheRotation == 0) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutS0(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = true;
            return;
        }
        if (CurrentShape == 's' && numberOfTheRotation == 1) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPutS1(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
                //copyData(currentSquareBoard,copyOfSquareBoard) ;
                flag = true;
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (CurrentShape == 'o' && numberOfTheRotation == 0) {
            try {
                System.out.println("before : ");
                print(copyOfSquareBoard);
                checkTheShape = tryToPuto0(indexOfCurrentShape, copyOfSquareBoard);
                System.out.println("after : ");
                print(copyOfSquareBoard);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = true;
            return;
        }

    }

}
