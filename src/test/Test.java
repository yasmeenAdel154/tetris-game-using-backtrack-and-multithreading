package test;

import java.util.*;

/**
 *
 * @author yasmeen
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    static char entryPieces[] = new char[4];
    static int squareBoard[][] = new int[4][4];
//    static threads[] t = new threads[5];

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        long previousTime = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);

        System.out.print("please enter the pieces : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                squareBoard[i][j] = 0;
            }
        }

        for (int i = 0; i < 4; i++) {
            entryPieces[i] = input.next().charAt(0); // read the pieces
        }
        boolean x0 = startWith0();//o

        if (x0) {
            System.out.println("3aaaaaa4");
        } else {
            System.out.println("3aaaaaa4 bardo");

        }
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                System.out.print(squareBoard[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println();
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - previousTime;
        System.out.println(elapsedTime);

    }

    static boolean tryToPutZ(int indexOfCurrentShape, int[][] currentSquareBoard) throws InterruptedException {
        System.out.println("z");
       newThreads th1 = new newThreads ('z',0,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th2 = new newThreads ('z',1,indexOfCurrentShape,currentSquareBoard) ;
       Thread t1 = new Thread(th1) ;
       Thread t2 = new Thread(th2) ;

       t1.start(); t2.start();
       t1.join() ;
       t2.join() ;
        boolean t0 = th1.checkTheShape;

        if (t0) {
             copyData(currentSquareBoard,th1.copyOfSquareBoard) ;
            return true;
        }
        //else if (l0) return true ;
        boolean J1 = th2.checkTheShape;
        if (J1) {
            copyData(currentSquareBoard,th2.copyOfSquareBoard) ;
            return true;
        }
   
        // else if (l3) return true ;
        return false;
    }

    static boolean tryToPutS(int indexOfCurrentShape, int[][] currentSquareBoard) throws InterruptedException {
         newThreads th1 = new newThreads ('s',0,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th2 = new newThreads ('s',1,indexOfCurrentShape,currentSquareBoard) ;
       Thread t1 = new Thread(th1) ;
       Thread t2 = new Thread(th2) ;

       t1.start(); t2.start();
       t1.join() ;
       t2.join() ;
        boolean t0 = th1.checkTheShape;

        if (t0) {
             copyData(currentSquareBoard,th1.copyOfSquareBoard) ;
            return true;
        }
        //else if (l0) return true ;
        boolean J1 = th2.checkTheShape;
        if (J1) {
            copyData(currentSquareBoard,th2.copyOfSquareBoard) ;
            return true;
        }
   
        // else if (l3) return true ;
        return false;
    }

    static boolean tryToPutl(int indexOfCurrentShape,int currentSquareBoard[][]) throws InterruptedException {
        System.out.println("l");
        //int l0squareBoard[][] = new int [4][4] ;
        //copyData(l0squareBoard,currentSquareBoard);
        //boolean l0 = tryToPutl0(indexOfCurrentShape,currentSquareBoard);
       newThreads th1 = new newThreads ('l',0,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th2 = new newThreads ('l',1,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th3 = new newThreads ('l',2,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th4 = new newThreads ('l',3,indexOfCurrentShape,currentSquareBoard) ;
       Thread t1 = new Thread(th1) ;
       Thread t2 = new Thread(th2) ;
       Thread t3 = new Thread(th3) ;
       Thread t4 = new Thread(th4) ;
       t1.start(); t2.start();
       t1.join() ;
       t2.join() ;
       t3.start();t4.start();
       t3.join() ;
       t4.join() ;
       boolean l0 = th1.checkTheShape ;
        if (l0) {
            //selectTheShape(indexOfCurrentShape+1);
            System.out.println("valiiiiiiiiiiiiiid");
            //print(currentSquareBoard );
            //print(th1.copyOfSquareBoard);
            copyData(currentSquareBoard,th1.copyOfSquareBoard) ;
            return true;
        }
        //else if (l0) return true ;
       boolean l1 = th2.checkTheShape ;
        if (l1) {
           copyData(currentSquareBoard,th2.copyOfSquareBoard) ;
            return true;
        }
        //else if (l1) return true ;
       boolean l2 = th3.checkTheShape ;
        if (l2) {
            copyData(currentSquareBoard,th3.copyOfSquareBoard) ;
            return true;
        }
        //else if (l2) return true ;
        boolean l3 = th4.checkTheShape ;
        if (l3) {
            copyData(currentSquareBoard,th4.copyOfSquareBoard) ;
            return true;
        }
        // else if (l3) return true ;
        return false;
    }

    static boolean tryToPutJ(int indexOfCurrentShape , int currentSquareBoard[][]) throws InterruptedException {
        System.out.println("J");
        newThreads th1 = new newThreads ('j',0,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th2 = new newThreads ('j',1,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th3 = new newThreads ('j',2,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th4 = new newThreads ('j',3,indexOfCurrentShape,currentSquareBoard) ;
       Thread t1 = new Thread(th1) ;
       Thread t2 = new Thread(th2) ;
       Thread t3 = new Thread(th3) ;
       Thread t4 = new Thread(th4) ;
       t1.start(); t2.start();
       t1.join() ;
       t2.join() ;
       t3.start();t4.start();
       t3.join() ;
       t4.join() ;
        boolean J0 = th1.checkTheShape;

        if (J0) {
             copyData(currentSquareBoard,th1.copyOfSquareBoard) ;
            return true;
        }
        //else if (l0) return true ;
        boolean J1 = th2.checkTheShape;
        if (J1) {
            copyData(currentSquareBoard,th2.copyOfSquareBoard) ;
            return true;
        }
        //else if (l1) return true ;
        boolean J2 = th3.checkTheShape;
        if (J2) {
             copyData(currentSquareBoard,th3.copyOfSquareBoard) ;
            return true;
        }
        //else if (l2) return true ;
        boolean J3 = th4.checkTheShape;
        if (J3) {
            copyData(currentSquareBoard,th4.copyOfSquareBoard) ;
            return true;
        }
        // else if (l3) return true ;
        return false;
    }

    static boolean tryToPuti(int indexOfCurrentShape ,int currentSquareBoard[][]) throws InterruptedException {
        newThreads th1 = new newThreads ('i',0,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th2 = new newThreads ('i',1,indexOfCurrentShape,currentSquareBoard) ;
       Thread t1 = new Thread(th1) ;
       Thread t2 = new Thread(th2) ;

       t1.start(); t2.start();
       t1.join() ;
       t2.join() ;
        boolean t0 = th1.checkTheShape;

        if (t0) {
             copyData(currentSquareBoard,th1.copyOfSquareBoard) ;
            return true;
        }
        //else if (l0) return true ;
        boolean J1 = th2.checkTheShape;
        if (J1) {
            copyData(currentSquareBoard,th2.copyOfSquareBoard) ;
            return true;
        }
   
        // else if (l3) return true ;
        return false;
    }

    static boolean tryToPuto(int indexOfCurrentShape, int[][] currentSquareBoard) throws InterruptedException {
        newThreads th1 = new newThreads ('i',0,indexOfCurrentShape,currentSquareBoard) ;
       Thread t1 = new Thread(th1) ;

       t1.start(); 
       t1.join() ;
        boolean t0 = th1.checkTheShape;

        if (t0) {
             copyData(currentSquareBoard,th1.copyOfSquareBoard) ;
            return true;
        }
   
        // else if (l3) return true ;
        return false;
    }

    static boolean tryToPutT(int indexOfCurrentShape,int currentSquareBoard[][]) throws InterruptedException {
        System.out.println("T");
        newThreads th1 = new newThreads ('t',0,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th2 = new newThreads ('t',1,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th3 = new newThreads ('t',2,indexOfCurrentShape,currentSquareBoard) ;
       newThreads th4 = new newThreads ('t',3,indexOfCurrentShape,currentSquareBoard) ;
       Thread t1 = new Thread(th1) ;
       Thread t2 = new Thread(th2) ;
       Thread t3 = new Thread(th3) ;
       Thread t4 = new Thread(th4) ;
       t1.start(); t2.start();
       t1.join() ;
       t2.join() ;
       t3.start();t4.start();
       t3.join() ;
       t4.join() ;
        boolean t0 = th1.checkTheShape;

        if (t0) {
             copyData(currentSquareBoard,th1.copyOfSquareBoard) ;
            return true;
        }
        //else if (l0) return true ;
        boolean J1 = th2.checkTheShape;
        if (J1) {
            copyData(currentSquareBoard,th2.copyOfSquareBoard) ;
            return true;
        }
        //else if (l1) return true ;
        boolean J2 = th3.checkTheShape;
        if (J2) {
             copyData(currentSquareBoard,th3.copyOfSquareBoard) ;
            return true;
        }
        //else if (l2) return true ;
        boolean J3 = th4.checkTheShape;
        if (J3) {
            copyData(currentSquareBoard,th4.copyOfSquareBoard) ;
            return true;
        }
        // else if (l3) return true ;
        return false;
    }

    public static boolean tryToPuto0(int indexOfCurrentShape, int o0squareBoard [][]) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int checkTheSquareBoard = (o0squareBoard[i][j] | o0squareBoard[i][j + 1]
                        | o0squareBoard[i + 1][j] | o0squareBoard[i + 1][j + 1]);
                if (checkTheSquareBoard > 0) {
                    System.out.println("invalid o " + i + " " + j);
                    continue;
                }
                System.out.println("valid o " + i + " " + j);
      
                   o0squareBoard[i][j] = indexOfCurrentShape + 1;
                    o0squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                   o0squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                    o0squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;


                System.out.println("valid try " + " " + " " + indexOfCurrentShape);
                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , o0squareBoard);
                    if (!checkTheShape) {
                            o0squareBoard[i][j] = 0;
                            o0squareBoard[i][j + 1] = 0;
                            o0squareBoard[i + 1][j] = 0;
                            o0squareBoard[i + 1][j + 1] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }
        return false;
    }

     static public boolean tryToPutZ0(int indexOfCurrentShape , int z0squareBoard [][] ) throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                int checkTheSquareBoard = (z0squareBoard[i][j] | z0squareBoard[i][j + 1]
                        | z0squareBoard[i + 1][j + 1] | z0squareBoard[i + 1][j + 2]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }
                    z0squareBoard[i][j] = indexOfCurrentShape + 1;
                    z0squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                    z0squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                    z0squareBoard[i + 1][j + 2] = indexOfCurrentShape + 1;
                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , z0squareBoard);
                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {

                            z0squareBoard[i][j] = 0;
                            z0squareBoard[i][j + 1] = 0;
                            z0squareBoard[i + 1][j + 1] = 0;
                            z0squareBoard[i + 1][j + 2] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }

        return false;
    }

      static public boolean tryToPutZ1(int indexOfCurrentShape, int z1squareBoard [][]) throws InterruptedException {

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 3; j++) {
                int checkTheSquareBoard = (z1squareBoard[i][j + 1] | z1squareBoard[i + 1][j]
                        | z1squareBoard[i + 1][j + 1] | z1squareBoard[i + 2][j]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }
                    z1squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                    z1squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                    z1squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                    z1squareBoard[i + 2][j] = indexOfCurrentShape + 1;


                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , z1squareBoard);
                    // checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {

                            z1squareBoard[i][j + 1] = 0;
                            z1squareBoard[i + 1][j] = 0;
                            z1squareBoard[i + 1][j + 1] = 0;
                            z1squareBoard[i + 2][j] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }

        return false;
    }

    static public boolean tryToPuti0(int indexOfCurrentShape, int i0squareBoard [][]) throws InterruptedException {
        
        boolean checkTheShape = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                int checkTheSquareBoard = (i0squareBoard[i][j] | i0squareBoard[i][j + 1]
                        | i0squareBoard[i][j + 2] | i0squareBoard[i][j + 3]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }
                System.out.println("put i suc ");

                    i0squareBoard[i][j] = indexOfCurrentShape + 1;
                   i0squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                    i0squareBoard[i][j + 2] = indexOfCurrentShape + 1;
                    i0squareBoard[i][j + 3] = indexOfCurrentShape + 1;


                System.out.println("put i suc ");

                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , i0squareBoard);
                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {
        
                            i0squareBoard[i][j] = 0;
                            i0squareBoard[i][j + 1] = 0;
                            i0squareBoard[i][j + 2] = 0;
                            i0squareBoard[i][j + 3] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }

        }

        return false;
    }

    static public boolean tryToPuti1(int indexOfCurrentShape, int i1squareBoard [][]) throws InterruptedException {
        
        boolean checkTheShape = false;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                int checkTheSquareBoard = (i1squareBoard[i][j] | i1squareBoard[i + 1][j]
                        | i1squareBoard[i + 2][j] | i1squareBoard[i + 3][j]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }

                    i1squareBoard[i][j] = indexOfCurrentShape + 1;
                    i1squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                    i1squareBoard[i + 2][j] = indexOfCurrentShape + 1;
                    i1squareBoard[i + 3][j] = indexOfCurrentShape + 1;


                System.out.println("put i suc ");

                if (indexOfCurrentShape < 3) {

                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , i1squareBoard);

                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {

                            i1squareBoard[i][j] = 0;
                            i1squareBoard[i + 1][j] = 0;
                            i1squareBoard[i + 2][j] = 0;
                            i1squareBoard[i + 3][j] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }

        return false;
    }

    static public boolean tryToPutl0(int indexOfCurrentShape , int l0squareBoard [][]) throws InterruptedException {
        System.out.println("l0");
        //print(l0squareBoard) ;
        boolean checkTheShape = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int checkTheSquareBoard = (l0squareBoard[i][j] | l0squareBoard[i + 1][j]
                        | l0squareBoard[i + 2][j] | l0squareBoard[i + 2][j + 1]);
                if (checkTheSquareBoard > 0) {
                    continue;
                }
                
                    l0squareBoard[i][j] = indexOfCurrentShape + 1;
                    l0squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                    l0squareBoard[i + 2][j] = indexOfCurrentShape + 1;
                    l0squareBoard[i + 2][j + 1] = indexOfCurrentShape + 1;

           //     print(l0squareBoard) ;
                //System.out.println("valid try " + " " + entryPieces[indexOfCurrentShape + 1] + " " + indexOfCurrentShape);
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , l0squareBoard);
                    if (!checkTheShape) {
                        
                            l0squareBoard[i][j] = 0;
                            l0squareBoard[i + 1][j] = 0;
                            l0squareBoard[i + 2][j] = 0;
                            l0squareBoard[i + 2][j + 1] = 0;
              //              print(l0squareBoard) ;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }

        System.out.println("invalid l0");
        return false;
    }

    static public boolean tryToPutl1(int indexOfCurrentShape, int l1squareBoard[][]) throws InterruptedException {
        System.out.println("l1");
       //print(l1squareBoard) ;
        System.out.println("l1" + " index is : " + indexOfCurrentShape);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                //System.out.println("in loop valid try " + entryPieces[indexOfCurrentShape + 1] + i + " " + j);
                int checkTheSquareBoard = (l1squareBoard[i][j + 2] |l1squareBoard[i + 1][j]
                        | l1squareBoard[i + 1][j + 1] | l1squareBoard[i + 1][j + 2]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }
                //System.out.println("valid try " + entryPieces[indexOfCurrentShape + 1]);
                    l1squareBoard[i][j + 2] = indexOfCurrentShape + 1;
                    l1squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                    l1squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                    l1squareBoard[i + 1][j + 2] = indexOfCurrentShape + 1;

          //         print(l1squareBoard) ;

                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                checkTheShape= selectTheShape( indexOfCurrentShape+1 , l1squareBoard);

                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {
                            l1squareBoard[i][j + 2] = 0;
                            l1squareBoard[i + 1][j] = 0;
                            l1squareBoard[i + 1][j + 1] = 0;
                            l1squareBoard[i + 1][j + 2] = 0;

             //              print(l1squareBoard) ;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }

        }
        System.out.println("invalid l1");
        return false;

    }

    static public boolean tryToPutl2(int indexOfCurrentShape, int l2squareBoard [][]) throws InterruptedException {
         //print(l2squareBoard) ;
        System.out.println("l2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int checkTheSquareBoard = (l2squareBoard[i][j] | l2squareBoard[i][j + 1]
                        | l2squareBoard[i + 1][j + 1] | l2squareBoard[i + 2][j + 1]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }
                    l2squareBoard[i][j] = indexOfCurrentShape + 1;
                    l2squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                    l2squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                    l2squareBoard[i + 2][j + 1] = indexOfCurrentShape + 1;

            //        print(l2squareBoard) ;
                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , l2squareBoard);
                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {

                            l2squareBoard[i][j] = 0;
                            l2squareBoard[i][j + 1] = 0;
                            l2squareBoard[i + 1][j + 1] = 0;
                            l2squareBoard[i + 2][j + 1] = 0;

               //             print(l2squareBoard) ;
                    } else {
                        return true;
                    }

                } else {
                    return true;
                }
            }

        }
        System.out.println("invalid l2");
        return false;
    }

    static public boolean tryToPutl3(int indexOfCurrentShape, int l3squareBoard[][]) throws InterruptedException {
    //    print(l3squareBoard) ;
        System.out.println("l3");

        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                int checkTheSquareBoard = (l3squareBoard[i][j] |l3squareBoard[i][j + 1]
                        | l3squareBoard[i][j + 2] | l3squareBoard[i + 1][j]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }
                    l3squareBoard[i][j] = indexOfCurrentShape + 1;
                    l3squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                    l3squareBoard[i][j + 2] = indexOfCurrentShape + 1;
                    l3squareBoard[i + 1][j] = indexOfCurrentShape + 1;

                  // print(l3squareBoard) ;
                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , l3squareBoard);
                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {
                            l3squareBoard[i][j] = 0;
                            l3squareBoard[i][j + 1] = 0;
                            l3squareBoard[i][j + 2] = 0;
                            l3squareBoard[i + 1][j] = 0;

                     //      print(l3squareBoard) ;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }

        }
        System.out.println("i can not with l3");
        return false;

    }

   public static boolean tryToPutT0(int indexOfCurrentShape, int t0squareBoard[][]) throws InterruptedException {
       
        System.out.println("T0");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                int checkTheSquareBoard = (t0squareBoard[i][j] | t0squareBoard[i][j + 1]
                        | t0squareBoard[i][j + 2] | t0squareBoard[i + 1][j + 1]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }

                    t0squareBoard[i][j] = indexOfCurrentShape + 1;
                    t0squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                    t0squareBoard[i][j + 2] = indexOfCurrentShape + 1;
                    t0squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;

                System.out.println();
                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , t0squareBoard);
                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {

                            t0squareBoard[i][j] = 0;
                            t0squareBoard[i][j + 1] = 0;
                            t0squareBoard[i][j + 2] = 0;
                            t0squareBoard[i + 1][j + 1] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }

        }
        System.out.println("i can not with l3");
        return false;

    }

    public static boolean tryToPutT1(int indexOfCurrentShape, int t1squareBoard[][]) throws InterruptedException {
        
        System.out.println("T1");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int checkTheSquareBoard = (t1squareBoard[i][j] | t1squareBoard[i + 1][j]
                        | t1squareBoard[i + 1][j + 1] | t1squareBoard[i + 2][j]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }
                   t1squareBoard[i][j] = indexOfCurrentShape + 1;
                    t1squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                    t1squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                    t1squareBoard[i + 2][j] = indexOfCurrentShape + 1;

                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , t1squareBoard);
                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {

                            t1squareBoard[i][j] = 0;
                            t1squareBoard[i + 1][j] = 0;
                            t1squareBoard[i + 1][j + 1] = 0;
                            t1squareBoard[i + 2][j] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }

        }
        System.out.println("i can not with l3");
        return false;

    }

    public static boolean tryToPutT2(int indexOfCurrentShape, int t2squareBoard[][]) throws InterruptedException {
      
        System.out.println("T2");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                int checkTheSquareBoard = ( t2squareBoard[i][j + 1] |  t2squareBoard[i + 1][j]
                        |  t2squareBoard[i + 1][j + 1] |  t2squareBoard[i + 1][j + 2]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }
    
                    t2squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                     t2squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                     t2squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                     t2squareBoard[i + 1][j + 2] = indexOfCurrentShape + 1;

                System.out.println();
                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , t2squareBoard);
                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {

                             t2squareBoard[i][j + 1] = 0;
                            t2squareBoard[i + 1][j] = 0;
                             t2squareBoard[i + 1][j + 1] = 0;
                             t2squareBoard[i + 1][j + 2] = 0;

                        for (int a = 0; a < 4; a++) {
                            for (int b = 0; b < 4; b++) {
                                System.out.print(squareBoard[a][b] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }

        }
        System.out.println("i can not with l3");
        return false;
    }

    public static boolean tryToPutT3(int indexOfCurrentShape, int t2squareBoard[][]) throws InterruptedException {
        
        System.out.println("T0");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int checkTheSquareBoard = (t2squareBoard[i][j + 1] | t2squareBoard[i + 1][j]
                        | t2squareBoard[i + 1][j + 1] | t2squareBoard[i + 2][j + 1]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }

                    t2squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                    t2squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                    t2squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                    t2squareBoard[i + 2][j + 1] = indexOfCurrentShape + 1;

                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                      checkTheShape= selectTheShape( indexOfCurrentShape+1 , t2squareBoard);
                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {

                            t2squareBoard[i][j + 1] = 0;
                            t2squareBoard[i + 1][j] = 0;
                           t2squareBoard[i + 1][j + 1] = 0;
                            t2squareBoard[i + 2][j + 1] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }

        }
        System.out.println("i can not with l3");
        return false;
    }

    public static boolean tryToPutS0(int indexOfCurrentShape, int s0squareBoard [][]) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                int checkTheSquareBoard = (s0squareBoard[i][j + 1] | s0squareBoard[i][j + 2]
                        | s0squareBoard[i + 1][j + 1] | s0squareBoard[i + 1][j]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }
                    s0squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                    s0squareBoard[i][j + 2] = indexOfCurrentShape + 1;
                    s0squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                    s0squareBoard[i + 1][j] = indexOfCurrentShape + 1;

                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                   checkTheShape= selectTheShape( indexOfCurrentShape+1 , s0squareBoard);
                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {

                           s0squareBoard[i][j + 1] = 0;
                            s0squareBoard[i][j + 2] = 0;
                            s0squareBoard[i + 1][j + 1] = 0;
                            s0squareBoard[i + 1][j] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }

        return false;
    }

    public static boolean tryToPutS1(int indexOfCurrentShape, int s1squareBoard [][]) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int checkTheSquareBoard = (s1squareBoard[i][j] | s1squareBoard[i + 2][j + 1]
                        | s1squareBoard[i + 1][j] | s1squareBoard[i + 1][j + 1]);
                if (checkTheSquareBoard >= 1) {
                    continue;
                }
                    s1squareBoard[i][j] = indexOfCurrentShape + 1;
                    s1squareBoard[i + 2][j + 1] = indexOfCurrentShape + 1;
                    s1squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                    s1squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                boolean checkTheShape = false;
                if (indexOfCurrentShape < 3) {
                   checkTheShape= selectTheShape( indexOfCurrentShape+1 , s1squareBoard);
                    //checkTheShape = selectTheShape(indexOfCurrentShape + 1);
                    if (!checkTheShape) {
                           s1squareBoard[i][j] = 0;
                           s1squareBoard[i + 2][j + 1] = 0;
                            s1squareBoard[i + 1][j] = 0;
                            s1squareBoard[i + 1][j + 1] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }

        return false;
    }

    public static boolean tryToPutJ0(int indexOfCurrentShape , int j2squareBoard [][] ) throws InterruptedException {
        System.out.println("J0");
        
        boolean checkTheShape = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                int checkTheSquareBoard = (j2squareBoard[i][j] | j2squareBoard[i + 1][j]
                        | j2squareBoard[i + 1][j + 2] | j2squareBoard[i + 1][j + 1]);
                if (checkTheSquareBoard > 0) {
                    continue;
                }
                
                    j2squareBoard[i][j] = indexOfCurrentShape + 1;
                    j2squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                    j2squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                    j2squareBoard[i + 1][j + 2] = indexOfCurrentShape + 1;
                

                //System.out.println("valid try " + " " + entryPieces[indexOfCurrentShape + 1] + " " + indexOfCurrentShape);
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , j2squareBoard);
                    if (!checkTheShape) {
                           j2squareBoard[i][j] = 0;
                            j2squareBoard[i + 1][j] = 0;
                            j2squareBoard[i + 1][j + 1] = 0;
                           j2squareBoard[i + 1][j + 2] = 0;

                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }

        System.out.println("invalid l0");
        return false;
    }

    public static boolean tryToPutJ1(int indexOfCurrentShape , int j1squareBoard [][]) throws InterruptedException {
        System.out.println("J1");
        
        boolean checkTheShape = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int checkTheSquareBoard = ( j1squareBoard[i][j + 1] |  j1squareBoard[i + 1][j + 1]
                        |  j1squareBoard[i + 2][j] | j1squareBoard[i + 2][j + 1]);
                if (checkTheSquareBoard > 0) {
                    continue;
                }

                    j1squareBoard[i][j + 1] = indexOfCurrentShape + 1;
                    j1squareBoard[i + 1][j + 1] = indexOfCurrentShape + 1;
                    j1squareBoard[i + 2][j] = indexOfCurrentShape + 1;
                    j1squareBoard[i + 2][j + 1] = indexOfCurrentShape + 1;
                
                //System.out.println("valid try " + " " + entryPieces[indexOfCurrentShape + 1] + " " + indexOfCurrentShape);
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , j1squareBoard);
                    if (!checkTheShape) {

                            j1squareBoard[i][j + 1] = 0;
                            j1squareBoard[i + 1][j + 1] = 0;
                           j1squareBoard[i + 2][j] = 0;
                           j1squareBoard[i + 2][j + 1] = 0;
                        
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }

        System.out.println("invalid l0");
        return false;
    }

    public static boolean tryToPutJ2(int indexOfCurrentShape, int j2squareBoard [][]) throws InterruptedException {
        System.out.println("J2");
        
        boolean checkTheShape = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                int checkTheSquareBoard = (j2squareBoard [i][j] | j2squareBoard [i + 1][j + 2]
                        | j2squareBoard [i][j + 1] | j2squareBoard [i][j + 2]);
                if (checkTheSquareBoard > 0) {
                    continue;
                }

                    j2squareBoard [i][j] = indexOfCurrentShape + 1;
                    j2squareBoard [i + 1][j + 2] = indexOfCurrentShape + 1;
                    j2squareBoard [i][j + 1] = indexOfCurrentShape + 1;
                    j2squareBoard [i][j + 2] = indexOfCurrentShape + 1;

 
                //System.out.println("valid try " + " " + entryPieces[indexOfCurrentShape + 1] + " " + indexOfCurrentShape);
                if (indexOfCurrentShape < 3) {
                     checkTheShape= selectTheShape( indexOfCurrentShape+1 , j2squareBoard);
                    if (!checkTheShape) {

                            j2squareBoard [i][j] = 0;
                            j2squareBoard [i + 1][j + 2] = 0;
                            j2squareBoard [i][j + 1] = 0;
                            j2squareBoard [i][j + 2] = 0;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }

        System.out.println("invalid l0");
        return false;
    }

    public static boolean tryToPutJ3(int indexOfCurrentShape, int j3squareBoard [][]) throws InterruptedException {
        System.out.println("J3");
        
        System.out.println("l0");
        boolean checkTheShape = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int checkTheSquareBoard = (j3squareBoard[i][j] | j3squareBoard[i + 1][j]
                        | j3squareBoard[i + 2][j] | j3squareBoard[i][j + 1]);
                if (checkTheSquareBoard > 0) {
                    continue;
                }

                    j3squareBoard[i][j] = indexOfCurrentShape + 1;
                    j3squareBoard[i + 1][j] = indexOfCurrentShape + 1;
                    j3squareBoard[i + 2][j] = indexOfCurrentShape + 1;
                    j3squareBoard[i][j + 1] = indexOfCurrentShape + 1;


                //System.out.println("valid try " + " " + entryPieces[indexOfCurrentShape + 1] + " " + indexOfCurrentShape);
                if (indexOfCurrentShape < 3) {
                    checkTheShape= selectTheShape( indexOfCurrentShape+1 , j3squareBoard);
                    if (!checkTheShape) {

                            j3squareBoard[i][j] = 0;
                            j3squareBoard[i + 1][j] = 0;
                            j3squareBoard[i + 2][j] = 0;
                            j3squareBoard[i][j + 1] = 0;

                        for (int a = 0; a < 4; a++) {
                            for (int b = 0; b < 4; b++) {
                                System.out.print(squareBoard[a][b] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }

            }

        }

        System.out.println("invalid l0");
        return false;
    }

    private static boolean startWith0() throws InterruptedException {
        return selectTheShape(0,squareBoard );

    }

    public static void swap(int i, int j) {
        char temp = entryPieces[i];
        entryPieces[i] = entryPieces[j];
        entryPieces[j] = temp;
    }

    public static boolean selectTheShape(int indexOfCurrentShape , int currentSquareBoard [][] ) throws InterruptedException {
        boolean checkTheSquareBoard = false;
        switch (entryPieces[indexOfCurrentShape]) {
            case 'l':
                System.out.println("ibrahimllll :"+indexOfCurrentShape);
                checkTheSquareBoard = tryToPutl(indexOfCurrentShape , currentSquareBoard  );
                break;
            case 'o':
                System.out.println("ibrahim2");
                checkTheSquareBoard = tryToPuto(indexOfCurrentShape, currentSquareBoard);
                System.out.println("ibrahim4");
                break;
            case 'i':
                System.out.println("ibrahim3" + " " + indexOfCurrentShape);
                checkTheSquareBoard = tryToPuti(indexOfCurrentShape, currentSquareBoard);
                break;
            case 'z':
                System.out.println("ibrahim4" + " " + indexOfCurrentShape);
                checkTheSquareBoard = tryToPutZ(indexOfCurrentShape, currentSquareBoard);
                break;
            case 't':
                System.out.println("ibrahim5" + " " + indexOfCurrentShape);
                checkTheSquareBoard = tryToPutT(indexOfCurrentShape, currentSquareBoard  );
                break;
            case 's':
                System.out.println("ibrahim6" + " " + indexOfCurrentShape);
                checkTheSquareBoard = tryToPutS(indexOfCurrentShape, currentSquareBoard);
                break;
            case 'j':
                System.out.println("ibrahim6" + " " + indexOfCurrentShape);
                checkTheSquareBoard = tryToPutJ(indexOfCurrentShape, currentSquareBoard);
                break;
            default:
            // code block
        }
        return checkTheSquareBoard;
    }

    synchronized static public void copyData(int to[][], int from[][]) {
        for (int i = 0 ; i<4 ; i++){
            for ( int j = 0 ; j<4 ; j++ ){
                to[i][j] = from[i][j] ;
            }
        }
    }
     synchronized static void print (int arr[][]){
         for ( int i = 0 ; i<4 ; i++ ){
             for ( int j=0 ; j < 4 ; j++){
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
         System.out.println();
     }
}
