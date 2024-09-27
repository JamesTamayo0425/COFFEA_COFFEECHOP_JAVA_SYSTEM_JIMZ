/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalsproject;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Vector;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author James
 */
public class BillingSystem1 extends javax.swing.JFrame {

    /**
     * Creates new form BillingSystem1
     */
    Color clkColor, white, red;

    public BillingSystem1() {
        initComponents();
        clkColor = new Color(76, 44, 23);
        white = new Color(255, 255, 255);
        red = new Color(242, 5, 5);

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(59);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(41);

        LocalDate date = LocalDate.now();
        UperDate.setText(String.valueOf(date));

        Price1 myprc1 = new Price1();
        myprc1.Prices();

        Price1 myprc2 = new Price2();
        myprc2.Prices();

        Price1 myprc3 = new Price3();
        myprc3.Prices();

        Price1 myprc4 = new Price4();
        myprc4.Prices();

        Price1 myprc5 = new Price5();
        myprc5.Prices();

        Price1 myprc6 = new Price6();
        myprc6.Prices();

        Price1 myprc7 = new Price7();
        myprc7.Prices();

        Price1 myprc8 = new Price8();
        myprc8.Prices();

        Price1 myprc9 = new Price9();
        myprc9.Prices();

        Price1 myprc10 = new Price10();
        myprc10.Prices();

        Price1 myprc11 = new Price11();
        myprc11.Prices();

        Price1 myprc12 = new Price12();
        myprc12.Prices();

        Price1 myprc13 = new Price13();
        myprc13.Prices();

        Price1 myprc14 = new Price14();
        myprc14.Prices();

        Price1 myprc15 = new Price15();
        myprc15.Prices();

        Price1 myprc16 = new Price16();
        myprc16.Prices();

        Price1 myprc17 = new Price17();
        myprc17.Prices();

        Price1 myprc18 = new Price18();
        myprc18.Prices();

        Price1 myprc19 = new Price19();
        myprc19.Prices();

        Price1 myprc20 = new Price20();
        myprc20.Prices();

        Price1 myprc21 = new Price21();
        myprc21.Prices();

        Price1 myprc22 = new Price22();
        myprc22.Prices();

        Price1 myprc23 = new Price23();
        myprc23.Prices();

        Price1 myprc24 = new Price24();
        myprc24.Prices();

        Price1 myprc25 = new Price25();
        myprc25.Prices();

        Price1 myprc26 = new Price26();
        myprc26.Prices();

        Price1 myprc27 = new Price27();
        myprc27.Prices();

        Price1 myprc28 = new Price28();
        myprc28.Prices();

        Price1 myprc29 = new Price29();
        myprc29.Prices();

        Price1 myprc30 = new Price30();
        myprc30.Prices();
    }

    class Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Americano'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc1.setText(String.valueOf(transPrice));
                stk1.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

    class Price2 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Black Coffee'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc2.setText(String.valueOf(transPrice));
                stk2.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price3 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Cappuccino'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc3.setText(String.valueOf(transPrice));
                stk3.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price4 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Espresso'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc4.setText(String.valueOf(transPrice));
                stk4.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price5 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Macchiato'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc5.setText(String.valueOf(transPrice));
                stk5.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price6 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Affogato(S)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc6.setText(String.valueOf(transPrice));
                SccStk1.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price7 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Ice Americano(S)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc7.setText(String.valueOf(transPrice));
                SccStk2.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price8 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Ice Mocha(S)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc8.setText(String.valueOf(transPrice));
                SccStk3.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price9 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Ice Black(S)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc9.setText(String.valueOf(transPrice));
                SccStk4.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price10 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Ice Latte(S)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc10.setText(String.valueOf(transPrice));
                SccStk5.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price11 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Affogato(M)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc11.setText(String.valueOf(transPrice));
                MccStk1.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price12 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Ice Americano(M)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc12.setText(String.valueOf(transPrice));
                MccStk2.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price13 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Ice Mocha(M)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc13.setText(String.valueOf(transPrice));
                MccStk3.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price14 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Ice Black(M)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc14.setText(String.valueOf(transPrice));
                MccStk4.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price15 extends Price1 {

        public void Prices() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Ice Latte(M)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc15.setText(String.valueOf(transPrice));
                MccStk5.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price16 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Dark Choco(S)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc16.setText(String.valueOf(transPrice));
                SmtStk1.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price17 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Hokaido(S)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc17.setText(String.valueOf(transPrice));
                SmtStk2.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price18 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Matcha(S)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc18.setText(String.valueOf(transPrice));
                SmtStk3.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price19 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Okinawa(S)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc19.setText(String.valueOf(transPrice));
                SmtStk4.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price20 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Wintermelon(S)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc20.setText(String.valueOf(transPrice));
                SmtStk5.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price21 extends Price1 {

        public void Prices() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Dark Choco(M)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc21.setText(String.valueOf(transPrice));
                MmtStk1.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price22 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Hokaido(M)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc22.setText(String.valueOf(transPrice));
                MmtStk2.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price23 extends Price1 {

        public void Prices() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Matcha(M)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc23.setText(String.valueOf(transPrice));
                MmtStk3.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price24 extends Price1 {

        public void Prices() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Okinawa(M)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc24.setText(String.valueOf(transPrice));
                MmtStk4.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price25 extends Price1 {

        public void Prices() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Wintermelon(M)'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc25.setText(String.valueOf(transPrice));
                MmtStk5.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price26 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Caramel'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc26.setText(String.valueOf(transPrice));
                frStk1.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price27 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Choco Blast'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc27.setText(String.valueOf(transPrice));
                frStk2.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price28 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Matcha Green'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc28.setText(String.valueOf(transPrice));
                frStk3.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price29 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Mocha'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc29.setText(String.valueOf(transPrice));
                frStk4.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    class Price30 extends Price1 {

        public void Prices() {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryProd = "SELECT * FROM `product` WHERE Name = 'Strawberry Creme'";
                statement.execute(qryProd);
                String transPrice = "1234", transStocks = "1234";
                ResultSet rsProd = statement.executeQuery(qryProd);
                while (rsProd.next()) {
                    transPrice = rsProd.getString("Price");
                    transStocks = rsProd.getString("Stocks");
                }
                prc30.setText(String.valueOf(transPrice));
                frStk5.setText(String.valueOf(transStocks));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }

    public void updateStk() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
            Statement statement = connection.createStatement();
            String prodName = "1234", prodStk = "1234";
            for (int row = 0; row < jTable1.getRowCount(); row++) {

                prodName = String.valueOf(jTable1.getValueAt(row, 0));
                prodStk = String.valueOf(jTable1.getValueAt(row, 2));

                String getProd = "SELECT * FROM `product` WHERE Name = '" + prodName + "'";
                statement.execute(getProd);
                String transProd = "12345";
                ResultSet rsProd = statement.executeQuery(getProd);
                while (rsProd.next()) {
                    transProd = rsProd.getString("Stocks");
                }

                int stk1 = Integer.valueOf(prodStk);
                int stk2 = Integer.valueOf(transProd);
                int BwasStk = stk2 - stk1;

                String qryProd = "UPDATE `product` SET `Stocks`='" + BwasStk + "' WHERE Name = '" + prodName + "'";
                statement.execute(qryProd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }

    }

    public void addtables(String Item, Float Price, int Qty, Float Total) {

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();

        DecimalFormat df = new DecimalFormat("00.00");
        Float totPrice = Price * Float.valueOf(Qty);

        String TotalPrice = df.format(totPrice);
        String PriceF = df.format(Price);

        for (int row = 0; row < jTable1.getRowCount(); row++) {
            if (Item.equals(jTable1.getValueAt(row, 0))) {
                dt.removeRow(jTable1.convertRowIndexToModel(row));
            }
        }

        Vector v = new Vector();
        v.add(Item);
        v.add(PriceF);
        v.add(Qty);
        v.add(TotalPrice);
        dt.addRow(v);
    }

    public void cal() {

        Float totT = 0.00f;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            Float value = Float.valueOf(jTable1.getValueAt(i, 3).toString());
            totT += value;
        }
        Float dis = 0.00f;
        if (discount.getSelectedItem().equals("PWD 15%")) {
            dis = 0.15f;
        } else if (discount.getSelectedItem().equals("Senior 10%")) {
            dis = 0.10f;
        } else if (discount.getSelectedItem().equals("Student 5%")) {
            dis = 0.05f;
        } else {
            dis = 0.00f;
        }
        Float DIS = totT * dis;
        totT -= DIS;
        DecimalFormat df = new DecimalFormat("00.00");
        tot.setText(df.format(totT));
        T_R.setSelectedIndex(0);
    }

    public void Del() {
        DefaultTableModel remove = (DefaultTableModel) jTable1.getModel();

        for (int row = 0; row < jTable1.getRowCount(); row++) {
            int delRow = Integer.valueOf(jTable1.getValueAt(row, 2).toString());
            String delName = String.valueOf(jTable1.getValueAt(row, 0).toString());
            if (delRow <= 0) {
                remove.removeRow(jTable1.convertRowIndexToModel(row));
            }
            int maxStock = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                Statement statement = connection.createStatement();

                String qryName = "SELECT * FROM `product` WHERE Name = '" + delName + "'";
                statement.execute(qryName);

                String SmaxStock = "1234";
                ResultSet rsProd = statement.executeQuery(qryName);
                while (rsProd.next()) {
                    SmaxStock = rsProd.getString("Stocks");
                }
                maxStock = Integer.valueOf(SmaxStock);

            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }

            if (delRow > maxStock) {
                remove.removeRow(jTable1.convertRowIndexToModel(row));
            }
        }
    }

    /*  public void transac() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
            Statement statement = connection.createStatement();

            String qryProd = "SELECT * FROM `transaction` ORDER BY TransactionID DESC LIMIT 1";
            statement.execute(qryProd);
            String transac = "1234";
            ResultSet rstransac = statement.executeQuery(qryProd);
            while (rstransac.next()) {
                //    transPrice = rstransac.getString("TransactionId");
            }
            // prc11.setText(String.valueOf(transPrice));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }*/
    public void reset() {
        qty1.setText("0");
        qty4.setText("0");
        qty3.setText("0");
        qty5.setText("0");
        qty2.setText("0");
        SccQty1.setText("0");
        SccQty2.setText("0");
        SccQty3.setText("0");
        SccQty4.setText("0");
        SccQty5.setText("0");
        MccQty1.setText("0");
        MccQty2.setText("0");
        MccQty3.setText("0");
        MccQty4.setText("0");
        MccQty5.setText("0");
        SmtQty1.setText("0");
        SmtQty2.setText("0");
        SmtQty3.setText("0");
        SmtQty4.setText("0");
        SmtQty5.setText("0");
        MmtQty1.setText("0");
        MmtQty2.setText("0");
        MmtQty3.setText("0");
        MmtQty4.setText("0");
        MmtQty5.setText("0");
        frQty1.setText("0");
        frQty2.setText("0");
        frQty3.setText("0");
        frQty4.setText("0");
        frQty5.setText("0");
        tot.setText("00");
        cash.setText("");
        chnge.setText("00");
        discount.setSelectedIndex(0);
        paymentMethod.setSelectedIndex(0);
    }

    public void selectedDel(String delRows) {

        switch (delRows) {

            case "Americano":
                Price1 myprc1 = new Price1();
                myprc1.Prices();
                qty1.setText("0");
                break;

            case "Espresso":
                Price1 myprc4 = new Price4();
                myprc4.Prices();
                qty4.setText("0");
                break;

            case "Cappuccino":
                Price1 myprc3 = new Price3();
                myprc3.Prices();
                qty3.setText("0");
                break;

            case "Macchiato":
                Price1 myprc5 = new Price5();
                myprc5.Prices();
                qty5.setText("0");
                break;

            case "Black Coffee":
                Price1 myprc2 = new Price2();
                myprc2.Prices();
                qty2.setText("0");
                break;

            case "Affogato(S)":
                Price1 myprc6 = new Price6();
                myprc6.Prices();
                SccQty1.setText("0");
                break;

            case "Ice Americano(S)":
                Price1 myprc7 = new Price7();
                myprc7.Prices();
                SccQty2.setText("0");
                break;

            case "Ice Mocha(S)":
                Price1 myprc8 = new Price8();
                myprc8.Prices();
                SccQty3.setText("0");
                break;

            case "Ice Black(S)":
                Price1 myprc9 = new Price9();
                myprc9.Prices();
                SccQty4.setText("0");
                break;

            case "Ice Latte(S)":
                Price1 myprc10 = new Price10();
                myprc10.Prices();
                SccQty5.setText("0");
                break;

            case "Affogato(M)":
                Price1 myprc11 = new Price11();
                myprc11.Prices();
                MccQty1.setText("0");
                break;

            case "Ice Americano(M)":
                Price1 myprc12 = new Price12();
                myprc12.Prices();
                MccQty2.setText("0");
                break;

            case "Ice Mocha(M)":
                Price1 myprc13 = new Price13();
                myprc13.Prices();
                MccQty3.setText("0");
                break;

            case "Ice Black(M)":
                Price1 myprc14 = new Price14();
                myprc14.Prices();
                MccQty4.setText("0");
                break;

            case "Ice Latte(M)":
                Price1 myprc15 = new Price15();
                myprc15.Prices();
                MccQty5.setText("0");
                break;

            case "Dark Choco(S)":
                Price1 myprc16 = new Price16();
                myprc16.Prices();
                SmtQty1.setText("0");
                break;

            case "Hokaido(S)":
                Price1 myprc17 = new Price17();
                myprc17.Prices();
                SmtQty2.setText("0");
                break;

            case "Matcha(S)":
                Price1 myprc18 = new Price18();
                myprc18.Prices();
                SmtQty3.setText("0");
                break;

            case "Okinawa(S)":
                Price1 myprc19 = new Price19();
                myprc19.Prices();
                SmtQty4.setText("0");
                break;

            case "Wintermelon(S)":
                Price1 myprc20 = new Price20();
                myprc20.Prices();
                SmtQty5.setText("0");
                break;

            case "Dark Choco(M)":
                Price1 myprc21 = new Price21();
                myprc21.Prices();
                MmtQty1.setText("0");
                break;

            case "Hokaido(M)":
                Price1 myprc22 = new Price22();
                myprc22.Prices();
                MmtQty2.setText("0");
                break;

            case "Matcha(M)":
                Price1 myprc23 = new Price23();
                myprc23.Prices();
                MmtQty3.setText("0");
                break;

            case "Okinawa(M)":
                Price1 myprc24 = new Price24();
                myprc24.Prices();
                MmtQty4.setText("0");
                break;

            case "Wintermelon(M)":
                Price1 myprc25 = new Price25();
                myprc25.Prices();
                MmtQty5.setText("0");
                break;

            case "Caramel":
                Price1 myprc26 = new Price26();
                myprc26.Prices();
                frQty1.setText("0");
                break;

            case "Choco Blast":
                Price1 myprc27 = new Price27();
                myprc27.Prices();
                frQty2.setText("0");
                break;

            case "Matcha Green":
                Price1 myprc28 = new Price28();
                myprc28.Prices();
                frQty3.setText("0");
                break;

            case "Mocha":
                Price1 myprc29 = new Price29();
                myprc29.Prices();
                frQty4.setText("0");
                break;

            case "Strawberry Creme":
                Price1 myprc30 = new Price30();
                myprc30.Prices();
                frQty5.setText("0");
                break;

            default:
                System.out.println("Item not Found");
        }
    }

    public void orderRecord(String transProductID, String transPrice, String transQuantity) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
            Statement statement = connection.createStatement();

            String qryProd = "SELECT * FROM `product` WHERE Name = '" + transProductID + "'";
            statement.execute(qryProd);

            ResultSet rsProd = statement.executeQuery(qryProd);
            while (rsProd.next()) {
                transProductID = rsProd.getString("ProductID");

            }

            String qryOrder = "SELECT * FROM `order` ORDER BY OrderID DESC LIMIT 1";
            statement.execute(qryOrder);
            String transOrderID = "qwert";
            ResultSet rsOrder = statement.executeQuery(qryOrder);
            while (rsOrder.next()) {
                transOrderID = rsOrder.getString("OrderID");
            }

            String qry = "INSERT INTO `orderitem`(`ProductID`, `Price`, `Qty`, `OrderID`)"
                    + "VALUES('" + transProductID + "' , '" + transPrice + "', '" + transQuantity + "', '" + transOrderID + "')";

            statement.execute(qry);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }

    public void orderRecordB(String TotPrice, String Paid) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
            Statement smt = con.createStatement();

            String qry = "INSERT INTO `order`(`TotalPrice`, `PaymentStatus`) "
                    + "VALUES('" + TotPrice + "', '" + Paid + "')";

            smt.execute(qry);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }

    public void Transaction(String transPyMtod, String transDiscountAmount, String TotalPayment, String EmployeeID, String Amounttendered, String Change) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
            Statement smt = con.createStatement();

            String qryOrder = "SELECT * FROM `order` ORDER BY OrderID DESC LIMIT 1";
            smt.execute(qryOrder);
            String transOrderID = "qwert";
            ResultSet rsOrder = smt.executeQuery(qryOrder);
            while (rsOrder.next()) {
                transOrderID = rsOrder.getString("OrderID");
            }
            String emplo = String.valueOf(cashier.getText());
            String qryCashier = "SELECT * FROM `employee` WHERE GivenName = '" + emplo + "'";
            smt.execute(qryCashier);
            String transEmplo = "12345";
            ResultSet rsEmplo = smt.executeQuery(qryCashier);
            while (rsEmplo.next()) {
                transEmplo = rsEmplo.getString("EmployeeID");
            }

            String qry = "INSERT INTO `transaction`(`OrderID`, `PaymentMethod`, `DiscountAmount`, `TotalPayment`, `EmployeeID`, `Amounttendered`, `Change`)"
                    + "VALUES('" + transOrderID + "', '" + transPyMtod + "', '" + transDiscountAmount + "', '" + TotalPayment + "', '" + transEmplo + "', '" + Amounttendered + "', '" + Change + "')";

            smt.execute(qry);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        tblP = new javax.swing.JPanel();
        tbl = new javax.swing.JLabel();
        rcptP = new javax.swing.JPanel();
        rcpt = new javax.swing.JLabel();
        T_R = new javax.swing.JTabbedPane();
        jPanel42 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel43 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rc = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        n7P = new javax.swing.JPanel();
        n7 = new javax.swing.JLabel();
        n8P = new javax.swing.JPanel();
        n8 = new javax.swing.JLabel();
        n9P = new javax.swing.JPanel();
        n9 = new javax.swing.JLabel();
        n6P = new javax.swing.JPanel();
        n6 = new javax.swing.JLabel();
        n5P = new javax.swing.JPanel();
        n5 = new javax.swing.JLabel();
        n4P = new javax.swing.JPanel();
        n4 = new javax.swing.JLabel();
        n1P = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        n2P = new javax.swing.JPanel();
        n2 = new javax.swing.JLabel();
        n3P = new javax.swing.JPanel();
        n3 = new javax.swing.JLabel();
        delP = new javax.swing.JPanel();
        del = new javax.swing.JLabel();
        n0P = new javax.swing.JPanel();
        n0 = new javax.swing.JLabel();
        clrP = new javax.swing.JPanel();
        clr = new javax.swing.JLabel();
        UperDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        tot = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        cash = new javax.swing.JTextField();
        discount = new javax.swing.JComboBox<>();
        jPanel32 = new javax.swing.JPanel();
        chnge = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        paymentMethod = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cashier = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        hcP = new javax.swing.JPanel();
        hc = new javax.swing.JLabel();
        ccP = new javax.swing.JPanel();
        cc = new javax.swing.JLabel();
        mtP = new javax.swing.JPanel();
        mt = new javax.swing.JLabel();
        frP = new javax.swing.JPanel();
        fr = new javax.swing.JLabel();
        wel = new javax.swing.JLabel();
        emploImg = new javax.swing.JLabel();
        loP = new javax.swing.JPanel();
        lo = new javax.swing.JLabel();
        histP = new javax.swing.JPanel();
        hist = new javax.swing.JLabel();
        cate = new javax.swing.JTabbedPane();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel52 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        min2 = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        stk2 = new javax.swing.JLabel();
        qty2 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        prc2 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        min1 = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        stk1 = new javax.swing.JLabel();
        qty1 = new javax.swing.JButton();
        prc1 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        min3 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        stk3 = new javax.swing.JLabel();
        qty3 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        prc3 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        min4 = new javax.swing.JButton();
        add4 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        stk4 = new javax.swing.JLabel();
        qty4 = new javax.swing.JButton();
        prc4 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        min5 = new javax.swing.JButton();
        add5 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        stk5 = new javax.swing.JLabel();
        qty5 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        prc5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        tblP1 = new javax.swing.JPanel();
        tbl1 = new javax.swing.JLabel();
        rcptP1 = new javax.swing.JPanel();
        rcpt1 = new javax.swing.JLabel();
        OptnSz = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel36 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        SccMin2 = new javax.swing.JButton();
        SccAdd2 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        SccStk2 = new javax.swing.JLabel();
        SccQty2 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        prc7 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        SccMin1 = new javax.swing.JButton();
        SccAdd1 = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        SccStk1 = new javax.swing.JLabel();
        SccQty1 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        prc6 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        SccMin3 = new javax.swing.JButton();
        SccAdd3 = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        SccStk3 = new javax.swing.JLabel();
        SccQty3 = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        prc8 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        SccMin4 = new javax.swing.JButton();
        SccAdd4 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        SccStk4 = new javax.swing.JLabel();
        SccQty4 = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        prc9 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        SccMin5 = new javax.swing.JButton();
        SccAdd5 = new javax.swing.JButton();
        jLabel108 = new javax.swing.JLabel();
        SccStk5 = new javax.swing.JLabel();
        SccQty5 = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        prc10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel38 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        MccMin2 = new javax.swing.JButton();
        MccAdd2 = new javax.swing.JButton();
        jLabel152 = new javax.swing.JLabel();
        MccStk2 = new javax.swing.JLabel();
        MccQty2 = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        prc12 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        MccMin1 = new javax.swing.JButton();
        MccAdd1 = new javax.swing.JButton();
        jLabel156 = new javax.swing.JLabel();
        MccStk1 = new javax.swing.JLabel();
        MccQty1 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        prc11 = new javax.swing.JLabel();
        jPanel83 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        MccMin3 = new javax.swing.JButton();
        MccAdd3 = new javax.swing.JButton();
        jLabel160 = new javax.swing.JLabel();
        MccStk3 = new javax.swing.JLabel();
        MccQty3 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        prc13 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jLabel162 = new javax.swing.JLabel();
        MccMin4 = new javax.swing.JButton();
        MccAdd4 = new javax.swing.JButton();
        jLabel164 = new javax.swing.JLabel();
        MccStk4 = new javax.swing.JLabel();
        MccQty4 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        prc14 = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        jLabel166 = new javax.swing.JLabel();
        MccMin5 = new javax.swing.JButton();
        MccAdd5 = new javax.swing.JButton();
        jLabel168 = new javax.swing.JLabel();
        MccStk5 = new javax.swing.JLabel();
        MccQty5 = new javax.swing.JButton();
        jLabel103 = new javax.swing.JLabel();
        prc15 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        tblP2 = new javax.swing.JPanel();
        tbl2 = new javax.swing.JLabel();
        rcptP3 = new javax.swing.JPanel();
        rcpt3 = new javax.swing.JLabel();
        OptnSz1 = new javax.swing.JTabbedPane();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel41 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        SmtMin1 = new javax.swing.JButton();
        SmtAdd1 = new javax.swing.JButton();
        jLabel153 = new javax.swing.JLabel();
        SmtStk1 = new javax.swing.JLabel();
        SmtQty1 = new javax.swing.JButton();
        prc16 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jPanel96 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        SmtMin2 = new javax.swing.JButton();
        SmtAdd2 = new javax.swing.JButton();
        jLabel190 = new javax.swing.JLabel();
        SmtStk2 = new javax.swing.JLabel();
        SmtQty2 = new javax.swing.JButton();
        prc17 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jPanel97 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        SmtMin3 = new javax.swing.JButton();
        SmtAdd3 = new javax.swing.JButton();
        jLabel191 = new javax.swing.JLabel();
        SmtStk3 = new javax.swing.JLabel();
        SmtQty3 = new javax.swing.JButton();
        prc18 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jPanel98 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        SmtMin4 = new javax.swing.JButton();
        SmtAdd4 = new javax.swing.JButton();
        jLabel192 = new javax.swing.JLabel();
        SmtStk4 = new javax.swing.JLabel();
        SmtQty4 = new javax.swing.JButton();
        prc19 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jPanel99 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        SmtMin5 = new javax.swing.JButton();
        SmtAdd5 = new javax.swing.JButton();
        jLabel193 = new javax.swing.JLabel();
        SmtStk5 = new javax.swing.JLabel();
        SmtQty5 = new javax.swing.JButton();
        prc20 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel44 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jLabel169 = new javax.swing.JLabel();
        MmtMin1 = new javax.swing.JButton();
        MmtAdd1 = new javax.swing.JButton();
        jLabel171 = new javax.swing.JLabel();
        MmtStk1 = new javax.swing.JLabel();
        MmtQty1 = new javax.swing.JButton();
        prc21 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        MmtMin2 = new javax.swing.JButton();
        MmtAdd2 = new javax.swing.JButton();
        jLabel177 = new javax.swing.JLabel();
        MmtStk2 = new javax.swing.JLabel();
        MmtQty2 = new javax.swing.JButton();
        prc22 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jPanel91 = new javax.swing.JPanel();
        jLabel178 = new javax.swing.JLabel();
        MmtMin3 = new javax.swing.JButton();
        MmtAdd3 = new javax.swing.JButton();
        jLabel180 = new javax.swing.JLabel();
        MmtStk3 = new javax.swing.JLabel();
        MmtQty3 = new javax.swing.JButton();
        prc23 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jPanel92 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        MmtMin4 = new javax.swing.JButton();
        MmtAdd4 = new javax.swing.JButton();
        jLabel183 = new javax.swing.JLabel();
        MmtStk4 = new javax.swing.JLabel();
        MmtQty4 = new javax.swing.JButton();
        prc24 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jPanel93 = new javax.swing.JPanel();
        jLabel184 = new javax.swing.JLabel();
        MmtMin5 = new javax.swing.JButton();
        MmtAdd5 = new javax.swing.JButton();
        jLabel186 = new javax.swing.JLabel();
        MmtStk5 = new javax.swing.JLabel();
        MmtQty5 = new javax.swing.JButton();
        prc25 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel40 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        frMin2 = new javax.swing.JButton();
        frAdd2 = new javax.swing.JButton();
        jLabel132 = new javax.swing.JLabel();
        frStk2 = new javax.swing.JLabel();
        frQty2 = new javax.swing.JButton();
        jLabel123 = new javax.swing.JLabel();
        prc27 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        frMin1 = new javax.swing.JButton();
        frAdd1 = new javax.swing.JButton();
        jLabel136 = new javax.swing.JLabel();
        frStk1 = new javax.swing.JLabel();
        frQty1 = new javax.swing.JButton();
        jLabel122 = new javax.swing.JLabel();
        prc26 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        frMin3 = new javax.swing.JButton();
        frAdd3 = new javax.swing.JButton();
        jLabel140 = new javax.swing.JLabel();
        frStk3 = new javax.swing.JLabel();
        frQty3 = new javax.swing.JButton();
        jLabel124 = new javax.swing.JLabel();
        prc28 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jLabel142 = new javax.swing.JLabel();
        frMin4 = new javax.swing.JButton();
        frAdd4 = new javax.swing.JButton();
        jLabel144 = new javax.swing.JLabel();
        frStk4 = new javax.swing.JLabel();
        frQty4 = new javax.swing.JButton();
        jLabel125 = new javax.swing.JLabel();
        prc29 = new javax.swing.JLabel();
        jPanel80 = new javax.swing.JPanel();
        jLabel146 = new javax.swing.JLabel();
        frMin5 = new javax.swing.JButton();
        frAdd5 = new javax.swing.JButton();
        jLabel148 = new javax.swing.JLabel();
        frStk5 = new javax.swing.JLabel();
        frQty5 = new javax.swing.JButton();
        jLabel126 = new javax.swing.JLabel();
        prc30 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(1368, 715));
        jPanel5.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1255, 625));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.gray));
        jPanel2.setPreferredSize(new java.awt.Dimension(555, 550));
        jPanel2.setLayout(null);

        jPanel24.setBackground(new java.awt.Color(142, 118, 55));
        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jPanel24.setPreferredSize(new java.awt.Dimension(525, 155));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23), 2));
        jPanel7.setPreferredSize(new java.awt.Dimension(260, 310));
        jPanel7.setLayout(null);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23), 2));
        jPanel34.setPreferredSize(new java.awt.Dimension(464, 45));

        tblP.setBackground(new java.awt.Color(76, 44, 23));
        tblP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        tbl.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        tbl.setForeground(new java.awt.Color(255, 255, 255));
        tbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tbl.setText("TABLE");
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout tblPLayout = new javax.swing.GroupLayout(tblP);
        tblP.setLayout(tblPLayout);
        tblPLayout.setHorizontalGroup(
            tblPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tblPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbl, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        tblPLayout.setVerticalGroup(
            tblPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        rcptP.setBackground(new java.awt.Color(255, 255, 255));
        rcptP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));
        rcptP.setPreferredSize(new java.awt.Dimension(90, 25));

        rcpt.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        rcpt.setForeground(new java.awt.Color(76, 44, 23));
        rcpt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rcpt.setText("RECIEPT");
        rcpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rcptMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rcptMousePressed(evt);
            }
        });

        javax.swing.GroupLayout rcptPLayout = new javax.swing.GroupLayout(rcptP);
        rcptP.setLayout(rcptPLayout);
        rcptPLayout.setHorizontalGroup(
            rcptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rcptPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rcpt, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        rcptPLayout.setVerticalGroup(
            rcptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rcpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tblP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(rcptP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tblP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rcptP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel34);
        jPanel34.setBounds(0, 0, 260, 45);

        T_R.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23), 2));
        T_R.setPreferredSize(new java.awt.Dimension(260, 310));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        T_R.addTab("tab1", jPanel42);

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));

        rc.setColumns(20);
        rc.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        rc.setRows(5);
        jScrollPane2.setViewportView(rc);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        T_R.addTab("tab2", jPanel43);

        jPanel7.add(T_R);
        T_R.setBounds(0, 0, 260, 310);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23), 2));

        n7P.setBackground(new java.awt.Color(255, 255, 255));
        n7P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        n7.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        n7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n7.setText("7");
        n7.setPreferredSize(new java.awt.Dimension(16, 16));
        n7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout n7PLayout = new javax.swing.GroupLayout(n7P);
        n7P.setLayout(n7PLayout);
        n7PLayout.setHorizontalGroup(
            n7PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        n7PLayout.setVerticalGroup(
            n7PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        n8P.setBackground(new java.awt.Color(255, 255, 255));
        n8P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        n8.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        n8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n8.setText("8");
        n8.setPreferredSize(new java.awt.Dimension(16, 16));
        n8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout n8PLayout = new javax.swing.GroupLayout(n8P);
        n8P.setLayout(n8PLayout);
        n8PLayout.setHorizontalGroup(
            n8PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        n8PLayout.setVerticalGroup(
            n8PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        n9P.setBackground(new java.awt.Color(255, 255, 255));
        n9P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        n9.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        n9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n9.setText("9");
        n9.setPreferredSize(new java.awt.Dimension(16, 16));
        n9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout n9PLayout = new javax.swing.GroupLayout(n9P);
        n9P.setLayout(n9PLayout);
        n9PLayout.setHorizontalGroup(
            n9PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        n9PLayout.setVerticalGroup(
            n9PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        n6P.setBackground(new java.awt.Color(255, 255, 255));
        n6P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        n6.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        n6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n6.setText("6");
        n6.setPreferredSize(new java.awt.Dimension(16, 16));
        n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout n6PLayout = new javax.swing.GroupLayout(n6P);
        n6P.setLayout(n6PLayout);
        n6PLayout.setHorizontalGroup(
            n6PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n6, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        n6PLayout.setVerticalGroup(
            n6PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n6, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        n5P.setBackground(new java.awt.Color(255, 255, 255));
        n5P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        n5.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        n5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n5.setText("5");
        n5.setPreferredSize(new java.awt.Dimension(16, 16));
        n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout n5PLayout = new javax.swing.GroupLayout(n5P);
        n5P.setLayout(n5PLayout);
        n5PLayout.setHorizontalGroup(
            n5PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        n5PLayout.setVerticalGroup(
            n5PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        n4P.setBackground(new java.awt.Color(255, 255, 255));
        n4P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        n4.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        n4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n4.setText("4");
        n4.setPreferredSize(new java.awt.Dimension(16, 16));
        n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout n4PLayout = new javax.swing.GroupLayout(n4P);
        n4P.setLayout(n4PLayout);
        n4PLayout.setHorizontalGroup(
            n4PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        n4PLayout.setVerticalGroup(
            n4PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        n1P.setBackground(new java.awt.Color(255, 255, 255));
        n1P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        n1.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        n1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n1.setText("1");
        n1.setPreferredSize(new java.awt.Dimension(16, 16));
        n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout n1PLayout = new javax.swing.GroupLayout(n1P);
        n1P.setLayout(n1PLayout);
        n1PLayout.setHorizontalGroup(
            n1PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        n1PLayout.setVerticalGroup(
            n1PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        n2P.setBackground(new java.awt.Color(255, 255, 255));
        n2P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        n2.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        n2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n2.setText("2");
        n2.setPreferredSize(new java.awt.Dimension(16, 16));
        n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout n2PLayout = new javax.swing.GroupLayout(n2P);
        n2P.setLayout(n2PLayout);
        n2PLayout.setHorizontalGroup(
            n2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        n2PLayout.setVerticalGroup(
            n2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        n3P.setBackground(new java.awt.Color(255, 255, 255));
        n3P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        n3.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        n3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n3.setText("3");
        n3.setPreferredSize(new java.awt.Dimension(16, 16));
        n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout n3PLayout = new javax.swing.GroupLayout(n3P);
        n3P.setLayout(n3PLayout);
        n3PLayout.setHorizontalGroup(
            n3PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        n3PLayout.setVerticalGroup(
            n3PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        delP.setBackground(new java.awt.Color(255, 255, 255));
        delP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        del.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        del.setText("del");
        del.setPreferredSize(new java.awt.Dimension(16, 16));
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delMousePressed(evt);
            }
        });

        javax.swing.GroupLayout delPLayout = new javax.swing.GroupLayout(delP);
        delP.setLayout(delPLayout);
        delPLayout.setHorizontalGroup(
            delPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        delPLayout.setVerticalGroup(
            delPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        n0P.setBackground(new java.awt.Color(255, 255, 255));
        n0P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        n0.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        n0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n0.setText("0");
        n0.setPreferredSize(new java.awt.Dimension(16, 16));
        n0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n0MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n0MousePressed(evt);
            }
        });

        javax.swing.GroupLayout n0PLayout = new javax.swing.GroupLayout(n0P);
        n0P.setLayout(n0PLayout);
        n0PLayout.setHorizontalGroup(
            n0PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n0, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        n0PLayout.setVerticalGroup(
            n0PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(n0, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        clrP.setBackground(new java.awt.Color(255, 255, 255));
        clrP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        clr.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        clr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr.setText("C");
        clr.setPreferredSize(new java.awt.Dimension(16, 16));
        clr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clrMousePressed(evt);
            }
        });

        javax.swing.GroupLayout clrPLayout = new javax.swing.GroupLayout(clrP);
        clrP.setLayout(clrPLayout);
        clrPLayout.setHorizontalGroup(
            clrPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clr, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        clrPLayout.setVerticalGroup(
            clrPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clr, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(n7P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(n8P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(n9P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(n4P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(n5P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(n6P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(n1P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(n2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(n3P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(n0P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addComponent(delP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(clrP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(n7P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n8P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n9P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(n6P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(n3P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(delP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(n5P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(n2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(n0P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(n4P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(n1P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(clrP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(33, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel24);
        jPanel24.setBounds(15, 50, 525, 330);

        UperDate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        UperDate.setText("05-02-24");
        jPanel2.add(UperDate);
        UperDate.setBounds(80, 20, 120, 16);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("CASHIER: ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(380, 20, 64, 16);

        jPanel25.setBackground(new java.awt.Color(142, 118, 55));
        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jPanel25.setPreferredSize(new java.awt.Dimension(525, 155));
        jPanel25.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel18.setText("DISCOUNT");
        jLabel18.setPreferredSize(new java.awt.Dimension(96, 26));
        jPanel25.add(jLabel18);
        jLabel18.setBounds(21, 13, 96, 26);

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel19.setText("CASH");
        jLabel19.setPreferredSize(new java.awt.Dimension(48, 26));
        jPanel25.add(jLabel19);
        jLabel19.setBounds(21, 115, 48, 26);

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel20.setText("TOTAL");
        jLabel20.setPreferredSize(new java.awt.Dimension(60, 26));
        jPanel25.add(jLabel20);
        jLabel20.setBounds(21, 83, 60, 26);

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel21.setText("CHANGE");
        jLabel21.setPreferredSize(new java.awt.Dimension(82, 26));
        jPanel25.add(jLabel21);
        jLabel21.setBounds(21, 149, 82, 26);

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel22.setText(":");
        jPanel25.add(jLabel22);
        jLabel22.setBounds(129, 16, 6, 21);

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel23.setText(":");
        jPanel25.add(jLabel23);
        jLabel23.setBounds(129, 118, 6, 21);

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel24.setText(":");
        jPanel25.add(jLabel24);
        jLabel24.setBounds(129, 152, 6, 21);

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel25.setText(":");
        jPanel25.add(jLabel25);
        jLabel25.setBounds(129, 86, 6, 21);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel29.setPreferredSize(new java.awt.Dimension(125, 28));

        tot.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        tot.setText("00");
        tot.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        tot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tot, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel25.add(jPanel29);
        jPanel29.setBounds(153, 81, 125, 28);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel31.setPreferredSize(new java.awt.Dimension(125, 28));

        cash.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        cash.setBorder(null);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cash, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel25.add(jPanel31);
        jPanel31.setBounds(153, 115, 125, 28);

        discount.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        discount.setMaximumRowCount(4);
        discount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "PWD 15%", "Senior 10%", "Student 5%" }));
        discount.setToolTipText("Customer's Discount");
        discount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        discount.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        discount.setMinimumSize(new java.awt.Dimension(125, 26));
        discount.setPreferredSize(new java.awt.Dimension(125, 28));
        discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountActionPerformed(evt);
            }
        });
        jPanel25.add(discount);
        discount.setBounds(153, 13, 125, 28);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel32.setPreferredSize(new java.awt.Dimension(125, 28));

        chnge.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        chnge.setText("00");
        chnge.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chnge, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(chnge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel25.add(jPanel32);
        jPanel32.setBounds(153, 149, 125, 28);

        pay.setBackground(new java.awt.Color(76, 44, 23));
        pay.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        pay.setForeground(new java.awt.Color(255, 255, 255));
        pay.setText("PAY");
        pay.setToolTipText("Payment Button/Action");
        pay.setMaximumSize(new java.awt.Dimension(1000, 1000));
        pay.setMinimumSize(new java.awt.Dimension(0, 0));
        pay.setPreferredSize(new java.awt.Dimension(80, 52));
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel25.add(pay);
        pay.setBounds(300, 40, 90, 70);

        jButton5.setBackground(new java.awt.Color(76, 44, 23));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("REMOVE");
        jButton5.setToolTipText("Quicl Way to Remove Item/s From Table");
        jButton5.setPreferredSize(new java.awt.Dimension(97, 30));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton5);
        jButton5.setBounds(410, 40, 97, 30);

        Print.setBackground(new java.awt.Color(76, 44, 23));
        Print.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("PRINT");
        Print.setToolTipText("Print Reciept");
        Print.setPreferredSize(new java.awt.Dimension(97, 30));
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrintMousePressed(evt);
            }
        });
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel25.add(Print);
        Print.setBounds(410, 80, 97, 30);

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("PAYMENT TYPE :");
        jLabel26.setPreferredSize(new java.awt.Dimension(82, 26));
        jPanel25.add(jLabel26);
        jLabel26.setBounds(21, 47, 152, 26);

        paymentMethod.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        paymentMethod.setMaximumRowCount(4);
        paymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH", "CARD", "E-CASH" }));
        paymentMethod.setToolTipText("Payment Method/Type");
        paymentMethod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paymentMethod.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        paymentMethod.setPreferredSize(new java.awt.Dimension(93, 28));
        paymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentMethodActionPerformed(evt);
            }
        });
        jPanel25.add(paymentMethod);
        paymentMethod.setBounds(185, 47, 93, 28);

        jButton6.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(76, 44, 23));
        jButton6.setText("NEW");
        jButton6.setToolTipText("New Order");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton6);
        jButton6.setBounds(360, 130, 90, 30);

        jPanel2.add(jPanel25);
        jPanel25.setBounds(15, 400, 525, 190);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("DATE:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(39, 20, 40, 16);

        cashier.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cashier.setText("James");
        jPanel2.add(cashier);
        cashier.setBounds(450, 20, 90, 16);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(700, 0, 555, 600);

        jPanel8.setBackground(new java.awt.Color(76, 44, 23));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel8.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BILLING SYSTEM");
        jPanel8.add(jLabel1);
        jLabel1.setBounds(270, 0, 228, 50);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\Image (1) (1).png")); // NOI18N
        jPanel8.add(jLabel5);
        jLabel5.setBounds(220, 0, 38, 50);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(0, 0, 700, 50);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 3, true));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray), "CATEGORIES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 19), new java.awt.Color(76, 44, 23))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(190, 300));

        hcP.setBackground(new java.awt.Color(76, 44, 23));
        hcP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));
        hcP.setPreferredSize(new java.awt.Dimension(166, 33));

        hc.setBackground(new java.awt.Color(255, 255, 255));
        hc.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        hc.setForeground(new java.awt.Color(255, 255, 255));
        hc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hc.setText("HOT COFFEE");
        hc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hc.setPreferredSize(new java.awt.Dimension(164, 31));
        hc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hcMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hcMousePressed(evt);
            }
        });

        javax.swing.GroupLayout hcPLayout = new javax.swing.GroupLayout(hcP);
        hcP.setLayout(hcPLayout);
        hcPLayout.setHorizontalGroup(
            hcPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hcPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hc, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        hcPLayout.setVerticalGroup(
            hcPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hcPLayout.createSequentialGroup()
                .addComponent(hc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ccP.setBackground(new java.awt.Color(255, 255, 255));
        ccP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));
        ccP.setPreferredSize(new java.awt.Dimension(166, 33));

        cc.setBackground(new java.awt.Color(255, 255, 255));
        cc.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        cc.setForeground(new java.awt.Color(76, 44, 23));
        cc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cc.setText("COLD COFFEE");
        cc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cc.setPreferredSize(new java.awt.Dimension(164, 31));
        cc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ccMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ccMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ccPLayout = new javax.swing.GroupLayout(ccP);
        ccP.setLayout(ccPLayout);
        ccPLayout.setHorizontalGroup(
            ccPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ccPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cc, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        ccPLayout.setVerticalGroup(
            ccPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ccPLayout.createSequentialGroup()
                .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mtP.setBackground(new java.awt.Color(255, 255, 255));
        mtP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));
        mtP.setPreferredSize(new java.awt.Dimension(166, 33));

        mt.setBackground(new java.awt.Color(255, 255, 255));
        mt.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        mt.setForeground(new java.awt.Color(76, 44, 23));
        mt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mt.setText("MILKTEA");
        mt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mt.setPreferredSize(new java.awt.Dimension(164, 31));
        mt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout mtPLayout = new javax.swing.GroupLayout(mtP);
        mtP.setLayout(mtPLayout);
        mtPLayout.setHorizontalGroup(
            mtPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mt, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        mtPLayout.setVerticalGroup(
            mtPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mtPLayout.createSequentialGroup()
                .addComponent(mt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        frP.setBackground(new java.awt.Color(255, 255, 255));
        frP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));
        frP.setPreferredSize(new java.awt.Dimension(166, 33));

        fr.setBackground(new java.awt.Color(255, 255, 255));
        fr.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        fr.setForeground(new java.awt.Color(76, 44, 23));
        fr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fr.setText("FRAPPEE");
        fr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fr.setPreferredSize(new java.awt.Dimension(164, 31));
        fr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                frMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout frPLayout = new javax.swing.GroupLayout(frP);
        frP.setLayout(frPLayout);
        frPLayout.setHorizontalGroup(
            frPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fr, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        frPLayout.setVerticalGroup(
            frPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frPLayout.createSequentialGroup()
                .addComponent(fr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hcP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(hcP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ccP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        wel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        wel.setForeground(new java.awt.Color(142, 118, 55));
        wel.setText("WELCOME James!!");

        emploImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\JIM.jpg")); // NOI18N
        emploImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 118, 55)));
        emploImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        loP.setBackground(new java.awt.Color(255, 255, 255));
        loP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 5, 5)));

        lo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lo.setForeground(new java.awt.Color(242, 5, 5));
        lo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lo.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\lgRed (1).png")); // NOI18N
        lo.setText(" LOG OUT ");
        lo.setIconTextGap(1);
        lo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loMousePressed(evt);
            }
        });

        javax.swing.GroupLayout loPLayout = new javax.swing.GroupLayout(loP);
        loP.setLayout(loPLayout);
        loPLayout.setHorizontalGroup(
            loPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loPLayout.setVerticalGroup(
            loPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        histP.setBackground(new java.awt.Color(255, 255, 255));
        histP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        hist.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        hist.setForeground(new java.awt.Color(76, 44, 23));
        hist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hist.setText("HISTORY");
        hist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                histMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                histMousePressed(evt);
            }
        });

        javax.swing.GroupLayout histPLayout = new javax.swing.GroupLayout(histP);
        histP.setLayout(histPLayout);
        histPLayout.setHorizontalGroup(
            histPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(histPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hist, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        histPLayout.setVerticalGroup(
            histPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hist, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(wel)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(loP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(histP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55))))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(emploImg)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(emploImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(histP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel3.getAccessibleContext().setAccessibleParent(this);

        jPanel1.add(jPanel14);
        jPanel14.setBounds(0, 50, 230, 560);

        cate.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        cate.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        cate.setFont(new java.awt.Font("Verdana", 0, 8)); // NOI18N

        jPanel30.setBackground(new java.awt.Color(245, 245, 245));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane7.setPreferredSize(new java.awt.Dimension(463, 460));

        jPanel52.setBackground(new java.awt.Color(245, 245, 245));
        jPanel52.setPreferredSize(new java.awt.Dimension(455, 850));

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hotCof/blackcoffee.jpg"))); // NOI18N
        jLabel38.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel38.setMinimumSize(new java.awt.Dimension(0, 0));

        min2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        min2.setText("-");
        min2.setToolTipText("Remove Single Item");
        min2.setMaximumSize(new java.awt.Dimension(40, 30));
        min2.setMinimumSize(new java.awt.Dimension(40, 30));
        min2.setPreferredSize(new java.awt.Dimension(40, 30));
        min2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min2ActionPerformed(evt);
            }
        });

        add2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        add2.setText("+");
        add2.setToolTipText("Add Single Item");
        add2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add2.setMaximumSize(new java.awt.Dimension(40, 30));
        add2.setMinimumSize(new java.awt.Dimension(40, 30));
        add2.setPreferredSize(new java.awt.Dimension(40, 30));
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel40.setText("BLACK COFFEE");

        stk2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        stk2.setForeground(new java.awt.Color(102, 102, 102));
        stk2.setText("50");

        qty2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        qty2.setText("0");
        qty2.setToolTipText("Quick Way To Add Item/s");
        qty2.setMaximumSize(new java.awt.Dimension(1000, 1000));
        qty2.setMinimumSize(new java.awt.Dimension(0, 0));
        qty2.setPreferredSize(new java.awt.Dimension(70, 30));
        qty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty2ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel77.setText("₱ ");

        prc2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc2.setText("40.00");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(min2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(qty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel54Layout.createSequentialGroup()
                            .addComponent(jLabel77)
                            .addGap(0, 0, 0)
                            .addComponent(prc2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stk2))
                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77)
                            .addComponent(prc2)
                            .addComponent(stk2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add2.getAccessibleContext().setAccessibleDescription("qwerty");

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));
        jPanel62.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hotCof/americano.jpg"))); // NOI18N
        jLabel74.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel74.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel75.setText("₱ ");

        min1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        min1.setText("-");
        min1.setToolTipText("Remove Single Item");
        min1.setMaximumSize(new java.awt.Dimension(40, 30));
        min1.setMinimumSize(new java.awt.Dimension(40, 30));
        min1.setPreferredSize(new java.awt.Dimension(40, 30));
        min1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min1ActionPerformed(evt);
            }
        });

        add1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        add1.setText("+");
        add1.setToolTipText("Add Single Item");
        add1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add1.setMaximumSize(new java.awt.Dimension(40, 30));
        add1.setMinimumSize(new java.awt.Dimension(40, 30));
        add1.setPreferredSize(new java.awt.Dimension(40, 30));
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel76.setText("AMERICANO");

        stk1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        stk1.setForeground(new java.awt.Color(102, 102, 102));
        stk1.setText("50");

        qty1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        qty1.setText("0");
        qty1.setToolTipText("Quick Way To Add Item/s");
        qty1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        qty1.setMinimumSize(new java.awt.Dimension(0, 0));
        qty1.setPreferredSize(new java.awt.Dimension(70, 30));
        qty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty1ActionPerformed(evt);
            }
        });

        prc1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc1.setText("40.00");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel76)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addComponent(min1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(qty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addGap(0, 0, 0)
                                .addComponent(prc1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stk1)
                            .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(stk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prc1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hotCof/capucinno.jpg"))); // NOI18N
        jLabel78.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel78.setMinimumSize(new java.awt.Dimension(0, 0));

        min3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        min3.setText("-");
        min3.setToolTipText("Remove Single Item");
        min3.setMaximumSize(new java.awt.Dimension(40, 30));
        min3.setMinimumSize(new java.awt.Dimension(40, 30));
        min3.setPreferredSize(new java.awt.Dimension(40, 30));
        min3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min3ActionPerformed(evt);
            }
        });

        add3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        add3.setText("+");
        add3.setToolTipText("Add Single Item");
        add3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add3.setMaximumSize(new java.awt.Dimension(40, 30));
        add3.setMinimumSize(new java.awt.Dimension(40, 30));
        add3.setPreferredSize(new java.awt.Dimension(40, 30));
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel80.setText("CAPPUCCINO");

        stk3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        stk3.setForeground(new java.awt.Color(102, 102, 102));
        stk3.setText("50");

        qty3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        qty3.setText("0");
        qty3.setToolTipText("Quick Way To Add Item/s");
        qty3.setMaximumSize(new java.awt.Dimension(1000, 1000));
        qty3.setMinimumSize(new java.awt.Dimension(0, 0));
        qty3.setPreferredSize(new java.awt.Dimension(70, 30));
        qty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty3ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel81.setText("₱ ");

        prc3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc3.setText("40.00");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addComponent(min3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(qty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addGap(0, 0, 0)
                                .addComponent(prc3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stk3)
                            .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel81)
                                .addComponent(prc3))
                            .addComponent(stk3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hotCof/espresso.jpg"))); // NOI18N
        jLabel82.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel82.setMinimumSize(new java.awt.Dimension(0, 0));

        min4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        min4.setText("-");
        min4.setToolTipText("Remove Single Item");
        min4.setMaximumSize(new java.awt.Dimension(40, 30));
        min4.setMinimumSize(new java.awt.Dimension(40, 30));
        min4.setPreferredSize(new java.awt.Dimension(40, 30));
        min4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min4ActionPerformed(evt);
            }
        });

        add4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        add4.setText("+");
        add4.setToolTipText("Add Single Item");
        add4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add4.setMaximumSize(new java.awt.Dimension(40, 30));
        add4.setMinimumSize(new java.awt.Dimension(40, 30));
        add4.setPreferredSize(new java.awt.Dimension(40, 30));
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel84.setText("ESPRESSO");

        stk4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        stk4.setForeground(new java.awt.Color(102, 102, 102));
        stk4.setText("50");

        qty4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        qty4.setText("0");
        qty4.setToolTipText("Quick Way To Add Item/s");
        qty4.setMaximumSize(new java.awt.Dimension(1000, 1000));
        qty4.setMinimumSize(new java.awt.Dimension(0, 0));
        qty4.setPreferredSize(new java.awt.Dimension(70, 30));
        qty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty4ActionPerformed(evt);
            }
        });

        prc4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc4.setText("40.00");

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel85.setText("₱ ");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel84)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel64Layout.createSequentialGroup()
                                .addComponent(min4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(qty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel64Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel85)
                                .addGap(1, 1, 1)
                                .addComponent(prc4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stk4)
                            .addComponent(add4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stk4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prc4)
                            .addComponent(jLabel85))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));
        jPanel65.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hotCof/machiatto.jpg"))); // NOI18N
        jLabel86.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel86.setMinimumSize(new java.awt.Dimension(0, 0));

        min5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        min5.setText("-");
        min5.setToolTipText("Remove Single Item");
        min5.setMaximumSize(new java.awt.Dimension(40, 30));
        min5.setMinimumSize(new java.awt.Dimension(40, 30));
        min5.setPreferredSize(new java.awt.Dimension(40, 30));
        min5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min5ActionPerformed(evt);
            }
        });

        add5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        add5.setText("+");
        add5.setToolTipText("Add Single Item");
        add5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add5.setMaximumSize(new java.awt.Dimension(40, 30));
        add5.setMinimumSize(new java.awt.Dimension(40, 30));
        add5.setPreferredSize(new java.awt.Dimension(40, 30));
        add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add5ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel88.setText("MACCHIATO");

        stk5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        stk5.setForeground(new java.awt.Color(102, 102, 102));
        stk5.setText("50");

        qty5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        qty5.setText("0");
        qty5.setToolTipText("Quick Way To Add Item/s");
        qty5.setMaximumSize(new java.awt.Dimension(1000, 1000));
        qty5.setMinimumSize(new java.awt.Dimension(0, 0));
        qty5.setPreferredSize(new java.awt.Dimension(70, 30));
        qty5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty5ActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel89.setText("₱ ");

        prc5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc5.setText("40.00");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel65Layout.createSequentialGroup()
                                .addComponent(min5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(qty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel65Layout.createSequentialGroup()
                                .addComponent(jLabel89)
                                .addGap(0, 0, 0)
                                .addComponent(prc5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stk5)
                            .addComponent(add5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stk5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prc5)
                            .addComponent(jLabel89))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jScrollPane7.setViewportView(jPanel52);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Script MT Bold", 0, 19)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Coffee is strong, sweet, and too hot for you. ;)");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setPreferredSize(new java.awt.Dimension(425, 36));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cate.addTab("HOT COFFEE", jPanel30);

        jPanel17.setBackground(new java.awt.Color(255, 0, 51));

        jPanel15.setBackground(new java.awt.Color(245, 245, 245));
        jPanel15.setLayout(null);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(465, 48));

        jLabel15.setFont(new java.awt.Font("Script MT Bold", 0, 19)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Deja Brew: The feeling that you’ve had this coffee before.");
        jLabel15.setPreferredSize(new java.awt.Dimension(425, 36));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.add(jPanel16);
        jPanel16.setBounds(8, 6, 449, 48);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SIZES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        tblP1.setBackground(new java.awt.Color(76, 44, 23));
        tblP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        tbl1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        tbl1.setForeground(new java.awt.Color(255, 255, 255));
        tbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tbl1.setText("SMALL");
        tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout tblP1Layout = new javax.swing.GroupLayout(tblP1);
        tblP1.setLayout(tblP1Layout);
        tblP1Layout.setHorizontalGroup(
            tblP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tblP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        tblP1Layout.setVerticalGroup(
            tblP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        rcptP1.setBackground(new java.awt.Color(255, 255, 255));
        rcptP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));
        rcptP1.setPreferredSize(new java.awt.Dimension(90, 25));

        rcpt1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        rcpt1.setForeground(new java.awt.Color(76, 44, 23));
        rcpt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rcpt1.setText("MEDIUM");
        rcpt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rcpt1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rcpt1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout rcptP1Layout = new javax.swing.GroupLayout(rcptP1);
        rcptP1.setLayout(rcptP1Layout);
        rcptP1Layout.setHorizontalGroup(
            rcptP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rcptP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rcpt1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        rcptP1Layout.setVerticalGroup(
            rcptP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rcpt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(tblP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rcptP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tblP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rcptP1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.add(jPanel12);
        jPanel12.setBounds(0, 60, 460, 60);

        OptnSz.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        OptnSz.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(460, 435));

        jPanel36.setBackground(new java.awt.Color(245, 245, 245));
        jPanel36.setPreferredSize(new java.awt.Dimension(455, 850));

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coldCof/iceAmericano.jpg"))); // NOI18N
        jLabel90.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel90.setMinimumSize(new java.awt.Dimension(0, 0));

        SccMin2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccMin2.setText("-");
        SccMin2.setMaximumSize(new java.awt.Dimension(40, 30));
        SccMin2.setMinimumSize(new java.awt.Dimension(40, 30));
        SccMin2.setPreferredSize(new java.awt.Dimension(40, 30));
        SccMin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccMin2ActionPerformed(evt);
            }
        });

        SccAdd2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccAdd2.setText("+");
        SccAdd2.setToolTipText("trewq");
        SccAdd2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SccAdd2.setMaximumSize(new java.awt.Dimension(40, 30));
        SccAdd2.setMinimumSize(new java.awt.Dimension(40, 30));
        SccAdd2.setPreferredSize(new java.awt.Dimension(40, 30));
        SccAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccAdd2ActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel92.setText("ICE AMERICANO");

        SccStk2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SccStk2.setForeground(new java.awt.Color(102, 102, 102));
        SccStk2.setText("50");

        SccQty2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccQty2.setText("0");
        SccQty2.setMaximumSize(new java.awt.Dimension(1000, 1000));
        SccQty2.setMinimumSize(new java.awt.Dimension(0, 0));
        SccQty2.setPreferredSize(new java.awt.Dimension(70, 30));
        SccQty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccQty2ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel83.setText("₱ ");

        prc7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc7.setText("40.00");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel92)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel66Layout.createSequentialGroup()
                                .addComponent(SccMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(SccQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel66Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addGap(0, 0, 0)
                                .addComponent(prc7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SccStk2)
                            .addComponent(SccAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc7)
                                .addComponent(jLabel83))
                            .addComponent(SccStk2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SccMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SccAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SccQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jPanel67.setBackground(new java.awt.Color(255, 255, 255));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coldCof/affogato.jpg"))); // NOI18N
        jLabel94.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel94.setMinimumSize(new java.awt.Dimension(0, 0));

        SccMin1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccMin1.setText("-");
        SccMin1.setMaximumSize(new java.awt.Dimension(40, 30));
        SccMin1.setMinimumSize(new java.awt.Dimension(40, 30));
        SccMin1.setPreferredSize(new java.awt.Dimension(40, 30));
        SccMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccMin1ActionPerformed(evt);
            }
        });

        SccAdd1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccAdd1.setText("+");
        SccAdd1.setToolTipText("trewq");
        SccAdd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SccAdd1.setMaximumSize(new java.awt.Dimension(40, 30));
        SccAdd1.setMinimumSize(new java.awt.Dimension(40, 30));
        SccAdd1.setPreferredSize(new java.awt.Dimension(40, 30));
        SccAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccAdd1ActionPerformed(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel96.setText("AFFOGATO ");

        SccStk1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SccStk1.setForeground(new java.awt.Color(102, 102, 102));
        SccStk1.setText("50");

        SccQty1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccQty1.setText("0");
        SccQty1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        SccQty1.setMinimumSize(new java.awt.Dimension(0, 0));
        SccQty1.setPreferredSize(new java.awt.Dimension(70, 30));
        SccQty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccQty1ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel79.setText("₱ ");

        prc6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc6.setText("40.00");

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addComponent(jLabel79)
                                .addGap(0, 0, 0)
                                .addComponent(prc6))
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addComponent(SccMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(SccQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SccStk1)
                            .addComponent(SccAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addComponent(jLabel96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SccStk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prc6)
                            .addComponent(jLabel79))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SccMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SccAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SccQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));
        jPanel68.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coldCof/iceMocha.jpg"))); // NOI18N
        jLabel98.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel98.setMinimumSize(new java.awt.Dimension(0, 0));

        SccMin3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccMin3.setText("-");
        SccMin3.setMaximumSize(new java.awt.Dimension(40, 30));
        SccMin3.setMinimumSize(new java.awt.Dimension(40, 30));
        SccMin3.setPreferredSize(new java.awt.Dimension(40, 30));
        SccMin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccMin3ActionPerformed(evt);
            }
        });

        SccAdd3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccAdd3.setText("+");
        SccAdd3.setToolTipText("trewq");
        SccAdd3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SccAdd3.setMaximumSize(new java.awt.Dimension(40, 30));
        SccAdd3.setMinimumSize(new java.awt.Dimension(40, 30));
        SccAdd3.setPreferredSize(new java.awt.Dimension(40, 30));
        SccAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccAdd3ActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel100.setText("ICE MOCHA");

        SccStk3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SccStk3.setForeground(new java.awt.Color(102, 102, 102));
        SccStk3.setText("50");

        SccQty3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccQty3.setText("0");
        SccQty3.setMaximumSize(new java.awt.Dimension(1000, 1000));
        SccQty3.setMinimumSize(new java.awt.Dimension(0, 0));
        SccQty3.setPreferredSize(new java.awt.Dimension(70, 30));
        SccQty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccQty3ActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel87.setText("₱ ");

        prc8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc8.setText("40.00");

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel100))
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel68Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(SccMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(SccQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel68Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel87)
                                .addGap(0, 0, 0)
                                .addComponent(prc8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SccStk3)
                            .addComponent(SccAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SccStk3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prc8)
                            .addComponent(jLabel87))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SccMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SccAdd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SccQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jPanel69.setBackground(new java.awt.Color(255, 255, 255));
        jPanel69.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coldCof/iceblackcoffee.jpg"))); // NOI18N
        jLabel102.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel102.setMinimumSize(new java.awt.Dimension(0, 0));

        SccMin4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccMin4.setText("-");
        SccMin4.setMaximumSize(new java.awt.Dimension(40, 30));
        SccMin4.setMinimumSize(new java.awt.Dimension(40, 30));
        SccMin4.setPreferredSize(new java.awt.Dimension(40, 30));
        SccMin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccMin4ActionPerformed(evt);
            }
        });

        SccAdd4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccAdd4.setText("+");
        SccAdd4.setToolTipText("trewq");
        SccAdd4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SccAdd4.setMaximumSize(new java.awt.Dimension(40, 30));
        SccAdd4.setMinimumSize(new java.awt.Dimension(40, 30));
        SccAdd4.setPreferredSize(new java.awt.Dimension(40, 30));
        SccAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccAdd4ActionPerformed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel104.setText("ICE BLACK COFFEE");

        SccStk4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SccStk4.setForeground(new java.awt.Color(102, 102, 102));
        SccStk4.setText("50");

        SccQty4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccQty4.setText("0");
        SccQty4.setMaximumSize(new java.awt.Dimension(1000, 1000));
        SccQty4.setMinimumSize(new java.awt.Dimension(0, 0));
        SccQty4.setPreferredSize(new java.awt.Dimension(70, 30));
        SccQty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccQty4ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel93.setText("₱ ");

        prc9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc9.setText("40.00");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104)
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel69Layout.createSequentialGroup()
                                .addComponent(SccMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(SccQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel69Layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addGap(0, 0, 0)
                                .addComponent(prc9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SccStk4)
                            .addComponent(SccAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc9)
                                .addComponent(jLabel93))
                            .addComponent(SccStk4))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SccMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SccAdd4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SccQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

        jPanel70.setBackground(new java.awt.Color(255, 255, 255));
        jPanel70.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coldCof/icelatte.jpg"))); // NOI18N
        jLabel106.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel106.setMinimumSize(new java.awt.Dimension(0, 0));

        SccMin5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccMin5.setText("-");
        SccMin5.setMaximumSize(new java.awt.Dimension(40, 30));
        SccMin5.setMinimumSize(new java.awt.Dimension(40, 30));
        SccMin5.setPreferredSize(new java.awt.Dimension(40, 30));
        SccMin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccMin5ActionPerformed(evt);
            }
        });

        SccAdd5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccAdd5.setText("+");
        SccAdd5.setToolTipText("trewq");
        SccAdd5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SccAdd5.setMaximumSize(new java.awt.Dimension(40, 30));
        SccAdd5.setMinimumSize(new java.awt.Dimension(40, 30));
        SccAdd5.setPreferredSize(new java.awt.Dimension(40, 30));
        SccAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccAdd5ActionPerformed(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel108.setText("ICE LATTE");

        SccStk5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SccStk5.setForeground(new java.awt.Color(102, 102, 102));
        SccStk5.setText("50");

        SccQty5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SccQty5.setText("0");
        SccQty5.setMaximumSize(new java.awt.Dimension(1000, 1000));
        SccQty5.setMinimumSize(new java.awt.Dimension(0, 0));
        SccQty5.setPreferredSize(new java.awt.Dimension(70, 30));
        SccQty5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SccQty5ActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel97.setText("₱ ");

        prc10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc10.setText("40.00");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addComponent(SccMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(SccQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addComponent(jLabel97)
                                .addGap(0, 0, 0)
                                .addComponent(prc10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SccStk5)
                            .addComponent(SccAdd5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc10)
                                .addComponent(jLabel97))
                            .addComponent(SccStk5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SccMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SccAdd5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SccQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel36);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        OptnSz.addTab("tab1", jPanel10);

        jPanel18.setPreferredSize(new java.awt.Dimension(460, 435));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(460, 435));

        jPanel38.setBackground(new java.awt.Color(245, 245, 245));
        jPanel38.setPreferredSize(new java.awt.Dimension(455, 850));

        jPanel81.setBackground(new java.awt.Color(255, 255, 255));
        jPanel81.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coldCof/iceAmericano.jpg"))); // NOI18N
        jLabel150.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel150.setMinimumSize(new java.awt.Dimension(0, 0));

        MccMin2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccMin2.setText("-");
        MccMin2.setMaximumSize(new java.awt.Dimension(40, 30));
        MccMin2.setMinimumSize(new java.awt.Dimension(40, 30));
        MccMin2.setPreferredSize(new java.awt.Dimension(40, 30));
        MccMin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccMin2ActionPerformed(evt);
            }
        });

        MccAdd2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccAdd2.setText("+");
        MccAdd2.setToolTipText("trewq");
        MccAdd2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MccAdd2.setMaximumSize(new java.awt.Dimension(40, 30));
        MccAdd2.setMinimumSize(new java.awt.Dimension(40, 30));
        MccAdd2.setPreferredSize(new java.awt.Dimension(40, 30));
        MccAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccAdd2ActionPerformed(evt);
            }
        });

        jLabel152.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel152.setText("ICE AMERICANO");

        MccStk2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        MccStk2.setForeground(new java.awt.Color(102, 102, 102));
        MccStk2.setText("50");

        MccQty2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccQty2.setText("0");
        MccQty2.setMaximumSize(new java.awt.Dimension(1000, 1000));
        MccQty2.setMinimumSize(new java.awt.Dimension(0, 0));
        MccQty2.setPreferredSize(new java.awt.Dimension(70, 30));
        MccQty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccQty2ActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel95.setText("₱ ");

        prc12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc12.setText("40.00");

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel152)
                    .addGroup(jPanel81Layout.createSequentialGroup()
                        .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel81Layout.createSequentialGroup()
                                .addComponent(MccMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(MccQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel81Layout.createSequentialGroup()
                                .addComponent(jLabel95)
                                .addGap(0, 0, 0)
                                .addComponent(prc12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MccStk2)
                            .addComponent(MccAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel81Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel152)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc12)
                                .addComponent(jLabel95))
                            .addComponent(MccStk2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MccMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MccAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MccQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel82.setBackground(new java.awt.Color(255, 255, 255));
        jPanel82.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coldCof/affogato.jpg"))); // NOI18N
        jLabel154.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel154.setMinimumSize(new java.awt.Dimension(0, 0));

        MccMin1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccMin1.setText("-");
        MccMin1.setMaximumSize(new java.awt.Dimension(40, 30));
        MccMin1.setMinimumSize(new java.awt.Dimension(40, 30));
        MccMin1.setPreferredSize(new java.awt.Dimension(40, 30));
        MccMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccMin1ActionPerformed(evt);
            }
        });

        MccAdd1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccAdd1.setText("+");
        MccAdd1.setToolTipText("trewq");
        MccAdd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MccAdd1.setMaximumSize(new java.awt.Dimension(40, 30));
        MccAdd1.setMinimumSize(new java.awt.Dimension(40, 30));
        MccAdd1.setPreferredSize(new java.awt.Dimension(40, 30));
        MccAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccAdd1ActionPerformed(evt);
            }
        });

        jLabel156.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel156.setText("AFFOGATO");

        MccStk1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        MccStk1.setForeground(new java.awt.Color(102, 102, 102));
        MccStk1.setText("50");

        MccQty1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccQty1.setText("0");
        MccQty1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        MccQty1.setMinimumSize(new java.awt.Dimension(0, 0));
        MccQty1.setPreferredSize(new java.awt.Dimension(70, 30));
        MccQty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccQty1ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel91.setText("₱ ");

        prc11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc11.setText("40.00");

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel156)
                    .addGroup(jPanel82Layout.createSequentialGroup()
                        .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel82Layout.createSequentialGroup()
                                .addComponent(MccMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(MccQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel82Layout.createSequentialGroup()
                                .addComponent(jLabel91)
                                .addGap(0, 0, 0)
                                .addComponent(prc11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MccStk1)
                            .addComponent(MccAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel82Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel156)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc11)
                                .addComponent(jLabel91))
                            .addComponent(MccStk1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MccMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MccAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MccQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel83.setBackground(new java.awt.Color(255, 255, 255));
        jPanel83.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coldCof/iceMocha.jpg"))); // NOI18N
        jLabel158.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel158.setMinimumSize(new java.awt.Dimension(0, 0));

        MccMin3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccMin3.setText("-");
        MccMin3.setMaximumSize(new java.awt.Dimension(40, 30));
        MccMin3.setMinimumSize(new java.awt.Dimension(40, 30));
        MccMin3.setPreferredSize(new java.awt.Dimension(40, 30));
        MccMin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccMin3ActionPerformed(evt);
            }
        });

        MccAdd3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccAdd3.setText("+");
        MccAdd3.setToolTipText("trewq");
        MccAdd3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MccAdd3.setMaximumSize(new java.awt.Dimension(40, 30));
        MccAdd3.setMinimumSize(new java.awt.Dimension(40, 30));
        MccAdd3.setPreferredSize(new java.awt.Dimension(40, 30));
        MccAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccAdd3ActionPerformed(evt);
            }
        });

        jLabel160.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel160.setText("ICE MOCHA");

        MccStk3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        MccStk3.setForeground(new java.awt.Color(102, 102, 102));
        MccStk3.setText("50");

        MccQty3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccQty3.setText("0");
        MccQty3.setMaximumSize(new java.awt.Dimension(1000, 1000));
        MccQty3.setMinimumSize(new java.awt.Dimension(0, 0));
        MccQty3.setPreferredSize(new java.awt.Dimension(70, 30));
        MccQty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccQty3ActionPerformed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel99.setText("₱ ");

        prc13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc13.setText("40.00");

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel160)
                    .addGroup(jPanel83Layout.createSequentialGroup()
                        .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel83Layout.createSequentialGroup()
                                .addComponent(MccMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(MccQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel83Layout.createSequentialGroup()
                                .addComponent(jLabel99)
                                .addGap(0, 0, 0)
                                .addComponent(prc13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MccStk3)
                            .addComponent(MccAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel83Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel160)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MccStk3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prc13)
                            .addComponent(jLabel99))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MccMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MccAdd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MccQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel84.setBackground(new java.awt.Color(255, 255, 255));
        jPanel84.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coldCof/iceblackcoffee.jpg"))); // NOI18N
        jLabel162.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel162.setMinimumSize(new java.awt.Dimension(0, 0));

        MccMin4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccMin4.setText("-");
        MccMin4.setMaximumSize(new java.awt.Dimension(40, 30));
        MccMin4.setMinimumSize(new java.awt.Dimension(40, 30));
        MccMin4.setPreferredSize(new java.awt.Dimension(40, 30));
        MccMin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccMin4ActionPerformed(evt);
            }
        });

        MccAdd4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccAdd4.setText("+");
        MccAdd4.setToolTipText("trewq");
        MccAdd4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MccAdd4.setMaximumSize(new java.awt.Dimension(40, 30));
        MccAdd4.setMinimumSize(new java.awt.Dimension(40, 30));
        MccAdd4.setPreferredSize(new java.awt.Dimension(40, 30));
        MccAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccAdd4ActionPerformed(evt);
            }
        });

        jLabel164.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel164.setText("ICE BLACK COFFEE");

        MccStk4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        MccStk4.setForeground(new java.awt.Color(102, 102, 102));
        MccStk4.setText("50");

        MccQty4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccQty4.setText("0");
        MccQty4.setMaximumSize(new java.awt.Dimension(1000, 1000));
        MccQty4.setMinimumSize(new java.awt.Dimension(0, 0));
        MccQty4.setPreferredSize(new java.awt.Dimension(70, 30));
        MccQty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccQty4ActionPerformed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel101.setText("₱ ");

        prc14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc14.setText("40.00");

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel164)
                    .addGroup(jPanel84Layout.createSequentialGroup()
                        .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel84Layout.createSequentialGroup()
                                .addComponent(MccMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(MccQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel84Layout.createSequentialGroup()
                                .addComponent(jLabel101)
                                .addGap(0, 0, 0)
                                .addComponent(prc14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MccStk4)
                            .addComponent(MccAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel84Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel164)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc14)
                                .addComponent(jLabel101))
                            .addComponent(MccStk4))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MccMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MccAdd4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MccQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel85.setBackground(new java.awt.Color(255, 255, 255));
        jPanel85.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coldCof/icelatte.jpg"))); // NOI18N
        jLabel166.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel166.setMinimumSize(new java.awt.Dimension(0, 0));

        MccMin5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccMin5.setText("-");
        MccMin5.setMaximumSize(new java.awt.Dimension(40, 30));
        MccMin5.setMinimumSize(new java.awt.Dimension(40, 30));
        MccMin5.setPreferredSize(new java.awt.Dimension(40, 30));
        MccMin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccMin5ActionPerformed(evt);
            }
        });

        MccAdd5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccAdd5.setText("+");
        MccAdd5.setToolTipText("trewq");
        MccAdd5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MccAdd5.setMaximumSize(new java.awt.Dimension(40, 30));
        MccAdd5.setMinimumSize(new java.awt.Dimension(40, 30));
        MccAdd5.setPreferredSize(new java.awt.Dimension(40, 30));
        MccAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccAdd5ActionPerformed(evt);
            }
        });

        jLabel168.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel168.setText("ICE LATTE");

        MccStk5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        MccStk5.setForeground(new java.awt.Color(102, 102, 102));
        MccStk5.setText("50");

        MccQty5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MccQty5.setText("0");
        MccQty5.setMaximumSize(new java.awt.Dimension(1000, 1000));
        MccQty5.setMinimumSize(new java.awt.Dimension(0, 0));
        MccQty5.setPreferredSize(new java.awt.Dimension(70, 30));
        MccQty5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MccQty5ActionPerformed(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel103.setText("₱ ");

        prc15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc15.setText("40.00");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel168)
                    .addGroup(jPanel85Layout.createSequentialGroup()
                        .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel85Layout.createSequentialGroup()
                                .addComponent(MccMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(MccQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel85Layout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addGap(0, 0, 0)
                                .addComponent(prc15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MccStk5)
                            .addComponent(MccAdd5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel85Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel168)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc15)
                                .addComponent(jLabel103))
                            .addComponent(MccStk5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MccMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MccAdd5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MccQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel38);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        OptnSz.addTab("tab2", jPanel11);

        jPanel15.add(OptnSz);
        OptnSz.setBounds(0, 81, 460, 470);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cate.addTab("COLD COFFEE", jPanel17);

        jPanel20.setBackground(new java.awt.Color(245, 245, 245));
        jPanel20.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(465, 48));

        jLabel16.setFont(new java.awt.Font("Script MT Bold", 0, 19)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Life is full of possibili-teas.");
        jLabel16.setPreferredSize(new java.awt.Dimension(425, 36));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel20.add(jPanel21);
        jPanel21.setBounds(8, 6, 449, 48);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SIZES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        tblP2.setBackground(new java.awt.Color(76, 44, 23));
        tblP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));

        tbl2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        tbl2.setForeground(new java.awt.Color(255, 255, 255));
        tbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tbl2.setText("SMALL");
        tbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout tblP2Layout = new javax.swing.GroupLayout(tblP2);
        tblP2.setLayout(tblP2Layout);
        tblP2Layout.setHorizontalGroup(
            tblP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tblP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        tblP2Layout.setVerticalGroup(
            tblP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        rcptP3.setBackground(new java.awt.Color(255, 255, 255));
        rcptP3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 44, 23)));
        rcptP3.setPreferredSize(new java.awt.Dimension(90, 25));

        rcpt3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        rcpt3.setForeground(new java.awt.Color(76, 44, 23));
        rcpt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rcpt3.setText("MEDIUM");
        rcpt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rcpt3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rcpt3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout rcptP3Layout = new javax.swing.GroupLayout(rcptP3);
        rcptP3.setLayout(rcptP3Layout);
        rcptP3Layout.setHorizontalGroup(
            rcptP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rcptP3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rcpt3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        rcptP3Layout.setVerticalGroup(
            rcptP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rcpt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(tblP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(rcptP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rcptP3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(tblP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel20.add(jPanel19);
        jPanel19.setBounds(0, 60, 460, 60);

        OptnSz1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        jPanel27.setPreferredSize(new java.awt.Dimension(460, 435));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setPreferredSize(new java.awt.Dimension(460, 435));

        jPanel41.setBackground(new java.awt.Color(245, 245, 245));
        jPanel41.setPreferredSize(new java.awt.Dimension(455, 850));

        jPanel87.setBackground(new java.awt.Color(255, 255, 255));
        jPanel87.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milktea/darkchoco.jpg"))); // NOI18N
        jLabel105.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel105.setMinimumSize(new java.awt.Dimension(0, 0));

        SmtMin1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtMin1.setText("-");
        SmtMin1.setMaximumSize(new java.awt.Dimension(40, 30));
        SmtMin1.setMinimumSize(new java.awt.Dimension(40, 30));
        SmtMin1.setPreferredSize(new java.awt.Dimension(40, 30));
        SmtMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtMin1ActionPerformed(evt);
            }
        });

        SmtAdd1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtAdd1.setText("+");
        SmtAdd1.setToolTipText("trewq");
        SmtAdd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SmtAdd1.setMaximumSize(new java.awt.Dimension(40, 30));
        SmtAdd1.setMinimumSize(new java.awt.Dimension(40, 30));
        SmtAdd1.setPreferredSize(new java.awt.Dimension(40, 30));
        SmtAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtAdd1ActionPerformed(evt);
            }
        });

        jLabel153.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel153.setText("DARK CHOCO");

        SmtStk1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SmtStk1.setForeground(new java.awt.Color(102, 102, 102));
        SmtStk1.setText("50");

        SmtQty1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtQty1.setText("0");
        SmtQty1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        SmtQty1.setMinimumSize(new java.awt.Dimension(0, 0));
        SmtQty1.setPreferredSize(new java.awt.Dimension(70, 30));
        SmtQty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtQty1ActionPerformed(evt);
            }
        });

        prc16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc16.setText("40.00");

        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel107.setText("₱ ");

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel153)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addComponent(SmtMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(SmtQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addComponent(jLabel107)
                                .addGap(0, 0, 0)
                                .addComponent(prc16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SmtStk1)
                            .addComponent(SmtAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addComponent(jLabel153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc16)
                                .addComponent(jLabel107))
                            .addComponent(SmtStk1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SmtMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SmtAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SmtQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jPanel96.setBackground(new java.awt.Color(255, 255, 255));
        jPanel96.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milktea/hokaido.jpg"))); // NOI18N
        jLabel110.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel110.setMinimumSize(new java.awt.Dimension(0, 0));

        SmtMin2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtMin2.setText("-");
        SmtMin2.setMaximumSize(new java.awt.Dimension(40, 30));
        SmtMin2.setMinimumSize(new java.awt.Dimension(40, 30));
        SmtMin2.setPreferredSize(new java.awt.Dimension(40, 30));
        SmtMin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtMin2ActionPerformed(evt);
            }
        });

        SmtAdd2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtAdd2.setText("+");
        SmtAdd2.setToolTipText("trewq");
        SmtAdd2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SmtAdd2.setMaximumSize(new java.awt.Dimension(40, 30));
        SmtAdd2.setMinimumSize(new java.awt.Dimension(40, 30));
        SmtAdd2.setPreferredSize(new java.awt.Dimension(40, 30));
        SmtAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtAdd2ActionPerformed(evt);
            }
        });

        jLabel190.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel190.setText("HOKAIDO");

        SmtStk2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SmtStk2.setForeground(new java.awt.Color(102, 102, 102));
        SmtStk2.setText("50");

        SmtQty2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtQty2.setText("0");
        SmtQty2.setMaximumSize(new java.awt.Dimension(1000, 1000));
        SmtQty2.setMinimumSize(new java.awt.Dimension(0, 0));
        SmtQty2.setPreferredSize(new java.awt.Dimension(70, 30));
        SmtQty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtQty2ActionPerformed(evt);
            }
        });

        prc17.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc17.setText("40.00");

        jLabel118.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel118.setText("₱ ");

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel190)
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel96Layout.createSequentialGroup()
                                .addComponent(SmtMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(SmtQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel96Layout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addGap(0, 0, 0)
                                .addComponent(prc17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SmtStk2)
                            .addComponent(SmtAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addComponent(jLabel190)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc17)
                                .addComponent(jLabel118))
                            .addComponent(SmtStk2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SmtMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SmtAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SmtQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jPanel97.setBackground(new java.awt.Color(255, 255, 255));
        jPanel97.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milktea/matcha.jpg"))); // NOI18N
        jLabel112.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel112.setMinimumSize(new java.awt.Dimension(0, 0));

        SmtMin3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtMin3.setText("-");
        SmtMin3.setMaximumSize(new java.awt.Dimension(40, 30));
        SmtMin3.setMinimumSize(new java.awt.Dimension(40, 30));
        SmtMin3.setPreferredSize(new java.awt.Dimension(40, 30));
        SmtMin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtMin3ActionPerformed(evt);
            }
        });

        SmtAdd3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtAdd3.setText("+");
        SmtAdd3.setToolTipText("trewq");
        SmtAdd3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SmtAdd3.setMaximumSize(new java.awt.Dimension(40, 30));
        SmtAdd3.setMinimumSize(new java.awt.Dimension(40, 30));
        SmtAdd3.setPreferredSize(new java.awt.Dimension(40, 30));
        SmtAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtAdd3ActionPerformed(evt);
            }
        });

        jLabel191.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel191.setText("MATCHA");

        SmtStk3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SmtStk3.setForeground(new java.awt.Color(102, 102, 102));
        SmtStk3.setText("50");

        SmtQty3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtQty3.setText("0");
        SmtQty3.setMaximumSize(new java.awt.Dimension(1000, 1000));
        SmtQty3.setMinimumSize(new java.awt.Dimension(0, 0));
        SmtQty3.setPreferredSize(new java.awt.Dimension(70, 30));
        SmtQty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtQty3ActionPerformed(evt);
            }
        });

        prc18.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc18.setText("40.00");

        jLabel119.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel119.setText("₱ ");

        javax.swing.GroupLayout jPanel97Layout = new javax.swing.GroupLayout(jPanel97);
        jPanel97.setLayout(jPanel97Layout);
        jPanel97Layout.setHorizontalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel191)
                    .addGroup(jPanel97Layout.createSequentialGroup()
                        .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel97Layout.createSequentialGroup()
                                .addComponent(SmtMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(SmtQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel97Layout.createSequentialGroup()
                                .addComponent(jLabel119)
                                .addGap(0, 0, 0)
                                .addComponent(prc18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SmtStk3)
                            .addComponent(SmtAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel97Layout.setVerticalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel97Layout.createSequentialGroup()
                        .addComponent(jLabel191)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc18)
                                .addComponent(jLabel119))
                            .addComponent(SmtStk3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SmtMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SmtAdd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SmtQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jPanel98.setBackground(new java.awt.Color(255, 255, 255));
        jPanel98.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milktea/okinawa.jpg"))); // NOI18N
        jLabel114.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel114.setMinimumSize(new java.awt.Dimension(0, 0));

        SmtMin4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtMin4.setText("-");
        SmtMin4.setMaximumSize(new java.awt.Dimension(40, 30));
        SmtMin4.setMinimumSize(new java.awt.Dimension(40, 30));
        SmtMin4.setPreferredSize(new java.awt.Dimension(40, 30));
        SmtMin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtMin4ActionPerformed(evt);
            }
        });

        SmtAdd4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtAdd4.setText("+");
        SmtAdd4.setToolTipText("trewq");
        SmtAdd4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SmtAdd4.setMaximumSize(new java.awt.Dimension(40, 30));
        SmtAdd4.setMinimumSize(new java.awt.Dimension(40, 30));
        SmtAdd4.setPreferredSize(new java.awt.Dimension(40, 30));
        SmtAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtAdd4ActionPerformed(evt);
            }
        });

        jLabel192.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel192.setText("OKINAWA");

        SmtStk4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SmtStk4.setForeground(new java.awt.Color(102, 102, 102));
        SmtStk4.setText("50");

        SmtQty4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtQty4.setText("0");
        SmtQty4.setMaximumSize(new java.awt.Dimension(1000, 1000));
        SmtQty4.setMinimumSize(new java.awt.Dimension(0, 0));
        SmtQty4.setPreferredSize(new java.awt.Dimension(70, 30));
        SmtQty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtQty4ActionPerformed(evt);
            }
        });

        prc19.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc19.setText("40.00");

        jLabel120.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel120.setText("₱ ");

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel192)
                    .addGroup(jPanel98Layout.createSequentialGroup()
                        .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel98Layout.createSequentialGroup()
                                .addComponent(SmtMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(SmtQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel98Layout.createSequentialGroup()
                                .addComponent(jLabel120)
                                .addGap(0, 0, 0)
                                .addComponent(prc19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SmtStk4)
                            .addComponent(SmtAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel98Layout.createSequentialGroup()
                        .addComponent(jLabel192)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc19)
                                .addComponent(jLabel120))
                            .addComponent(SmtStk4))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SmtMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SmtAdd4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SmtQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jPanel99.setBackground(new java.awt.Color(255, 255, 255));
        jPanel99.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milktea/wintermelon.jpg"))); // NOI18N
        jLabel116.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel116.setMinimumSize(new java.awt.Dimension(0, 0));

        SmtMin5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtMin5.setText("-");
        SmtMin5.setMaximumSize(new java.awt.Dimension(40, 30));
        SmtMin5.setMinimumSize(new java.awt.Dimension(40, 30));
        SmtMin5.setPreferredSize(new java.awt.Dimension(40, 30));
        SmtMin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtMin5ActionPerformed(evt);
            }
        });

        SmtAdd5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtAdd5.setText("+");
        SmtAdd5.setToolTipText("trewq");
        SmtAdd5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SmtAdd5.setMaximumSize(new java.awt.Dimension(40, 30));
        SmtAdd5.setMinimumSize(new java.awt.Dimension(40, 30));
        SmtAdd5.setPreferredSize(new java.awt.Dimension(40, 30));
        SmtAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtAdd5ActionPerformed(evt);
            }
        });

        jLabel193.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel193.setText("WINTERMELON");

        SmtStk5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SmtStk5.setForeground(new java.awt.Color(102, 102, 102));
        SmtStk5.setText("50");

        SmtQty5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SmtQty5.setText("0");
        SmtQty5.setMaximumSize(new java.awt.Dimension(1000, 1000));
        SmtQty5.setMinimumSize(new java.awt.Dimension(0, 0));
        SmtQty5.setPreferredSize(new java.awt.Dimension(70, 30));
        SmtQty5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmtQty5ActionPerformed(evt);
            }
        });

        prc20.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc20.setText("40.00");

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel121.setText("₱ ");

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel193)
                    .addGroup(jPanel99Layout.createSequentialGroup()
                        .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel99Layout.createSequentialGroup()
                                .addComponent(SmtMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(SmtQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel99Layout.createSequentialGroup()
                                .addComponent(jLabel121)
                                .addGap(0, 0, 0)
                                .addComponent(prc20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SmtStk5)
                            .addComponent(SmtAdd5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel99Layout.createSequentialGroup()
                        .addComponent(jLabel193)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc20)
                                .addComponent(jLabel121))
                            .addComponent(SmtStk5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SmtMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SmtAdd5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SmtQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel41);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        OptnSz1.addTab("tab1", jPanel26);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane6.setPreferredSize(new java.awt.Dimension(460, 435));

        jPanel44.setBackground(new java.awt.Color(245, 245, 245));
        jPanel44.setPreferredSize(new java.awt.Dimension(455, 850));

        jPanel88.setBackground(new java.awt.Color(255, 255, 255));
        jPanel88.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milktea/darkchoco.jpg"))); // NOI18N
        jLabel169.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel169.setMinimumSize(new java.awt.Dimension(0, 0));

        MmtMin1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtMin1.setText("-");
        MmtMin1.setMaximumSize(new java.awt.Dimension(40, 30));
        MmtMin1.setMinimumSize(new java.awt.Dimension(40, 30));
        MmtMin1.setPreferredSize(new java.awt.Dimension(40, 30));
        MmtMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtMin1ActionPerformed(evt);
            }
        });

        MmtAdd1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtAdd1.setText("+");
        MmtAdd1.setToolTipText("trewq");
        MmtAdd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MmtAdd1.setMaximumSize(new java.awt.Dimension(40, 30));
        MmtAdd1.setMinimumSize(new java.awt.Dimension(40, 30));
        MmtAdd1.setPreferredSize(new java.awt.Dimension(40, 30));
        MmtAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtAdd1ActionPerformed(evt);
            }
        });

        jLabel171.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel171.setText("DARK CHOCO");

        MmtStk1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        MmtStk1.setForeground(new java.awt.Color(102, 102, 102));
        MmtStk1.setText("50");

        MmtQty1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtQty1.setText("0");
        MmtQty1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        MmtQty1.setMinimumSize(new java.awt.Dimension(0, 0));
        MmtQty1.setPreferredSize(new java.awt.Dimension(70, 30));
        MmtQty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtQty1ActionPerformed(evt);
            }
        });

        prc21.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc21.setText("40.00");

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel109.setText("₱ ");

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel171)
                    .addGroup(jPanel88Layout.createSequentialGroup()
                        .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel88Layout.createSequentialGroup()
                                .addComponent(MmtMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(MmtQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel88Layout.createSequentialGroup()
                                .addComponent(jLabel109)
                                .addGap(0, 0, 0)
                                .addComponent(prc21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MmtStk1)
                            .addComponent(MmtAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel88Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel171)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc21)
                                .addComponent(jLabel109))
                            .addComponent(MmtStk1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MmtMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MmtAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MmtQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel90.setBackground(new java.awt.Color(255, 255, 255));
        jPanel90.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milktea/hokaido.jpg"))); // NOI18N
        jLabel175.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel175.setMinimumSize(new java.awt.Dimension(0, 0));

        MmtMin2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtMin2.setText("-");
        MmtMin2.setMaximumSize(new java.awt.Dimension(40, 30));
        MmtMin2.setMinimumSize(new java.awt.Dimension(40, 30));
        MmtMin2.setPreferredSize(new java.awt.Dimension(40, 30));
        MmtMin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtMin2ActionPerformed(evt);
            }
        });

        MmtAdd2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtAdd2.setText("+");
        MmtAdd2.setToolTipText("trewq");
        MmtAdd2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MmtAdd2.setMaximumSize(new java.awt.Dimension(40, 30));
        MmtAdd2.setMinimumSize(new java.awt.Dimension(40, 30));
        MmtAdd2.setPreferredSize(new java.awt.Dimension(40, 30));
        MmtAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtAdd2ActionPerformed(evt);
            }
        });

        jLabel177.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel177.setText("HOKAIDO");

        MmtStk2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        MmtStk2.setForeground(new java.awt.Color(102, 102, 102));
        MmtStk2.setText("50");

        MmtQty2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtQty2.setText("0");
        MmtQty2.setMaximumSize(new java.awt.Dimension(1000, 1000));
        MmtQty2.setMinimumSize(new java.awt.Dimension(0, 0));
        MmtQty2.setPreferredSize(new java.awt.Dimension(70, 30));
        MmtQty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtQty2ActionPerformed(evt);
            }
        });

        prc22.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc22.setText("40.00");

        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel111.setText("₱ ");

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel177)
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel90Layout.createSequentialGroup()
                                .addComponent(MmtMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(MmtQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel90Layout.createSequentialGroup()
                                .addComponent(jLabel111)
                                .addGap(0, 0, 0)
                                .addComponent(prc22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MmtStk2)
                            .addComponent(MmtAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc22)
                                .addComponent(jLabel111))
                            .addComponent(MmtStk2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MmtMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MmtAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MmtQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel91.setBackground(new java.awt.Color(255, 255, 255));
        jPanel91.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milktea/matcha.jpg"))); // NOI18N
        jLabel178.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel178.setMinimumSize(new java.awt.Dimension(0, 0));

        MmtMin3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtMin3.setText("-");
        MmtMin3.setMaximumSize(new java.awt.Dimension(40, 30));
        MmtMin3.setMinimumSize(new java.awt.Dimension(40, 30));
        MmtMin3.setPreferredSize(new java.awt.Dimension(40, 30));
        MmtMin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtMin3ActionPerformed(evt);
            }
        });

        MmtAdd3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtAdd3.setText("+");
        MmtAdd3.setToolTipText("trewq");
        MmtAdd3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MmtAdd3.setMaximumSize(new java.awt.Dimension(40, 30));
        MmtAdd3.setMinimumSize(new java.awt.Dimension(40, 30));
        MmtAdd3.setPreferredSize(new java.awt.Dimension(40, 30));
        MmtAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtAdd3ActionPerformed(evt);
            }
        });

        jLabel180.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel180.setText("MATCHA");

        MmtStk3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        MmtStk3.setForeground(new java.awt.Color(102, 102, 102));
        MmtStk3.setText("50");

        MmtQty3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtQty3.setText("0");
        MmtQty3.setMaximumSize(new java.awt.Dimension(1000, 1000));
        MmtQty3.setMinimumSize(new java.awt.Dimension(0, 0));
        MmtQty3.setPreferredSize(new java.awt.Dimension(70, 30));
        MmtQty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtQty3ActionPerformed(evt);
            }
        });

        prc23.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc23.setText("40.00");

        jLabel113.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel113.setText("₱ ");

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel180)
                    .addGroup(jPanel91Layout.createSequentialGroup()
                        .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel91Layout.createSequentialGroup()
                                .addComponent(MmtMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(MmtQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel91Layout.createSequentialGroup()
                                .addComponent(jLabel113)
                                .addGap(0, 0, 0)
                                .addComponent(prc23)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MmtStk3)
                            .addComponent(MmtAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel91Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel180)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MmtStk3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prc23)
                            .addComponent(jLabel113))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MmtMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MmtAdd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MmtQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel92.setBackground(new java.awt.Color(255, 255, 255));
        jPanel92.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milktea/okinawa.jpg"))); // NOI18N
        jLabel181.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel181.setMinimumSize(new java.awt.Dimension(0, 0));

        MmtMin4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtMin4.setText("-");
        MmtMin4.setMaximumSize(new java.awt.Dimension(40, 30));
        MmtMin4.setMinimumSize(new java.awt.Dimension(40, 30));
        MmtMin4.setPreferredSize(new java.awt.Dimension(40, 30));
        MmtMin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtMin4ActionPerformed(evt);
            }
        });

        MmtAdd4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtAdd4.setText("+");
        MmtAdd4.setToolTipText("trewq");
        MmtAdd4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MmtAdd4.setMaximumSize(new java.awt.Dimension(40, 30));
        MmtAdd4.setMinimumSize(new java.awt.Dimension(40, 30));
        MmtAdd4.setPreferredSize(new java.awt.Dimension(40, 30));
        MmtAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtAdd4ActionPerformed(evt);
            }
        });

        jLabel183.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel183.setText("OKINAWA");

        MmtStk4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        MmtStk4.setForeground(new java.awt.Color(102, 102, 102));
        MmtStk4.setText("50");

        MmtQty4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtQty4.setText("0");
        MmtQty4.setMaximumSize(new java.awt.Dimension(1000, 1000));
        MmtQty4.setMinimumSize(new java.awt.Dimension(0, 0));
        MmtQty4.setPreferredSize(new java.awt.Dimension(70, 30));
        MmtQty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtQty4ActionPerformed(evt);
            }
        });

        prc24.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc24.setText("40.00");

        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel115.setText("₱ ");

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel183)
                    .addGroup(jPanel92Layout.createSequentialGroup()
                        .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel92Layout.createSequentialGroup()
                                .addComponent(MmtMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(MmtQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel92Layout.createSequentialGroup()
                                .addComponent(jLabel115)
                                .addGap(0, 0, 0)
                                .addComponent(prc24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MmtStk4)
                            .addComponent(MmtAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel92Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel183)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc24)
                                .addComponent(jLabel115))
                            .addComponent(MmtStk4))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MmtMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MmtAdd4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MmtQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel93.setBackground(new java.awt.Color(255, 255, 255));
        jPanel93.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milktea/matcha.jpg"))); // NOI18N
        jLabel184.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel184.setMinimumSize(new java.awt.Dimension(0, 0));

        MmtMin5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtMin5.setText("-");
        MmtMin5.setMaximumSize(new java.awt.Dimension(40, 30));
        MmtMin5.setMinimumSize(new java.awt.Dimension(40, 30));
        MmtMin5.setPreferredSize(new java.awt.Dimension(40, 30));
        MmtMin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtMin5ActionPerformed(evt);
            }
        });

        MmtAdd5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtAdd5.setText("+");
        MmtAdd5.setToolTipText("trewq");
        MmtAdd5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MmtAdd5.setMaximumSize(new java.awt.Dimension(40, 30));
        MmtAdd5.setMinimumSize(new java.awt.Dimension(40, 30));
        MmtAdd5.setPreferredSize(new java.awt.Dimension(40, 30));
        MmtAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtAdd5ActionPerformed(evt);
            }
        });

        jLabel186.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel186.setText("WINTERMELON");

        MmtStk5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        MmtStk5.setForeground(new java.awt.Color(102, 102, 102));
        MmtStk5.setText("50");

        MmtQty5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MmtQty5.setText("0");
        MmtQty5.setMaximumSize(new java.awt.Dimension(1000, 1000));
        MmtQty5.setMinimumSize(new java.awt.Dimension(0, 0));
        MmtQty5.setPreferredSize(new java.awt.Dimension(70, 30));
        MmtQty5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmtQty5ActionPerformed(evt);
            }
        });

        prc25.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc25.setText("40.00");

        jLabel117.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel117.setText("₱ ");

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel186)
                    .addGroup(jPanel93Layout.createSequentialGroup()
                        .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel93Layout.createSequentialGroup()
                                .addComponent(MmtMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(MmtQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel93Layout.createSequentialGroup()
                                .addComponent(jLabel117)
                                .addGap(0, 0, 0)
                                .addComponent(prc25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MmtStk5)
                            .addComponent(MmtAdd5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel93Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel186)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc25)
                                .addComponent(jLabel117))
                            .addComponent(MmtStk5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MmtMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MmtAdd5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MmtQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel44);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        OptnSz1.addTab("tab2", jPanel28);

        jPanel20.add(OptnSz1);
        OptnSz1.setBounds(0, 81, 460, 470);

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cate.addTab("MILKTEA", jPanel35);

        jPanel22.setBackground(new java.awt.Color(245, 245, 245));

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane10.setPreferredSize(new java.awt.Dimension(463, 460));

        jPanel40.setBackground(new java.awt.Color(245, 245, 245));
        jPanel40.setPreferredSize(new java.awt.Dimension(455, 850));

        jPanel76.setBackground(new java.awt.Color(255, 255, 255));
        jPanel76.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/frappee/chocoblast.jpg"))); // NOI18N
        jLabel130.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel130.setMinimumSize(new java.awt.Dimension(0, 0));

        frMin2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frMin2.setText("-");
        frMin2.setMaximumSize(new java.awt.Dimension(40, 30));
        frMin2.setMinimumSize(new java.awt.Dimension(40, 30));
        frMin2.setPreferredSize(new java.awt.Dimension(40, 30));
        frMin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frMin2ActionPerformed(evt);
            }
        });

        frAdd2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frAdd2.setText("+");
        frAdd2.setToolTipText("trewq");
        frAdd2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        frAdd2.setMaximumSize(new java.awt.Dimension(40, 30));
        frAdd2.setMinimumSize(new java.awt.Dimension(40, 30));
        frAdd2.setPreferredSize(new java.awt.Dimension(40, 30));
        frAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frAdd2ActionPerformed(evt);
            }
        });

        jLabel132.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel132.setText("CHOCO BLAST");

        frStk2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        frStk2.setForeground(new java.awt.Color(102, 102, 102));
        frStk2.setText("50");

        frQty2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frQty2.setText("0");
        frQty2.setMaximumSize(new java.awt.Dimension(1000, 1000));
        frQty2.setMinimumSize(new java.awt.Dimension(0, 0));
        frQty2.setPreferredSize(new java.awt.Dimension(70, 30));
        frQty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frQty2ActionPerformed(evt);
            }
        });

        jLabel123.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel123.setText("₱ ");

        prc27.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc27.setText("40.00");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel132)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel76Layout.createSequentialGroup()
                                .addComponent(frMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(frQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel76Layout.createSequentialGroup()
                                .addComponent(jLabel123)
                                .addGap(0, 0, 0)
                                .addComponent(prc27)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frStk2)
                            .addComponent(frAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel132)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc27)
                                .addComponent(jLabel123))
                            .addComponent(frStk2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel77.setBackground(new java.awt.Color(255, 255, 255));
        jPanel77.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/frappee/caramel.jpg"))); // NOI18N
        jLabel134.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel134.setMinimumSize(new java.awt.Dimension(0, 0));

        frMin1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frMin1.setText("-");
        frMin1.setMaximumSize(new java.awt.Dimension(40, 30));
        frMin1.setMinimumSize(new java.awt.Dimension(40, 30));
        frMin1.setPreferredSize(new java.awt.Dimension(40, 30));
        frMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frMin1ActionPerformed(evt);
            }
        });

        frAdd1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frAdd1.setText("+");
        frAdd1.setToolTipText("trewq");
        frAdd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        frAdd1.setMaximumSize(new java.awt.Dimension(40, 30));
        frAdd1.setMinimumSize(new java.awt.Dimension(40, 30));
        frAdd1.setPreferredSize(new java.awt.Dimension(40, 30));
        frAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frAdd1ActionPerformed(evt);
            }
        });

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel136.setText("CARAMEL");

        frStk1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        frStk1.setForeground(new java.awt.Color(102, 102, 102));
        frStk1.setText("50");

        frQty1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frQty1.setText("0");
        frQty1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        frQty1.setMinimumSize(new java.awt.Dimension(0, 0));
        frQty1.setPreferredSize(new java.awt.Dimension(70, 30));
        frQty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frQty1ActionPerformed(evt);
            }
        });

        jLabel122.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel122.setText("₱ ");

        prc26.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc26.setText("40.00");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel136)
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addComponent(frMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(frQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addComponent(jLabel122)
                                .addGap(0, 0, 0)
                                .addComponent(prc26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frStk1)
                            .addComponent(frAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc26)
                                .addComponent(jLabel122))
                            .addComponent(frStk1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel78.setBackground(new java.awt.Color(255, 255, 255));
        jPanel78.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/frappee/matchaGreen.jpg"))); // NOI18N
        jLabel138.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel138.setMinimumSize(new java.awt.Dimension(0, 0));

        frMin3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frMin3.setText("-");
        frMin3.setMaximumSize(new java.awt.Dimension(40, 30));
        frMin3.setMinimumSize(new java.awt.Dimension(40, 30));
        frMin3.setPreferredSize(new java.awt.Dimension(40, 30));
        frMin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frMin3ActionPerformed(evt);
            }
        });

        frAdd3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frAdd3.setText("+");
        frAdd3.setToolTipText("trewq");
        frAdd3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        frAdd3.setMaximumSize(new java.awt.Dimension(40, 30));
        frAdd3.setMinimumSize(new java.awt.Dimension(40, 30));
        frAdd3.setPreferredSize(new java.awt.Dimension(40, 30));
        frAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frAdd3ActionPerformed(evt);
            }
        });

        jLabel140.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel140.setText("MATCHA GREEN");

        frStk3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        frStk3.setForeground(new java.awt.Color(102, 102, 102));
        frStk3.setText("50");

        frQty3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frQty3.setText("0");
        frQty3.setMaximumSize(new java.awt.Dimension(1000, 1000));
        frQty3.setMinimumSize(new java.awt.Dimension(0, 0));
        frQty3.setPreferredSize(new java.awt.Dimension(70, 30));
        frQty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frQty3ActionPerformed(evt);
            }
        });

        jLabel124.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel124.setText("₱ ");

        prc28.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc28.setText("40.00");

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140)
                    .addGroup(jPanel78Layout.createSequentialGroup()
                        .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel78Layout.createSequentialGroup()
                                .addComponent(frMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(frQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel78Layout.createSequentialGroup()
                                .addComponent(jLabel124)
                                .addGap(0, 0, 0)
                                .addComponent(prc28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frStk3)
                            .addComponent(frAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel78Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel140)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frStk3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prc28)
                            .addComponent(jLabel124))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frAdd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel79.setBackground(new java.awt.Color(255, 255, 255));
        jPanel79.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/frappee/mocha.jpg"))); // NOI18N
        jLabel142.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel142.setMinimumSize(new java.awt.Dimension(0, 0));

        frMin4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frMin4.setText("-");
        frMin4.setMaximumSize(new java.awt.Dimension(40, 30));
        frMin4.setMinimumSize(new java.awt.Dimension(40, 30));
        frMin4.setPreferredSize(new java.awt.Dimension(40, 30));
        frMin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frMin4ActionPerformed(evt);
            }
        });

        frAdd4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frAdd4.setText("+");
        frAdd4.setToolTipText("trewq");
        frAdd4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        frAdd4.setMaximumSize(new java.awt.Dimension(40, 30));
        frAdd4.setMinimumSize(new java.awt.Dimension(40, 30));
        frAdd4.setPreferredSize(new java.awt.Dimension(40, 30));
        frAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frAdd4ActionPerformed(evt);
            }
        });

        jLabel144.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel144.setText("MOCHA");
        jLabel144.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLabel144MouseWheelMoved(evt);
            }
        });

        frStk4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        frStk4.setForeground(new java.awt.Color(102, 102, 102));
        frStk4.setText("50");

        frQty4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frQty4.setText("0");
        frQty4.setMaximumSize(new java.awt.Dimension(1000, 1000));
        frQty4.setMinimumSize(new java.awt.Dimension(0, 0));
        frQty4.setPreferredSize(new java.awt.Dimension(70, 30));
        frQty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frQty4ActionPerformed(evt);
            }
        });

        jLabel125.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel125.setText("₱ ");

        prc29.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc29.setText("40.00");

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel144)
                    .addGroup(jPanel79Layout.createSequentialGroup()
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel79Layout.createSequentialGroup()
                                .addComponent(frMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(frQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel79Layout.createSequentialGroup()
                                .addComponent(jLabel125)
                                .addGap(0, 0, 0)
                                .addComponent(prc29)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frStk4)
                            .addComponent(frAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel79Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel144)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc29)
                                .addComponent(jLabel125))
                            .addComponent(frStk4))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frAdd4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel80.setBackground(new java.awt.Color(255, 255, 255));
        jPanel80.setPreferredSize(new java.awt.Dimension(200, 275));

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/frappee/strawberryCreme.jpg"))); // NOI18N
        jLabel146.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel146.setMinimumSize(new java.awt.Dimension(0, 0));

        frMin5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frMin5.setText("-");
        frMin5.setMaximumSize(new java.awt.Dimension(40, 30));
        frMin5.setMinimumSize(new java.awt.Dimension(40, 30));
        frMin5.setPreferredSize(new java.awt.Dimension(40, 30));
        frMin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frMin5ActionPerformed(evt);
            }
        });

        frAdd5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frAdd5.setText("+");
        frAdd5.setToolTipText("trewq");
        frAdd5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        frAdd5.setMaximumSize(new java.awt.Dimension(40, 30));
        frAdd5.setMinimumSize(new java.awt.Dimension(40, 30));
        frAdd5.setPreferredSize(new java.awt.Dimension(40, 30));
        frAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frAdd5ActionPerformed(evt);
            }
        });

        jLabel148.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel148.setText("STRAWBERRY CREME");

        frStk5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        frStk5.setForeground(new java.awt.Color(102, 102, 102));
        frStk5.setText("50");

        frQty5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        frQty5.setText("0");
        frQty5.setMaximumSize(new java.awt.Dimension(1000, 1000));
        frQty5.setMinimumSize(new java.awt.Dimension(0, 0));
        frQty5.setPreferredSize(new java.awt.Dimension(70, 30));
        frQty5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frQty5ActionPerformed(evt);
            }
        });

        jLabel126.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel126.setText("₱ ");

        prc30.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        prc30.setText("40.00");

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel148)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(frMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(frQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(jLabel126)
                                .addGap(0, 0, 0)
                                .addComponent(prc30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frStk5)
                            .addComponent(frAdd5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel148)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prc30)
                                .addComponent(jLabel126))
                            .addComponent(frStk5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frAdd5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jScrollPane10.setViewportView(jPanel40);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setPreferredSize(new java.awt.Dimension(465, 48));

        jLabel17.setFont(new java.awt.Font("Script MT Bold", 0, 19)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("A frappe a day keeps the bad mood away.");
        jLabel17.setPreferredSize(new java.awt.Dimension(425, 36));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cate.addTab("FRAPPEE", jPanel39);

        jPanel1.add(cate);
        cate.setBounds(149, 50, 550, 550);

        jPanel5.add(jPanel1);
        jPanel1.setBounds(56, 44, 1255, 610);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bean4.png")); // NOI18N
        jPanel5.add(jLabel7);
        jLabel7.setBounds(1240, -20, 120, 120);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\beans-20240420T093021Z-001\\beans\\bean3.png")); // NOI18N
        jPanel5.add(jLabel6);
        jLabel6.setBounds(-20, -10, 140, 120);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bens.png")); // NOI18N
        jPanel5.add(jLabel8);
        jLabel8.setBounds(20, 620, 60, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bens.png")); // NOI18N
        jPanel5.add(jLabel9);
        jLabel9.setBounds(1290, 290, 60, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bean2.png")); // NOI18N
        jPanel5.add(jLabel10);
        jLabel10.setBounds(-20, 360, 80, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bens.png")); // NOI18N
        jPanel5.add(jLabel11);
        jLabel11.setBounds(1070, 640, 60, 60);

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bean3.png")); // NOI18N
        jPanel5.add(jLabel27);
        jLabel27.setBounds(1330, 540, 60, 60);

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bean2.png")); // NOI18N
        jPanel5.add(jLabel28);
        jLabel28.setBounds(710, 640, 60, 60);

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\bean3.png")); // NOI18N
        jPanel5.add(jLabel29);
        jLabel29.setBounds(290, 640, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frMin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frMin2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(frQty2.getText());
        Float prc = Float.valueOf(prc27.getText());
        if (i > 0) {
            frMin2.setEnabled(true);
            frAdd2.setEnabled(true);
            i--;
            frQty2.setText(String.valueOf(i));
            addtables("Choco Blast", prc, i, prc);
            int j = Integer.valueOf(frStk2.getText());
            ++j;
            frStk2.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frMin2.setEnabled(false);
            frAdd2.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_frMin2ActionPerformed

    private void frQty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frQty2ActionPerformed
        // TODO add your handling code here:
        Price1 myprc27 = new Price27();
        myprc27.Prices();
        frQty2.setText("0");
        frAdd2.setEnabled(true);
        frMin2.setEnabled(true);
        Float prc = Float.valueOf(prc27.getText());
        int i = 0;
        addtables("Choco Blast", prc, i, prc);
        Del();
        int emT = Integer.valueOf(frStk2.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Choco Blast", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    frAdd2.setEnabled(false);
                    frMin2.setEnabled(true);
                }
                j = j - i;
                frStk2.setText(String.valueOf(j));
                frQty2.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frAdd2.setEnabled(true);
            frMin2.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_frQty2ActionPerformed

    private void frMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frMin1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(frQty1.getText());
        Float prc = Float.valueOf(prc26.getText());
        if (i > 0) {
            frMin1.setEnabled(true);
            frAdd1.setEnabled(true);
            i--;
            frQty1.setText(String.valueOf(i));
            addtables("Caramel", prc, i, prc);
            int j = Integer.valueOf(frStk1.getText());
            ++j;
            frStk1.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frMin1.setEnabled(false);
            frAdd1.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_frMin1ActionPerformed

    private void frQty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frQty1ActionPerformed
        // TODO add your handling code here:
        Price1 myprc26 = new Price26();
        myprc26.Prices();
        frQty1.setText("0");
        frAdd1.setEnabled(true);
        frMin1.setEnabled(true);
        Float prc = Float.valueOf(prc26.getText());
        int i = 0;
        addtables("Caramel", prc, i, prc);
        Del();
        int emT = Integer.valueOf(frStk1.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Caramel", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    frAdd1.setEnabled(false);
                    frMin1.setEnabled(true);
                }
                j = j - i;
                frStk1.setText(String.valueOf(j));
                frQty1.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frAdd1.setEnabled(true);
            frMin1.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_frQty1ActionPerformed

    private void frMin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frMin3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(frQty3.getText());
        Float prc = Float.valueOf(prc28.getText());
        if (i > 0) {
            frMin3.setEnabled(true);
            frAdd3.setEnabled(true);
            i--;
            frQty3.setText(String.valueOf(i));
            addtables("Matcha Green", prc, i, prc);
            int j = Integer.valueOf(frStk3.getText());
            ++j;
            frStk3.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frMin3.setEnabled(false);
            frAdd3.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_frMin3ActionPerformed

    private void frQty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frQty3ActionPerformed
        // TODO add your handling code here:
        Price1 myprc28 = new Price28();
        myprc28.Prices();
        frQty3.setText("0");
        frAdd3.setEnabled(true);
        frMin3.setEnabled(true);
        Float prc = Float.valueOf(prc28.getText());
        int i = 0;
        addtables("Matcha Green", prc, i, prc);
        Del();
        int emT = Integer.valueOf(frStk3.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Matcha Green", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    frAdd3.setEnabled(false);
                    frMin3.setEnabled(true);
                }
                j = j - i;
                frStk3.setText(String.valueOf(j));
                frQty3.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frAdd3.setEnabled(true);
            frMin3.setEnabled(false);
        }
        Del();
        cal();

    }//GEN-LAST:event_frQty3ActionPerformed

    private void qty5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty5ActionPerformed
        // TODO add your handling code here:
        Price1 myprc5 = new Price5();
        myprc5.Prices();
        qty5.setText("0");
        add5.setEnabled(true);
        min5.setEnabled(true);
        Float prc = Float.valueOf(prc5.getText());
        int i = 0;
        addtables("Macchiato", prc, i, prc);
        Del();
        int emT = Integer.valueOf(stk5.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Macchiato", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    add5.setEnabled(false);
                    min5.setEnabled(true);
                }
                j = j - i;
                stk5.setText(String.valueOf(j));
                qty5.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            add5.setEnabled(true);
            min5.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_qty5ActionPerformed

    private void min5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(qty5.getText());
        Float prc = Float.valueOf(prc5.getText());
        if (i > 0) {
            min5.setEnabled(true);
            add5.setEnabled(true);
            i--;
            qty5.setText(String.valueOf(i));
            addtables("Macchiato", prc, i, prc);
            int j = Integer.valueOf(stk5.getText());
            ++j;
            stk5.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            min5.setEnabled(false);
            add5.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_min5ActionPerformed

    private void qty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty4ActionPerformed
        // TODO add your handling code here:
        Price1 myprc4 = new Price4();
        myprc4.Prices();
        qty4.setText("0");
        add4.setEnabled(true);
        min4.setEnabled(true);
        Float prc = Float.valueOf(prc4.getText());
        int i = 0;
        addtables("Espresso", prc, i, prc);
        Del();
        int emT = Integer.valueOf(stk4.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Espresso", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    add4.setEnabled(false);
                    min4.setEnabled(true);
                }
                j = j - i;
                stk4.setText(String.valueOf(j));
                qty4.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            add4.setEnabled(true);
            min4.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_qty4ActionPerformed

    private void min4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(qty4.getText());
        Float prc = Float.valueOf(prc4.getText());
        if (i > 0) {
            min4.setEnabled(true);
            add4.setEnabled(true);
            i--;
            qty4.setText(String.valueOf(i));
            addtables("Espresso", prc, i, prc);
            int j = Integer.valueOf(stk4.getText());
            ++j;
            stk4.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            min4.setEnabled(false);
            add4.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_min4ActionPerformed

    private void qty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty3ActionPerformed
        // TODO add your handling code here:
        Price1 myprc3 = new Price3();
        myprc3.Prices();
        qty3.setText("0");
        add3.setEnabled(true);
        min3.setEnabled(true);
        Float prc = Float.valueOf(prc3.getText());
        int i = 0;
        addtables("Cappuccino", prc, i, prc);
        Del();
        int emT = Integer.valueOf(stk3.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Cappuccino", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    add3.setEnabled(false);
                    min3.setEnabled(true);
                }
                j = j - i;
                stk3.setText(String.valueOf(j));
                qty3.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            add3.setEnabled(true);
            min3.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_qty3ActionPerformed

    private void min3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(qty3.getText());
        Float prc = Float.valueOf(prc3.getText());
        if (i > 0) {
            min3.setEnabled(true);
            add3.setEnabled(true);
            i--;
            qty3.setText(String.valueOf(i));
            addtables("Cappuccino", prc, i, prc);
            int j = Integer.valueOf(stk3.getText());
            ++j;
            stk3.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            min3.setEnabled(false);
            add3.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_min3ActionPerformed

    private void qty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty1ActionPerformed
        // TODO add your handling code here:
        Price1 myprc1 = new Price1();
        myprc1.Prices();
        qty1.setText("0");
        add1.setEnabled(true);
        min1.setEnabled(true);
        Float prc = Float.valueOf(prc1.getText());
        int i = 0;
        addtables("Americano", prc, i, prc);
        Del();
        int emT = Integer.valueOf(stk1.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Americano", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    add1.setEnabled(false);
                    min1.setEnabled(true);
                }
                j = j - i;
                stk1.setText(String.valueOf(j));
                qty1.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            add1.setEnabled(true);
            min1.setEnabled(false);
        }
        Del();
        cal();

    }//GEN-LAST:event_qty1ActionPerformed

    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        // TODO add your handling code here:    
        int i = Integer.valueOf(qty1.getText());
        Float prc = Float.valueOf(prc1.getText());
        if (i > 0) {
            min1.setEnabled(true);
            add1.setEnabled(true);
            i--;
            qty1.setText(String.valueOf(i));
            addtables("Americano", prc, i, prc);
            int j = Integer.valueOf(stk1.getText());
            ++j;
            stk1.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            min1.setEnabled(false);
            add1.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_min1ActionPerformed

    private void qty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty2ActionPerformed
        // TODO add your handling code here:
        Price1 myprc2 = new Price2();
        myprc2.Prices();
        qty2.setText("0");
        add2.setEnabled(true);
        min2.setEnabled(true);
        Float prc = Float.valueOf(prc2.getText());
        int i = 0;
        addtables("Black Coffee", prc, i, prc);
        Del();
        int emT = Integer.valueOf(stk2.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Black Coffee", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximmum quantity");
            } else {
                if (i == emT) {
                    add2.setEnabled(false);
                    min2.setEnabled(true);
                }
                j = j - i;
                stk2.setText(String.valueOf(j));
                qty2.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            add2.setEnabled(true);
            min2.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_qty2ActionPerformed

    private void min2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(qty2.getText());
        Float prc = Float.valueOf(prc2.getText());
        if (i > 0) {
            min2.setEnabled(true);
            add2.setEnabled(true);
            i--;
            qty2.setText(String.valueOf(i));
            addtables("Black Coffee", prc, i, prc);
            int j = Integer.valueOf(stk2.getText());
            ++j;
            stk2.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            min2.setEnabled(false);
            add2.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_min2ActionPerformed

    private void hcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hcMouseClicked
        // TODO add your handling code here:
        cate.setSelectedIndex(0);
    }//GEN-LAST:event_hcMouseClicked

    private void hcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hcMousePressed
        // TODO add your handling code here:
        hcP.setBackground(clkColor);
        hc.setForeground(white);

        ccP.setBackground(white);
        cc.setForeground(clkColor);

        histP.setBackground(white);
        hist.setForeground(clkColor);

        mtP.setBackground(white);
        mt.setForeground(clkColor);

        frP.setBackground(white);
        fr.setForeground(clkColor);

        loP.setBackground(white);
        lo.setForeground(red);
    }//GEN-LAST:event_hcMousePressed

    private void ccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccMouseClicked
        // TODO add your handling code here:
        cate.setSelectedIndex(1);
    }//GEN-LAST:event_ccMouseClicked

    private void ccMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccMousePressed
        // TODO add your handling code here:
        ccP.setBackground(clkColor);
        cc.setForeground(white);

        hcP.setBackground(white);
        hc.setForeground(clkColor);

        histP.setBackground(white);
        hist.setForeground(clkColor);

        mtP.setBackground(white);
        mt.setForeground(clkColor);

        frP.setBackground(white);
        fr.setForeground(clkColor);

        loP.setBackground(white);
        lo.setForeground(red);
    }//GEN-LAST:event_ccMousePressed

    private void mtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtMouseClicked
        // TODO add your handling code here:
        cate.setSelectedIndex(2);
    }//GEN-LAST:event_mtMouseClicked

    private void mtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtMousePressed
        // TODO add your handling code here:
        mtP.setBackground(clkColor);
        mt.setForeground(white);

        histP.setBackground(white);
        hist.setForeground(clkColor);

        ccP.setBackground(white);
        cc.setForeground(clkColor);

        hcP.setBackground(white);
        hc.setForeground(clkColor);

        frP.setBackground(white);
        fr.setForeground(clkColor);

        loP.setBackground(white);
        lo.setForeground(red);
    }//GEN-LAST:event_mtMousePressed

    private void frMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frMouseClicked
        // TODO add your handling code here:
        cate.setSelectedIndex(3);

    }//GEN-LAST:event_frMouseClicked

    private void frMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frMousePressed
        // TODO add your handling code here:
        frP.setBackground(clkColor);
        fr.setForeground(white);

        ccP.setBackground(white);
        cc.setForeground(clkColor);

        mtP.setBackground(white);
        mt.setForeground(clkColor);

        hcP.setBackground(white);
        hc.setForeground(clkColor);

        loP.setBackground(white);
        lo.setForeground(red);

        histP.setBackground(white);
        hist.setForeground(clkColor);
    }//GEN-LAST:event_frMousePressed

    private void loMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loMousePressed
        // TODO add your handling code here:
        loP.setBackground(red);
        lo.setForeground(white);

        lo.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Downloads\\lgWayt (1).png")); // NOI18N

        frP.setBackground(white);
        fr.setForeground(clkColor);

        ccP.setBackground(white);
        cc.setForeground(clkColor);

        mtP.setBackground(white);
        mt.setForeground(clkColor);

        hcP.setBackground(white);
        hc.setForeground(clkColor);

        histP.setBackground(white);
        hist.setForeground(clkColor);

    }//GEN-LAST:event_loMousePressed

    private void discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountActionPerformed
        // TODO add your handling code here:
        cal();
        Double Total = Double.valueOf(tot.getText());
        Double Cash = Double.valueOf(cash.getText());
        if (Cash >= Total) {
            Double Balance = Cash - Total;
            DecimalFormat df = new DecimalFormat("00.00");
            chnge.setText(df.format(Balance));
        } else {
            JOptionPane.showMessageDialog(null, "You don't have enough cash", "Message", ERROR_MESSAGE);
            cash.setText("");
            chnge.setText("00");
        }
    }//GEN-LAST:event_discountActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
        if (tot.getText().equals("00.00") || tot.getText().equals("00")) {
            JOptionPane.showMessageDialog(null, "Please choose an item to continue paying");
            tot.setText("00");
        } else {
            if (cash.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please input some cash!!!", "Impotant message", ERROR_MESSAGE);
                chnge.setText("00");
            } else {
                Double Total = Double.valueOf(tot.getText());
                Double Cash = Double.valueOf(cash.getText());
                if (Cash >= Total) {
                    Double Balance = Cash - Total;
                    DecimalFormat df = new DecimalFormat("00.00");
                    chnge.setText(df.format(Balance));
                } else {
                    JOptionPane.showMessageDialog(null, "You don't have enough cash", "Message", ERROR_MESSAGE);
                    chnge.setText("00");
                }
            }
        }
    }//GEN-LAST:event_payActionPerformed

    private void paymentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentMethodActionPerformed

    private void tblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMousePressed
        // TODO add your handling code here:
        tblP.setBackground(clkColor);
        tbl.setForeground(white);

        rcptP.setBackground(white);
        rcpt.setForeground(clkColor);
    }//GEN-LAST:event_tblMousePressed

    private void rcptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rcptMousePressed
        // TODO add your handling code here:
        tblP.setBackground(white);
        tbl.setForeground(clkColor);

        rcptP.setBackground(clkColor);
        rcpt.setForeground(white);
    }//GEN-LAST:event_rcptMousePressed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        T_R.setSelectedIndex(0);
    }//GEN-LAST:event_tblMouseClicked

    private void rcptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rcptMouseClicked
        // TODO add your handling code here:
        T_R.setSelectedIndex(1);
    }//GEN-LAST:event_rcptMouseClicked

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(qty1.getText());
        Float prc = Float.valueOf(prc1.getText());
        ++i;
        qty1.setText(String.valueOf(i));
        addtables("Americano", prc, i, prc);
        int j = Integer.valueOf(stk1.getText());
        j--;
        stk1.setText(String.valueOf(j));

        if (j > 0) {
            min1.setEnabled(true);
            add1.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            min1.setEnabled(true);
            add1.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_add1ActionPerformed

    private void frMin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frMin4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(frQty4.getText());
        Float prc = Float.valueOf(prc29.getText());
        if (i > 0) {
            frMin4.setEnabled(true);
            frAdd4.setEnabled(true);
            i--;
            frQty4.setText(String.valueOf(i));
            addtables("Mocha", prc, i, prc);
            int j = Integer.valueOf(frStk4.getText());
            ++j;
            frStk4.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frMin4.setEnabled(false);
            frAdd4.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_frMin4ActionPerformed

    private void frQty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frQty4ActionPerformed
        // TODO add your handling code here:
        /* String Qty = JOptionPane.showInputDialog("Enter Qty");
        int i = Integer.valueOf(Qty);
        Float prc = Float.valueOf(prc29.getText());
        int j = 50;
        j = j - i;
        addtables("Mocha", prc, i, prc);
        frStk4.setText(String.valueOf(j));
        frQty4.setText(String.valueOf(i));

        if (i > 0) {
            frAdd4.setEnabled(true);
            frMin4.setEnabled(true);
            if (i > 50) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
                frStk4.setText("50");
                frQty4.setText("0");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frAdd4.setEnabled(true);
            frMin4.setEnabled(false);
        }
        Del();
        cal();*/

        Price1 myprc29 = new Price29();
        myprc29.Prices();
        frQty4.setText("0");
        frAdd4.setEnabled(true);
        frMin4.setEnabled(true);
        Float prc = Float.valueOf(prc29.getText());
        int i = 0;
        addtables("Mocha", prc, i, prc);
        Del();
        int emT = Integer.valueOf(frStk4.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Mocha", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    frAdd4.setEnabled(false);
                    frMin4.setEnabled(true);
                }
                j = j - i;
                frStk4.setText(String.valueOf(j));
                frQty4.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frAdd4.setEnabled(true);
            frMin4.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_frQty4ActionPerformed

    private void frMin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frMin5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(frQty5.getText());
        Float prc = Float.valueOf(prc30.getText());
        if (i > 0) {
            frMin5.setEnabled(true);
            frAdd5.setEnabled(true);
            i--;
            frQty5.setText(String.valueOf(i));
            addtables("Strawberry Creme", prc, i, prc);
            int j = Integer.valueOf(frStk5.getText());
            ++j;
            frStk5.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frMin5.setEnabled(false);
            frAdd5.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_frMin5ActionPerformed

    private void frQty5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frQty5ActionPerformed
        // TODO add your handling code here:
        /*  String Qty = JOptionPane.showInputDialog("Enter Qty");
        int i = Integer.valueOf(Qty);
        Float prc = Float.valueOf(prc30.getText());
        int j = 50;
        j = j - i;
        addtables("Strawberry Creme", prc, i, prc);
        frStk5.setText(String.valueOf(j));
        frQty5.setText(String.valueOf(i));

        if (i > 0) {
            frAdd5.setEnabled(true);
            frMin5.setEnabled(true);
            if (i > 50) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
                frStk5.setText("50");
                frQty5.setText("0");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frAdd5.setEnabled(true);
            frMin5.setEnabled(false);
        }
        Del();
        cal();*/

        Price1 myprc30 = new Price30();
        myprc30.Prices();
        frQty5.setText("0");
        frAdd5.setEnabled(true);
        frMin5.setEnabled(true);
        Float prc = Float.valueOf(prc30.getText());
        int i = 0;
        addtables("Strawberry Creme", prc, i, prc);
        Del();
        int emT = Integer.valueOf(frStk5.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Strawberry Creme", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    frAdd5.setEnabled(false);
                    frMin5.setEnabled(true);
                }
                j = j - i;
                frStk5.setText(String.valueOf(j));
                frQty5.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            frAdd5.setEnabled(true);
            frMin5.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_frQty5ActionPerformed

    private void jLabel144MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLabel144MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel144MouseWheelMoved

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(qty2.getText());
        Float prc = Float.valueOf(prc2.getText());
        ++i;
        qty2.setText(String.valueOf(i));
        addtables("Black Coffee", prc, i, prc);
        int j = Integer.valueOf(stk2.getText());
        j--;
        stk2.setText(String.valueOf(j));

        if (j > 0) {
            min2.setEnabled(true);
            add2.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            min2.setEnabled(true);
            add2.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_add2ActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(qty3.getText());
        Float prc = Float.valueOf(prc3.getText());
        ++i;
        qty3.setText(String.valueOf(i));
        addtables("Cappuccino", prc, i, prc);
        int j = Integer.valueOf(stk3.getText());
        j--;
        stk3.setText(String.valueOf(j));

        if (j > 0) {
            min3.setEnabled(true);
            add3.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            min3.setEnabled(true);
            add3.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_add3ActionPerformed

    private void add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(qty4.getText());
        Float prc = Float.valueOf(prc4.getText());
        ++i;
        qty4.setText(String.valueOf(i));
        addtables("Espresso", prc, i, prc);
        int j = Integer.valueOf(stk4.getText());
        j--;
        stk4.setText(String.valueOf(j));

        if (j > 0) {
            min4.setEnabled(true);
            add4.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            min4.setEnabled(true);
            add4.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_add4ActionPerformed

    private void add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(qty5.getText());
        Float prc = Float.valueOf(prc5.getText());
        ++i;
        qty5.setText(String.valueOf(i));
        addtables("Macchiato", prc, i, prc);
        int j = Integer.valueOf(stk5.getText());
        j--;
        stk5.setText(String.valueOf(j));

        if (j > 0) {
            min5.setEnabled(true);
            add5.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            min5.setEnabled(true);
            add5.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_add5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int sel = jTable1.getSelectedRow();
        if (sel != -1) {
            int delete = JOptionPane.showConfirmDialog(null, "Do you want to Remove it?", "Remove Item", JOptionPane.YES_NO_OPTION);
            if (delete == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int[] rows = jTable1.getSelectedRows();
                for (int i = 0; i < rows.length; i++) {
                    String delRows = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
                    model.removeRow(rows[i] - i);
                    selectedDel(delRows);
                }
                JOptionPane.showMessageDialog(null, "Item remove");
            } else {
                JOptionPane.showMessageDialog(null, "Item canceled");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select the item you want to Remove");
        }

        cal();

        Double Total = Double.valueOf(tot.getText());
        Double Cash = Double.valueOf(cash.getText());
        if (Cash >= Total) {
            Double Balance = Cash - Total;
            DecimalFormat df = new DecimalFormat("00.00");
            chnge.setText(df.format(Balance));
        } else {
            chnge.setText("00");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:

        if (chnge.getText().equals("00")) {
            T_R.setSelectedIndex(0);
        } else {
            T_R.setSelectedIndex(1);
        }
        LocalDate date = LocalDate.now();

        if (cash.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please pay first!!!", "Impotant message", ERROR_MESSAGE);
        } else {
            Double Total = Double.valueOf(tot.getText());
            Double Cash = Double.valueOf(cash.getText());

            if (Cash < Total) {
                JOptionPane.showMessageDialog(null, "Can't print, you don't have enough cash", "Impotant message", ERROR_MESSAGE);
            } else {
                Double Balance = Cash - Total;
                DecimalFormat df = new DecimalFormat("00.00");
                chnge.setText(df.format(Balance));

                int numOfRow = jTable1.getRowCount();
                int totQty = 0;
                for (int i = 0; i < numOfRow; i++) {
                    int value = Integer.valueOf(jTable1.getValueAt(i, 2).toString());
                    totQty += value;
                }
                String disString = "None";
                if (discount.getSelectedItem().equals("PWD 15%")) {
                    disString = "15%";
                } else if (discount.getSelectedItem().equals("Senior 10%")) {
                    disString = "10%";
                } else if (discount.getSelectedItem().equals("Student 5%")) {
                    disString = "5%";
                } else {
                    disString = "None";
                }

                String pyMtod = String.valueOf(paymentMethod.getSelectedItem());

                try {
                    String transac = "1234";
                    try {

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/finalsproject", "root", "");
                        Statement statement = connection.createStatement();

                        String qryProd = "SELECT * FROM `transaction` ORDER BY TransactionID DESC LIMIT 1";
                        statement.execute(qryProd);

                        ResultSet rstransac = statement.executeQuery(qryProd);
                        while (rstransac.next()) {
                            transac = rstransac.getString("TransactionID");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        System.out.println("Error!" + e.getMessage());
                    }
                    updateStk();
                    String ToT = String.valueOf(tot.getText());
                    orderRecordB(ToT, "Paid");
                    rc.setText("\n\n");
                    rc.setText(rc.getText() + "   ------------------------------COFFEA-------------------------------\n");
                    rc.setText(rc.getText() + "   ---------------------DASMARINAS CITY CAVITE------------------\n\n");
                    rc.setText(rc.getText() + "       TRANSACTION ID: " + (Integer.valueOf(transac) + 1) + "\n");
                    rc.setText(rc.getText() + "   ----------------------------------------------------------------------\n\n");
                    rc.setText(rc.getText() + "          Item\t\tQty\tPrice\n");

                    DefaultTableModel itemTable = (DefaultTableModel) jTable1.getModel();
                    for (int i = 0; i < jTable1.getRowCount(); i++) {

                        String Item = itemTable.getValueAt(i, 0).toString();
                        String Qty = itemTable.getValueAt(i, 2).toString();
                        String totPrice = itemTable.getValueAt(i, 3).toString();
                        if (Item.length() > 11) {
                            rc.setText(rc.getText() + " " + Item + "\t" + Qty + "\t" + totPrice + "\n");
                        } else {
                            rc.setText(rc.getText() + " " + Item + "\t\t" + Qty + "\t" + totPrice + "\n");
                        }
                        orderRecord(Item, totPrice, Qty);
                    }
                    rc.setText(rc.getText() + "\n");
                    rc.setText(rc.getText() + "   ----------------------------------------------------------------------\n\n");
                    rc.setText(rc.getText() + "       Items Quantity \t:  " + totQty + "\n");
                    rc.setText(rc.getText() + "       Discount Amount\t:  " + disString + "\n");
                    rc.setText(rc.getText() + "       Payment Method \t:  " + pyMtod + "\n");
                    rc.setText(rc.getText() + "       Total Payment  \t:  " + tot.getText() + "\n");
                    rc.setText(rc.getText() + "       Cash         \t\t:  " + cash.getText() + "\n");
                    rc.setText(rc.getText() + "       Change         \t:  " + chnge.getText() + "\n\n");
                    rc.setText(rc.getText() + "   ----------------------------------------------------------------------\n\n");
                    rc.setText(rc.getText() + "             Cashier  :  " + cashier.getText() + "\n");
                    rc.setText(rc.getText() + "             Date       :  " + date + "\n\n");
                    rc.setText(rc.getText() + "   -------THANK YOU FOR BUYING PLEASE COME AGAIN-------\n\n");
                    rc.setText(rc.getText() + "   ----------------------------------------------------------------------");
                    String csh = String.valueOf(this.cash.getText());
                    String chng = String.valueOf(chnge.getText());
                    Transaction(pyMtod, disString, ToT, "123", csh, chng);

                    rc.print();

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void PrintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMousePressed
        // TODO add your handling code here:

        if (chnge.getText().equals("00")) {
            tblP.setBackground(clkColor);
            tbl.setForeground(white);

            rcptP.setBackground(white);
            rcpt.setForeground(clkColor);
        } else {
            tblP.setBackground(white);
            tbl.setForeground(clkColor);

            rcptP.setBackground(clkColor);
            rcpt.setForeground(white);
        }
    }//GEN-LAST:event_PrintMousePressed

    private void totMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_totMouseClicked

    private void n7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n7MouseClicked
        // TODO add your handling code here:
        String newNum = cash.getText();
        cash.setText(newNum + "7");
    }//GEN-LAST:event_n7MouseClicked

    private void n7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n7MousePressed
        // TODO add your handling code here:
        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(white);
        del.setForeground(clkColor);

        n7P.setBackground(clkColor);
        n7.setForeground(white);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n0P.setBackground(white);
        n0.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);
    }//GEN-LAST:event_n7MousePressed

    private void n8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n8MouseClicked
        // TODO add your handling code here:
        String newNum = cash.getText();
        cash.setText(newNum + "8");
    }//GEN-LAST:event_n8MouseClicked

    private void n8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n8MousePressed
        // TODO add your handling code here:
        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(white);
        del.setForeground(clkColor);

        n8P.setBackground(clkColor);
        n8.setForeground(white);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n0P.setBackground(white);
        n0.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);
    }//GEN-LAST:event_n8MousePressed

    private void n9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n9MouseClicked
        // TODO add your handling code here:
        String newNum = cash.getText();
        cash.setText(newNum + "9");
    }//GEN-LAST:event_n9MouseClicked

    private void n9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n9MousePressed
        // TODO add your handling code here:
        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(white);
        del.setForeground(clkColor);

        n9P.setBackground(clkColor);
        n9.setForeground(white);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n0P.setBackground(white);
        n0.setForeground(clkColor);
    }//GEN-LAST:event_n9MousePressed

    private void n6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n6MouseClicked
        // TODO add your handling code here:
        String newNum = cash.getText();
        cash.setText(newNum + "6");
    }//GEN-LAST:event_n6MouseClicked

    private void n6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n6MousePressed
        // TODO add your handling code here:
        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(white);
        del.setForeground(clkColor);

        n6P.setBackground(clkColor);
        n6.setForeground(white);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n0P.setBackground(white);
        n0.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);
    }//GEN-LAST:event_n6MousePressed

    private void n5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n5MouseClicked
        // TODO add your handling code here:
        String newNum = cash.getText();
        cash.setText(newNum + "5");
    }//GEN-LAST:event_n5MouseClicked

    private void n5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n5MousePressed
        // TODO add your handling code here:
        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(white);
        del.setForeground(clkColor);

        n5P.setBackground(clkColor);
        n5.setForeground(white);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n0P.setBackground(white);
        n0.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);
    }//GEN-LAST:event_n5MousePressed

    private void n4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n4MouseClicked
        // TODO add your handling code here:
        String newNum = cash.getText();
        cash.setText(newNum + "4");
    }//GEN-LAST:event_n4MouseClicked

    private void n4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n4MousePressed
        // TODO add your handling code here:
        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(white);
        del.setForeground(clkColor);

        n4P.setBackground(clkColor);
        n4.setForeground(white);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n0P.setBackground(white);
        n0.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);
    }//GEN-LAST:event_n4MousePressed

    private void n1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseClicked
        // TODO add your handling code here:
        String newNum = cash.getText();
        cash.setText(newNum + "1");
    }//GEN-LAST:event_n1MouseClicked

    private void n1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MousePressed
        // TODO add your handling code here:
        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(white);
        del.setForeground(clkColor);

        n1P.setBackground(clkColor);
        n1.setForeground(white);

        n0P.setBackground(white);
        n0.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);
    }//GEN-LAST:event_n1MousePressed

    private void n2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n2MouseClicked
        // TODO add your handling code here:
        String newNum = cash.getText();
        cash.setText(newNum + "2");
    }//GEN-LAST:event_n2MouseClicked

    private void n2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n2MousePressed
        // TODO add your handling code here:
        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(white);
        del.setForeground(clkColor);

        n2P.setBackground(clkColor);
        n2.setForeground(white);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n0P.setBackground(white);
        n0.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);
    }//GEN-LAST:event_n2MousePressed

    private void n3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n3MouseClicked
        // TODO add your handling code here:
        String newNum = cash.getText();
        cash.setText(newNum + "3");
    }//GEN-LAST:event_n3MouseClicked

    private void n3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n3MousePressed
        // TODO add your handling code here:
        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(white);
        del.setForeground(clkColor);

        n3P.setBackground(clkColor);
        n3.setForeground(white);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n0P.setBackground(white);
        n0.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);
    }//GEN-LAST:event_n3MousePressed

    private void delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseClicked
        // TODO add your handling code here:
        if (cash.getText().length() > 0) {
            String txt = cash.getText();
            String txtMinus = txt.substring(0, txt.length() - 1);
            cash.setText(txtMinus);
        }
    }//GEN-LAST:event_delMouseClicked

    private void delMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMousePressed
        // TODO add your handling code here:
        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(clkColor);
        del.setForeground(white);

        n0P.setBackground(white);
        n0.setForeground(clkColor);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);
    }//GEN-LAST:event_delMousePressed

    private void n0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n0MouseClicked
        // TODO add your handling code here:
        String newNum = cash.getText();
        cash.setText(newNum + "0");
        if (cash.getText().equals("0")) {
            cash.setText("");
        }
    }//GEN-LAST:event_n0MouseClicked

    private void n0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n0MousePressed
        // TODO add your handling code here:
        n0P.setBackground(clkColor);
        n0.setForeground(white);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);

        clrP.setBackground(white);
        clr.setForeground(clkColor);

        delP.setBackground(white);
        del.setForeground(clkColor);
    }//GEN-LAST:event_n0MousePressed

    private void clrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrMouseClicked
        // TODO add your handling code here
        cash.setText("");
    }//GEN-LAST:event_clrMouseClicked

    private void clrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrMousePressed
        // TODO add your handling code here:
        clrP.setBackground(clkColor);
        clr.setForeground(white);

        delP.setBackground(white);
        del.setForeground(clkColor);

        n0P.setBackground(white);
        n0.setForeground(clkColor);

        n1P.setBackground(white);
        n1.setForeground(clkColor);

        n2P.setBackground(white);
        n2.setForeground(clkColor);

        n3P.setBackground(white);
        n3.setForeground(clkColor);

        n4P.setBackground(white);
        n4.setForeground(clkColor);

        n5P.setBackground(white);
        n5.setForeground(clkColor);

        n6P.setBackground(white);
        n6.setForeground(clkColor);

        n7P.setBackground(white);
        n7.setForeground(clkColor);

        n8P.setBackground(white);
        n8.setForeground(clkColor);

        n9P.setBackground(white);
        n9.setForeground(clkColor);
    }//GEN-LAST:event_clrMousePressed

    private void tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MouseClicked
        // TODO add your handling code here:
        OptnSz.setSelectedIndex(0);
    }//GEN-LAST:event_tbl1MouseClicked

    private void tbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MousePressed
        // TODO add your handling code here:
        tblP1.setBackground(clkColor);
        tbl1.setForeground(white);

        rcptP1.setBackground(white);
        rcpt1.setForeground(clkColor);
    }//GEN-LAST:event_tbl1MousePressed

    private void rcpt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rcpt1MouseClicked
        // TODO add your handling code here:
        OptnSz.setSelectedIndex(1);
    }//GEN-LAST:event_rcpt1MouseClicked

    private void rcpt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rcpt1MousePressed
        // TODO add your handling code here:
        tblP1.setBackground(white);
        tbl1.setForeground(clkColor);

        rcptP1.setBackground(clkColor);
        rcpt1.setForeground(white);
    }//GEN-LAST:event_rcpt1MousePressed

    private void SccMin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccMin2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SccQty2.getText());
        Float prc = Float.valueOf(prc7.getText());
        if (i > 0) {
            SccMin2.setEnabled(true);
            SccAdd2.setEnabled(true);
            i--;
            SccQty2.setText(String.valueOf(i));
            addtables("Ice Americano(S)", prc, i, prc);
            int j = Integer.valueOf(SccStk2.getText());
            ++j;
            SccStk2.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SccMin2.setEnabled(false);
            SccAdd2.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_SccMin2ActionPerformed

    private void SccQty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccQty2ActionPerformed
        // TODO add your handling code here:
        Price1 myprc7 = new Price7();
        myprc7.Prices();
        SccQty2.setText("0");
        SccAdd2.setEnabled(true);
        SccMin2.setEnabled(true);
        Float prc = Float.valueOf(prc7.getText());
        int i = 0;
        addtables("Ice Americano(S)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(SccStk2.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Ice Americano(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    SccAdd2.setEnabled(false);
                    SccMin2.setEnabled(true);
                }
                j = j - i;
                SccStk2.setText(String.valueOf(j));
                SccQty2.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SccAdd2.setEnabled(true);
            SccMin2.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_SccQty2ActionPerformed

    private void SccMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccMin1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SccQty1.getText());
        Float prc = Float.valueOf(prc6.getText());
        if (i > 0) {
            SccMin1.setEnabled(true);
            SccAdd1.setEnabled(true);
            i--;
            SccQty1.setText(String.valueOf(i));
            addtables("Affogato(S)", prc, i, prc);
            int j = Integer.valueOf(SccStk1.getText());
            ++j;
            SccStk1.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SccMin1.setEnabled(false);
            SccAdd1.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_SccMin1ActionPerformed

    private void SccAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccAdd1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SccQty1.getText());
        Float prc = Float.valueOf(prc6.getText());
        ++i;
        SccQty1.setText(String.valueOf(i));
        addtables("Affogato(S)", prc, i, prc);
        int j = Integer.valueOf(SccStk1.getText());
        j--;
        SccStk1.setText(String.valueOf(j));

        if (j > 0) {
            SccMin1.setEnabled(true);
            SccAdd1.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            SccMin1.setEnabled(true);
            SccAdd1.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_SccAdd1ActionPerformed

    private void SccQty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccQty1ActionPerformed
        // TODO add your handling code here
        Price1 myprc6 = new Price6();
        myprc6.Prices();
        SccQty1.setText("0");
        SccAdd1.setEnabled(true);
        SccMin1.setEnabled(true);
        Float prc = Float.valueOf(prc6.getText());
        int i = 0;
        addtables("Affogato(S)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(SccStk1.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Affogato(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    SccAdd1.setEnabled(false);
                    SccMin1.setEnabled(true);
                }
                j = j - i;
                SccStk1.setText(String.valueOf(j));
                SccQty1.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SccAdd1.setEnabled(true);
            SccMin1.setEnabled(false);
        }
        Del();
        cal();

    }//GEN-LAST:event_SccQty1ActionPerformed

    private void SccMin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccMin3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SccQty3.getText());
        Float prc = Float.valueOf(prc8.getText());
        if (i > 0) {
            SccMin3.setEnabled(true);
            SccAdd3.setEnabled(true);
            i--;
            SccQty3.setText(String.valueOf(i));
            addtables("Ice Mocha(S)", prc, i, prc);
            int j = Integer.valueOf(SccStk3.getText());
            ++j;
            SccStk3.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SccMin3.setEnabled(false);
            SccAdd3.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_SccMin3ActionPerformed

    private void SccQty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccQty3ActionPerformed
        // TODO add your handling code here:
        Price1 myprc8 = new Price8();
        myprc8.Prices();
        SccQty3.setText("0");
        SccAdd3.setEnabled(true);
        SccMin3.setEnabled(true);
        Float prc = Float.valueOf(prc8.getText());
        int i = 0;
        addtables("Ice Mocha(S)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(SccStk3.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Ice Mocha(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    SccAdd3.setEnabled(false);
                    SccMin3.setEnabled(true);
                }
                j = j - i;
                SccStk3.setText(String.valueOf(j));
                SccQty3.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SccAdd3.setEnabled(true);
            SccMin3.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_SccQty3ActionPerformed

    private void SccMin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccMin4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SccQty4.getText());
        Float prc = Float.valueOf(prc9.getText());
        if (i > 0) {
            SccMin4.setEnabled(true);
            SccAdd4.setEnabled(true);
            i--;
            SccQty4.setText(String.valueOf(i));
            addtables("Ice Black(S)", prc, i, prc);
            int j = Integer.valueOf(SccStk4.getText());
            ++j;
            SccStk4.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SccMin4.setEnabled(false);
            SccAdd4.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_SccMin4ActionPerformed

    private void SccQty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccQty4ActionPerformed
        // TODO add your handling code here:
        Price1 myprc9 = new Price9();
        myprc9.Prices();
        SccQty4.setText("0");
        SccAdd4.setEnabled(true);
        SccMin4.setEnabled(true);
        Float prc = Float.valueOf(prc9.getText());
        int i = 0;
        addtables("Ice Black(S)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(SccStk4.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Ice Black(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    SccAdd4.setEnabled(false);
                    SccMin4.setEnabled(true);
                }
                j = j - i;
                SccStk4.setText(String.valueOf(j));
                SccQty4.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SccAdd4.setEnabled(true);
            SccMin4.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_SccQty4ActionPerformed

    private void SccMin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccMin5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SccQty5.getText());
        Float prc = Float.valueOf(prc10.getText());
        if (i > 0) {
            SccMin5.setEnabled(true);
            SccAdd5.setEnabled(true);
            i--;
            SccQty5.setText(String.valueOf(i));
            addtables("Ice Latte(S)", prc, i, prc);
            int j = Integer.valueOf(SccStk5.getText());
            ++j;
            SccStk5.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SccMin5.setEnabled(false);
            SccAdd5.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_SccMin5ActionPerformed

    private void SccQty5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccQty5ActionPerformed
        // TODO add your handling code here:
        Price1 myprc10 = new Price10();
        myprc10.Prices();
        SccQty5.setText("0");
        SccAdd5.setEnabled(true);
        SccMin5.setEnabled(true);
        Float prc = Float.valueOf(prc10.getText());
        int i = 0;
        addtables("Ice Latte(S)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(SccStk5.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Ice Latte(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    SccAdd5.setEnabled(false);
                    SccMin5.setEnabled(true);
                }
                j = j - i;
                SccStk5.setText(String.valueOf(j));
                SccQty5.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SccAdd5.setEnabled(true);
            SccMin5.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_SccQty5ActionPerformed

    private void MccMin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccMin2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MccQty2.getText());
        Float prc = Float.valueOf(prc12.getText());
        if (i > 0) {
            MccMin2.setEnabled(true);
            MccAdd2.setEnabled(true);
            i--;
            MccQty2.setText(String.valueOf(i));
            addtables("Ice Americano(M)", prc, i, prc);
            int j = Integer.valueOf(MccStk2.getText());
            ++j;
            MccStk2.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MccMin2.setEnabled(false);
            MccAdd2.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_MccMin2ActionPerformed

    private void MccQty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccQty2ActionPerformed
        // TODO add your handling code here:
        Price1 myprc12 = new Price12();
        myprc12.Prices();
        MccQty2.setText("0");
        MccAdd2.setEnabled(true);
        MccMin2.setEnabled(true);
        Float prc = Float.valueOf(prc12.getText());
        int i = 0;
        addtables("Ice Americano(M)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(MccStk2.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Ice Americano(M)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    MccAdd2.setEnabled(false);
                    MccMin2.setEnabled(true);
                }
                j = j - i;
                MccStk2.setText(String.valueOf(j));
                MccQty2.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MccAdd2.setEnabled(true);
            MccMin2.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_MccQty2ActionPerformed

    private void MccMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccMin1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MccQty1.getText());
        Float prc = Float.valueOf(prc11.getText());
        if (i > 0) {
            MccMin1.setEnabled(true);
            MccAdd1.setEnabled(true);
            i--;
            MccQty1.setText(String.valueOf(i));
            addtables("Affogato(M)", prc, i, prc);
            int j = Integer.valueOf(MccStk1.getText());
            ++j;
            MccStk1.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MccMin1.setEnabled(false);
            MccAdd1.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_MccMin1ActionPerformed

    private void MccAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccAdd1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MccQty1.getText());
        Float prc = Float.valueOf(prc11.getText());
        ++i;
        MccQty1.setText(String.valueOf(i));
        addtables("Affogato(M)", prc, i, prc);
        int j = Integer.valueOf(MccStk1.getText());
        j--;
        MccStk1.setText(String.valueOf(j));

        if (j > 0) {
            MccMin1.setEnabled(true);
            MccAdd1.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            MccMin1.setEnabled(true);
            MccAdd1.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_MccAdd1ActionPerformed

    private void MccQty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccQty1ActionPerformed
        // TODO add your handling code here:
        Price1 myprc11 = new Price11();
        myprc11.Prices();
        MccQty1.setText("0");
        MccAdd1.setEnabled(true);
        MccMin1.setEnabled(true);
        Float prc = Float.valueOf(prc11.getText());
        int i = 0;
        addtables("Affogato(M)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(MccStk1.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Affogato(M)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    MccAdd1.setEnabled(false);
                    MccMin1.setEnabled(true);
                }
                j = j - i;
                MccStk1.setText(String.valueOf(j));
                MccQty1.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MccAdd1.setEnabled(true);
            MccMin1.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_MccQty1ActionPerformed

    private void MccMin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccMin3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MccQty3.getText());
        Float prc = Float.valueOf(prc13.getText());
        if (i > 0) {
            MccMin3.setEnabled(true);
            MccAdd3.setEnabled(true);
            i--;
            MccQty3.setText(String.valueOf(i));
            addtables("Ice Mocha(M)", prc, i, prc);
            int j = Integer.valueOf(MccStk3.getText());
            ++j;
            MccStk3.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MccMin3.setEnabled(false);
            MccAdd3.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_MccMin3ActionPerformed

    private void MccQty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccQty3ActionPerformed
        // TODO add your handling code here:
        Price1 myprc13 = new Price13();
        myprc13.Prices();
        MccQty3.setText("0");
        MccAdd3.setEnabled(true);
        MccMin3.setEnabled(true);
        Float prc = Float.valueOf(prc13.getText());
        int i = 0;
        addtables("Ice Mocha(M)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(MccStk3.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Ice Mocha(M)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    MccAdd3.setEnabled(false);
                    MccMin3.setEnabled(true);
                }
                j = j - i;
                MccStk3.setText(String.valueOf(j));
                MccQty3.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MccAdd3.setEnabled(true);
            MccMin3.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_MccQty3ActionPerformed

    private void MccMin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccMin4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MccQty4.getText());
        Float prc = Float.valueOf(prc14.getText());
        if (i > 0) {
            MccMin4.setEnabled(true);
            MccAdd4.setEnabled(true);
            i--;
            MccQty4.setText(String.valueOf(i));
            addtables("Ice Black(M)", prc, i, prc);
            int j = Integer.valueOf(MccStk4.getText());
            ++j;
            MccStk4.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MccMin4.setEnabled(false);
            MccAdd4.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_MccMin4ActionPerformed

    private void MccQty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccQty4ActionPerformed
        // TODO add your handling code here:
        Price1 myprc14 = new Price14();
        myprc14.Prices();
        MccQty4.setText("0");
        MccAdd4.setEnabled(true);
        MccMin4.setEnabled(true);
        Float prc = Float.valueOf(prc14.getText());
        int i = 0;
        addtables("Ice Black(M)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(MccStk4.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Ice Black(M)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    MccAdd4.setEnabled(false);
                    MccMin4.setEnabled(true);
                }
                j = j - i;
                MccStk4.setText(String.valueOf(j));
                MccQty4.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MccAdd4.setEnabled(true);
            MccMin4.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_MccQty4ActionPerformed

    private void MccMin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccMin5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MccQty5.getText());
        Float prc = Float.valueOf(prc15.getText());
        if (i > 0) {
            MccMin5.setEnabled(true);
            MccAdd5.setEnabled(true);
            i--;
            MccQty5.setText(String.valueOf(i));
            addtables("Ice Latte(M)", prc, i, prc);
            int j = Integer.valueOf(MccStk5.getText());
            ++j;
            MccStk5.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MccMin5.setEnabled(false);
            MccAdd5.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_MccMin5ActionPerformed

    private void MccQty5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccQty5ActionPerformed
        // TODO add your handling code here:
        Price1 myprc15 = new Price15();
        myprc15.Prices();
        MccQty5.setText("0");
        MccAdd5.setEnabled(true);
        MccMin5.setEnabled(true);
        Float prc = Float.valueOf(prc15.getText());
        int i = 0;
        addtables("Ice Latte(M)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(MccStk5.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Ice Latte(M)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    MccAdd5.setEnabled(false);
                    MccMin5.setEnabled(true);
                }
                j = j - i;
                MccStk5.setText(String.valueOf(j));
                MccQty5.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MccAdd5.setEnabled(true);
            MccMin5.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_MccQty5ActionPerformed

    private void SccAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccAdd2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SccQty2.getText());
        Float prc = Float.valueOf(prc7.getText());
        ++i;
        SccQty2.setText(String.valueOf(i));
        addtables("Ice Americano(S)", prc, i, prc);
        int j = Integer.valueOf(SccStk2.getText());
        j--;
        SccStk2.setText(String.valueOf(j));

        if (j > 0) {
            SccMin2.setEnabled(true);
            SccAdd2.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            SccMin2.setEnabled(true);
            SccAdd2.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_SccAdd2ActionPerformed

    private void SccAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccAdd3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SccQty3.getText());
        Float prc = Float.valueOf(prc8.getText());
        ++i;
        SccQty3.setText(String.valueOf(i));
        addtables("Ice Mocha(S)", prc, i, prc);
        int j = Integer.valueOf(SccStk3.getText());
        j--;
        SccStk3.setText(String.valueOf(j));

        if (j > 0) {
            SccMin3.setEnabled(true);
            SccAdd3.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            SccMin3.setEnabled(true);
            SccAdd3.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_SccAdd3ActionPerformed

    private void SccAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccAdd4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SccQty4.getText());
        Float prc = Float.valueOf(prc9.getText());
        ++i;
        SccQty4.setText(String.valueOf(i));
        addtables("Ice Black(S)", prc, i, prc);
        int j = Integer.valueOf(SccStk4.getText());
        j--;
        SccStk4.setText(String.valueOf(j));

        if (j > 0) {
            SccMin4.setEnabled(true);
            SccAdd4.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            SccMin4.setEnabled(true);
            SccAdd4.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_SccAdd4ActionPerformed

    private void SccAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SccAdd5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SccQty5.getText());
        Float prc = Float.valueOf(prc10.getText());
        ++i;
        SccQty5.setText(String.valueOf(i));
        addtables("Ice Latte(S)", prc, i, prc);
        int j = Integer.valueOf(SccStk5.getText());
        j--;
        SccStk5.setText(String.valueOf(j));

        if (j > 0) {
            SccMin5.setEnabled(true);
            SccAdd5.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            SccMin5.setEnabled(true);
            SccAdd5.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_SccAdd5ActionPerformed

    private void MccAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccAdd2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MccQty2.getText());
        Float prc = Float.valueOf(prc12.getText());
        ++i;
        MccQty2.setText(String.valueOf(i));
        addtables("Ice Americano(M)", prc, i, prc);
        int j = Integer.valueOf(MccStk2.getText());
        j--;
        MccStk2.setText(String.valueOf(j));

        if (j > 0) {
            MccMin2.setEnabled(true);
            MccAdd2.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            MccMin2.setEnabled(true);
            MccAdd2.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_MccAdd2ActionPerformed

    private void MccAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccAdd3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MccQty3.getText());
        Float prc = Float.valueOf(prc13.getText());
        ++i;
        MccQty3.setText(String.valueOf(i));
        addtables("Ice Mocha(M)", prc, i, prc);
        int j = Integer.valueOf(MccStk3.getText());
        j--;
        MccStk3.setText(String.valueOf(j));

        if (j > 0) {
            MccMin3.setEnabled(true);
            MccAdd3.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            MccMin3.setEnabled(true);
            MccAdd3.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_MccAdd3ActionPerformed

    private void MccAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccAdd4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MccQty4.getText());
        Float prc = Float.valueOf(prc14.getText());
        ++i;
        MccQty4.setText(String.valueOf(i));
        addtables("Ice Black(M)", prc, i, prc);
        int j = Integer.valueOf(MccStk4.getText());
        j--;
        MccStk4.setText(String.valueOf(j));

        if (j > 0) {
            MccMin4.setEnabled(true);
            MccAdd4.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            MccMin4.setEnabled(true);
            MccAdd4.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_MccAdd4ActionPerformed

    private void MccAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MccAdd5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MccQty5.getText());
        Float prc = Float.valueOf(prc15.getText());
        ++i;
        MccQty5.setText(String.valueOf(i));
        addtables("Ice Latte(M)", prc, i, prc);
        int j = Integer.valueOf(MccStk5.getText());
        j--;
        MccStk5.setText(String.valueOf(j));

        if (j > 0) {
            MccMin5.setEnabled(true);
            MccAdd5.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            MccMin5.setEnabled(true);
            MccAdd5.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_MccAdd5ActionPerformed

    private void tbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl2MouseClicked
        // TODO add your handling code here:
        OptnSz1.setSelectedIndex(0);
    }//GEN-LAST:event_tbl2MouseClicked

    private void tbl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl2MousePressed
        // TODO add your handling code here:
        tblP2.setBackground(clkColor);
        tbl2.setForeground(white);

        rcptP3.setBackground(white);
        rcpt3.setForeground(clkColor);
    }//GEN-LAST:event_tbl2MousePressed

    private void SmtQty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtQty1ActionPerformed
        // TODO add your handling code here:
        Price1 myprc16 = new Price16();
        myprc16.Prices();
        SmtQty1.setText("0");
        SmtAdd1.setEnabled(true);
        SmtMin1.setEnabled(true);
        Float prc = Float.valueOf(prc16.getText());
        int i = 0;
        addtables("Dark Choco(S)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(SmtStk1.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Dark Choco(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    SmtAdd1.setEnabled(false);
                    SmtMin1.setEnabled(true);
                }
                j = j - i;
                SmtStk1.setText(String.valueOf(j));
                SmtQty1.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SmtAdd1.setEnabled(true);
            SmtMin1.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_SmtQty1ActionPerformed

    private void SmtAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtAdd1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SmtQty1.getText());
        Float prc = Float.valueOf(prc16.getText());
        ++i;
        SmtQty1.setText(String.valueOf(i));
        addtables("Dark Choco(S)", prc, i, prc);
        int j = Integer.valueOf(SmtStk1.getText());
        j--;
        SmtStk1.setText(String.valueOf(j));

        if (j > 0) {
            SmtMin1.setEnabled(true);
            SmtAdd1.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            SmtMin1.setEnabled(true);
            SmtAdd1.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_SmtAdd1ActionPerformed

    private void SmtMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtMin1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SmtQty1.getText());
        Float prc = Float.valueOf(prc16.getText());
        if (i > 0) {
            SmtMin1.setEnabled(true);
            SmtAdd1.setEnabled(true);
            i--;
            SmtQty1.setText(String.valueOf(i));
            addtables("Dark Choco(S)", prc, i, prc);
            int j = Integer.valueOf(SmtStk1.getText());
            ++j;
            SmtStk1.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SmtMin1.setEnabled(false);
            SmtAdd1.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_SmtMin1ActionPerformed

    private void SmtMin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtMin2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SmtQty2.getText());
        Float prc = Float.valueOf(prc17.getText());
        if (i > 0) {
            SmtMin2.setEnabled(true);
            SmtAdd2.setEnabled(true);
            i--;
            SmtQty2.setText(String.valueOf(i));
            addtables("Hokaido(S)", prc, i, prc);
            int j = Integer.valueOf(SmtStk2.getText());
            ++j;
            SmtStk2.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SmtMin2.setEnabled(false);
            SmtAdd2.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_SmtMin2ActionPerformed

    private void SmtAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtAdd2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SmtQty2.getText());
        Float prc = Float.valueOf(prc17.getText());
        ++i;
        SmtQty2.setText(String.valueOf(i));
        addtables("Hokaido(S)", prc, i, prc);
        int j = Integer.valueOf(SmtStk2.getText());
        j--;
        SmtStk2.setText(String.valueOf(j));

        if (j > 0) {
            SmtMin2.setEnabled(true);
            SmtAdd2.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            SmtMin2.setEnabled(true);
            SmtAdd2.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_SmtAdd2ActionPerformed

    private void SmtQty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtQty2ActionPerformed
        // TODO add your handling code here:
        Price1 myprc17 = new Price17();
        myprc17.Prices();
        SmtQty2.setText("0");
        SmtAdd2.setEnabled(true);
        SmtMin2.setEnabled(true);
        Float prc = Float.valueOf(prc17.getText());
        int i = 0;
        addtables("Hokaido(S)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(SmtStk2.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Hokaido(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    SmtAdd2.setEnabled(false);
                    SmtMin2.setEnabled(true);
                }
                j = j - i;
                SmtStk2.setText(String.valueOf(j));
                SmtQty2.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SmtAdd2.setEnabled(true);
            SmtMin2.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_SmtQty2ActionPerformed

    private void SmtMin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtMin3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SmtQty3.getText());
        Float prc = Float.valueOf(prc18.getText());
        if (i > 0) {
            SmtMin3.setEnabled(true);
            SmtAdd3.setEnabled(true);
            i--;
            SmtQty3.setText(String.valueOf(i));
            addtables("Matcha(S)", prc, i, prc);
            int j = Integer.valueOf(SmtStk3.getText());
            ++j;
            SmtStk3.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SmtMin3.setEnabled(false);
            SmtAdd3.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_SmtMin3ActionPerformed

    private void SmtAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtAdd3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SmtQty3.getText());
        Float prc = Float.valueOf(prc18.getText());
        ++i;
        SmtQty3.setText(String.valueOf(i));
        addtables("Matcha(S)", prc, i, prc);
        int j = Integer.valueOf(SmtStk3.getText());
        j--;
        SmtStk3.setText(String.valueOf(j));

        if (j > 0) {
            SmtMin3.setEnabled(true);
            SmtAdd3.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            SmtMin3.setEnabled(true);
            SmtAdd3.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_SmtAdd3ActionPerformed

    private void SmtQty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtQty3ActionPerformed
        // TODO add your handling code here:
        Price1 myprc18 = new Price18();
        myprc18.Prices();
        SmtQty3.setText("0");
        SmtAdd3.setEnabled(true);
        SmtMin3.setEnabled(true);
        Float prc = Float.valueOf(prc18.getText());
        int i = 0;
        addtables("Matcha(S)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(SmtStk3.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Matcha(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    SmtAdd3.setEnabled(false);
                    SmtMin3.setEnabled(true);
                }
                j = j - i;
                SmtStk3.setText(String.valueOf(j));
                SmtQty3.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SmtAdd3.setEnabled(true);
            SmtMin3.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_SmtQty3ActionPerformed

    private void SmtMin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtMin4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SmtQty4.getText());
        Float prc = Float.valueOf(prc19.getText());
        if (i > 0) {
            SmtMin4.setEnabled(true);
            SmtAdd4.setEnabled(true);
            i--;
            SmtQty4.setText(String.valueOf(i));
            addtables("Okinawa(S)", prc, i, prc);
            int j = Integer.valueOf(SmtStk4.getText());
            ++j;
            SmtStk4.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SmtMin4.setEnabled(false);
            SmtAdd4.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_SmtMin4ActionPerformed

    private void SmtAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtAdd4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SmtQty4.getText());
        Float prc = Float.valueOf(prc19.getText());
        ++i;
        SmtQty4.setText(String.valueOf(i));
        addtables("Okinawa(S)", prc, i, prc);
        int j = Integer.valueOf(SmtStk4.getText());
        j--;
        SmtStk4.setText(String.valueOf(j));

        if (j > 0) {
            SmtMin4.setEnabled(true);
            SmtAdd4.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            SmtMin4.setEnabled(true);
            SmtAdd4.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_SmtAdd4ActionPerformed

    private void SmtQty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtQty4ActionPerformed
        // TODO add your handling code here:
        Price1 myprc19 = new Price19();
        myprc19.Prices();
        SmtQty4.setText("0");
        SmtAdd4.setEnabled(true);
        SmtMin4.setEnabled(true);
        Float prc = Float.valueOf(prc19.getText());
        int i = 0;
        addtables("Okinawa(S)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(SmtStk4.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Okinawa(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    SmtAdd4.setEnabled(false);
                    SmtMin4.setEnabled(true);
                }
                j = j - i;
                SmtStk4.setText(String.valueOf(j));
                SmtQty4.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SmtAdd4.setEnabled(true);
            SmtMin4.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_SmtQty4ActionPerformed

    private void SmtMin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtMin5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SmtQty5.getText());
        Float prc = Float.valueOf(prc20.getText());
        if (i > 0) {
            SmtMin5.setEnabled(true);
            SmtAdd5.setEnabled(true);
            i--;
            SmtQty5.setText(String.valueOf(i));
            addtables("Wintermelon(S)", prc, i, prc);
            int j = Integer.valueOf(SmtStk5.getText());
            ++j;
            SmtStk5.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SmtMin5.setEnabled(false);
            SmtAdd5.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_SmtMin5ActionPerformed

    private void SmtAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtAdd5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SmtQty5.getText());
        Float prc = Float.valueOf(prc20.getText());
        ++i;
        SmtQty5.setText(String.valueOf(i));
        addtables("Wintermelon(S)", prc, i, prc);
        int j = Integer.valueOf(SmtStk5.getText());
        j--;
        SmtStk5.setText(String.valueOf(j));

        if (j > 0) {
            SmtMin5.setEnabled(true);
            SmtAdd5.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            SmtMin5.setEnabled(true);
            SmtAdd5.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_SmtAdd5ActionPerformed

    private void SmtQty5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmtQty5ActionPerformed
        // TODO add your handling code here:
        Price1 myprc20 = new Price20();
        myprc20.Prices();
        SmtQty5.setText("0");
        SmtAdd5.setEnabled(true);
        SmtMin5.setEnabled(true);
        Float prc = Float.valueOf(prc20.getText());
        int i = 0;
        addtables("Wintermelon(S)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(SmtStk5.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Wintermelon(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    SmtAdd5.setEnabled(false);
                    SmtMin5.setEnabled(true);
                }
                j = j - i;
                SmtStk5.setText(String.valueOf(j));
                SmtQty5.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            SmtAdd5.setEnabled(true);
            SmtMin5.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_SmtQty5ActionPerformed

    private void MmtMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtMin1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MmtQty1.getText());
        Float prc = Float.valueOf(prc21.getText());
        if (i > 0) {
            MmtMin1.setEnabled(true);
            MmtAdd1.setEnabled(true);
            i--;
            MmtQty1.setText(String.valueOf(i));
            addtables("Dark Choco(M)", prc, i, prc);
            int j = Integer.valueOf(MmtStk1.getText());
            ++j;
            MmtStk1.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MmtMin1.setEnabled(false);
            MmtAdd1.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_MmtMin1ActionPerformed

    private void MmtAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtAdd1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MmtQty1.getText());
        Float prc = Float.valueOf(prc21.getText());
        ++i;
        MmtQty1.setText(String.valueOf(i));
        addtables("Dark Choco(M)", prc, i, prc);
        int j = Integer.valueOf(MmtStk1.getText());
        j--;
        MmtStk1.setText(String.valueOf(j));

        if (j > 0) {
            MmtMin1.setEnabled(true);
            MmtAdd1.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            MmtMin1.setEnabled(true);
            MmtAdd1.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_MmtAdd1ActionPerformed

    private void MmtQty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtQty1ActionPerformed
        // TODO add your handling code here:
        Price1 myprc21 = new Price21();
        myprc21.Prices();
        MmtQty1.setText("0");
        MmtAdd1.setEnabled(true);
        MmtMin1.setEnabled(true);
        Float prc = Float.valueOf(prc21.getText());
        int i = 0;
        addtables("Dark Choco(M)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(MmtStk1.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Dark Choco(S)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    MmtAdd1.setEnabled(false);
                    MmtMin1.setEnabled(true);
                }
                j = j - i;
                MmtStk1.setText(String.valueOf(j));
                MmtQty1.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MmtAdd1.setEnabled(true);
            MmtMin1.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_MmtQty1ActionPerformed

    private void MmtMin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtMin2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MmtQty2.getText());
        Float prc = Float.valueOf(prc22.getText());
        if (i > 0) {
            MmtMin2.setEnabled(true);
            MmtAdd2.setEnabled(true);
            i--;
            MmtQty2.setText(String.valueOf(i));
            addtables("Hokaido(M)", prc, i, prc);
            int j = Integer.valueOf(MmtStk2.getText());
            ++j;
            MmtStk2.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MmtMin2.setEnabled(false);
            MmtAdd2.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_MmtMin2ActionPerformed

    private void MmtAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtAdd2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MmtQty2.getText());
        Float prc = Float.valueOf(prc22.getText());
        ++i;
        MmtQty2.setText(String.valueOf(i));
        addtables("Hokaido(M)", prc, i, prc);
        int j = Integer.valueOf(MmtStk2.getText());
        j--;
        MmtStk2.setText(String.valueOf(j));

        if (j > 0) {
            MmtMin2.setEnabled(true);
            MmtAdd2.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            MmtMin2.setEnabled(true);
            MmtAdd2.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_MmtAdd2ActionPerformed

    private void MmtQty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtQty2ActionPerformed
        // TODO add your handling code here:
        Price1 myprc22 = new Price22();
        myprc22.Prices();
        MmtQty2.setText("0");
        MmtAdd2.setEnabled(true);
        MmtMin2.setEnabled(true);
        Float prc = Float.valueOf(prc22.getText());
        int i = 0;
        addtables("Hokaido(M)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(MmtStk2.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Hokaido(M)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    MmtAdd2.setEnabled(false);
                    MmtMin2.setEnabled(true);
                }
                j = j - i;
                MmtStk2.setText(String.valueOf(j));
                MmtQty2.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MmtAdd2.setEnabled(true);
            MmtMin2.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_MmtQty2ActionPerformed

    private void MmtMin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtMin3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MmtQty3.getText());
        Float prc = Float.valueOf(prc23.getText());
        if (i > 0) {
            MmtMin3.setEnabled(true);
            MmtAdd3.setEnabled(true);
            i--;
            MmtQty3.setText(String.valueOf(i));
            addtables("Matcha(M)", prc, i, prc);
            int j = Integer.valueOf(MmtStk3.getText());
            ++j;
            MmtStk3.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MmtMin3.setEnabled(false);
            MmtAdd3.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_MmtMin3ActionPerformed

    private void MmtAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtAdd3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MmtQty3.getText());
        Float prc = Float.valueOf(prc23.getText());
        ++i;
        MmtQty3.setText(String.valueOf(i));
        addtables("Matcha(M)", prc, i, prc);
        int j = Integer.valueOf(MmtStk3.getText());
        j--;
        MmtStk3.setText(String.valueOf(j));

        if (j > 0) {
            MmtMin3.setEnabled(true);
            MmtAdd3.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            MmtMin3.setEnabled(true);
            MmtAdd3.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_MmtAdd3ActionPerformed

    private void MmtQty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtQty3ActionPerformed
        // TODO add your handling code here:
        Price1 myprc23 = new Price23();
        myprc23.Prices();
        MmtQty3.setText("0");
        MmtAdd3.setEnabled(true);
        MmtMin3.setEnabled(true);
        Float prc = Float.valueOf(prc23.getText());
        int i = 0;
        addtables("Matcha(M)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(MmtStk3.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Matcha(M)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    MmtAdd3.setEnabled(false);
                    MmtMin3.setEnabled(true);
                }
                j = j - i;
                MmtStk3.setText(String.valueOf(j));
                MmtQty3.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MmtAdd3.setEnabled(true);
            MmtMin3.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_MmtQty3ActionPerformed

    private void MmtMin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtMin4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MmtQty4.getText());
        Float prc = Float.valueOf(prc24.getText());
        if (i > 0) {
            MmtMin4.setEnabled(true);
            MmtAdd4.setEnabled(true);
            i--;
            MmtQty4.setText(String.valueOf(i));
            addtables("Okinawa(M)", prc, i, prc);
            int j = Integer.valueOf(MmtStk4.getText());
            ++j;
            MmtStk4.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MmtMin4.setEnabled(false);
            MmtAdd4.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_MmtMin4ActionPerformed

    private void MmtAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtAdd4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MmtQty4.getText());
        Float prc = Float.valueOf(prc24.getText());
        ++i;
        MmtQty4.setText(String.valueOf(i));
        addtables("Okinawa(M)", prc, i, prc);
        int j = Integer.valueOf(MmtStk4.getText());
        j--;
        MmtStk4.setText(String.valueOf(j));

        if (j > 0) {
            MmtMin4.setEnabled(true);
            MmtAdd4.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            MmtMin4.setEnabled(true);
            MmtAdd4.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_MmtAdd4ActionPerformed

    private void MmtQty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtQty4ActionPerformed
        // TODO add your handling code here:
        Price1 myprc24 = new Price24();
        myprc24.Prices();
        MmtQty4.setText("0");
        MmtAdd4.setEnabled(true);
        MmtMin4.setEnabled(true);
        Float prc = Float.valueOf(prc24.getText());
        int i = 0;
        addtables("Okinawa(M)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(MmtStk4.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Okinawa(M)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    MmtAdd4.setEnabled(false);
                    MmtMin4.setEnabled(true);
                }
                j = j - i;
                MmtStk4.setText(String.valueOf(j));
                MmtQty4.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MmtAdd4.setEnabled(true);
            MmtMin4.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_MmtQty4ActionPerformed

    private void MmtMin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtMin5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MmtQty5.getText());
        Float prc = Float.valueOf(prc25.getText());
        if (i > 0) {
            MmtMin5.setEnabled(true);
            MmtAdd5.setEnabled(true);
            i--;
            MmtQty5.setText(String.valueOf(i));
            addtables("Wintermelon(M)", prc, i, prc);
            int j = Integer.valueOf(MmtStk5.getText());
            ++j;
            MmtStk5.setText(String.valueOf(j));
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MmtMin5.setEnabled(false);
            MmtAdd5.setEnabled(true);
        }
        Del();
        cal();
    }//GEN-LAST:event_MmtMin5ActionPerformed

    private void MmtAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtAdd5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MmtQty5.getText());
        Float prc = Float.valueOf(prc25.getText());
        ++i;
        MmtQty5.setText(String.valueOf(i));
        addtables("Wintermelon(M)", prc, i, prc);
        int j = Integer.valueOf(MmtStk5.getText());
        j--;
        MmtStk5.setText(String.valueOf(j));

        if (j > 0) {
            MmtMin5.setEnabled(true);
            MmtAdd5.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            MmtMin5.setEnabled(true);
            MmtAdd5.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_MmtAdd5ActionPerformed

    private void MmtQty5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmtQty5ActionPerformed
        // TODO add your handling code here:
        Price1 myprc25 = new Price25();
        myprc25.Prices();
        MmtQty5.setText("0");
        MmtAdd5.setEnabled(true);
        MmtMin5.setEnabled(true);
        Float prc = Float.valueOf(prc25.getText());
        int i = 0;
        addtables("Wintermelon(M)", prc, i, prc);
        Del();
        int emT = Integer.valueOf(MmtStk5.getText());
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        if (Qty.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(Qty);
        }
        int j = emT;
        addtables("Wintermelon(M)", prc, i, prc);
        if (i > 0) {
            if (i > emT) {
                JOptionPane.showMessageDialog(null, "You exceed the maximum quantity");
            } else {
                if (i == emT) {
                    MmtAdd5.setEnabled(false);
                    MmtMin5.setEnabled(true);
                }
                j = j - i;
                MmtStk5.setText(String.valueOf(j));
                MmtQty5.setText(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add first some item");
            MmtAdd5.setEnabled(true);
            MmtMin5.setEnabled(false);
        }
        Del();
        cal();
    }//GEN-LAST:event_MmtQty5ActionPerformed

    private void rcpt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rcpt3MouseClicked
        // TODO add your handling code here:
        OptnSz1.setSelectedIndex(1);
    }//GEN-LAST:event_rcpt3MouseClicked

    private void rcpt3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rcpt3MousePressed
        // TODO add your handling code here:
        tblP2.setBackground(white);
        tbl2.setForeground(clkColor);

        rcptP3.setBackground(clkColor);
        rcpt3.setForeground(white);
    }//GEN-LAST:event_rcpt3MousePressed

    private void frAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frAdd1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(frQty1.getText());
        Float prc = Float.valueOf(prc26.getText());
        ++i;
        frQty1.setText(String.valueOf(i));
        addtables("Caramel", prc, i, prc);
        int j = Integer.valueOf(frStk1.getText());
        j--;
        frStk1.setText(String.valueOf(j));

        if (j > 0) {
            frMin1.setEnabled(true);
            frAdd1.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            frMin1.setEnabled(true);
            frAdd1.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_frAdd1ActionPerformed

    private void frAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frAdd2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(frQty2.getText());
        Float prc = Float.valueOf(prc27.getText());
        ++i;
        frQty2.setText(String.valueOf(i));
        addtables("Choco Blast", prc, i, prc);
        int j = Integer.valueOf(frStk2.getText());
        j--;
        frStk2.setText(String.valueOf(j));

        if (j > 0) {
            frMin2.setEnabled(true);
            frAdd2.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            frMin2.setEnabled(true);
            frAdd2.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_frAdd2ActionPerformed

    private void frAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frAdd3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(frQty3.getText());
        Float prc = Float.valueOf(prc28.getText());
        ++i;
        frQty3.setText(String.valueOf(i));
        addtables("Matcha Green", prc, i, prc);
        int j = Integer.valueOf(frStk3.getText());
        j--;
        frStk3.setText(String.valueOf(j));

        if (j > 0) {
            frMin3.setEnabled(true);
            frAdd3.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            frMin3.setEnabled(true);
            frAdd3.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_frAdd3ActionPerformed

    private void frAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frAdd4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(frQty4.getText());
        Float prc = Float.valueOf(prc29.getText());
        ++i;
        frQty4.setText(String.valueOf(i));
        addtables("Mocha", prc, i, prc);
        int j = Integer.valueOf(frStk4.getText());
        j--;
        frStk4.setText(String.valueOf(j));

        if (j > 0) {
            frMin4.setEnabled(true);
            frAdd4.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            frMin4.setEnabled(true);
            frAdd4.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_frAdd4ActionPerformed

    private void frAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frAdd5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(frQty5.getText());
        Float prc = Float.valueOf(prc30.getText());
        ++i;
        frQty5.setText(String.valueOf(i));
        addtables("Strawberry Creme", prc, i, prc);
        int j = Integer.valueOf(frStk5.getText());
        j--;
        frStk5.setText(String.valueOf(j));

        if (j > 0) {
            frMin5.setEnabled(true);
            frAdd5.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No stocks");
            frMin5.setEnabled(true);
            frAdd5.setEnabled(false);
        }

        cal();
    }//GEN-LAST:event_frAdd5ActionPerformed

    private void loMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loMouseClicked
        // TODO add your handling code here:
        LogIn lg = new LogIn();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_loMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (rc.getText().equals("")) {
            T_R.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, "Please click Print to renew");
        } else {
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            int i = 0;
            while (i < dt.getRowCount()) {
                dt.removeRow(i);
            }
            rc.setText("");
            reset();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void histMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_histMouseClicked
        // TODO add your handling code here:
        this.toBack();
        History hstry = new History();
        hstry.setVisible(true);
        hstry.toFront();
        hstry.pack();
        hstry.setLocationRelativeTo(null);


    }//GEN-LAST:event_histMouseClicked

    private void histMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_histMousePressed
        // TODO add your handling code here:
        histP.setBackground(clkColor);
        hist.setForeground(white);

        ccP.setBackground(white);
        cc.setForeground(clkColor);

        hcP.setBackground(white);
        hc.setForeground(clkColor);

        frP.setBackground(white);
        fr.setForeground(clkColor);

        mtP.setBackground(white);
        mt.setForeground(clkColor);

        loP.setBackground(white);
        lo.setForeground(red);
    }//GEN-LAST:event_histMousePressed

    private void frMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_frMouseReleased

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        // TODO add your handling code here:
        tblP.setBackground(clkColor);
        tbl.setForeground(white);

        rcptP.setBackground(white);
        rcpt.setForeground(clkColor);
    }//GEN-LAST:event_jButton6MousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BillingSystem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingSystem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingSystem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingSystem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingSystem1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MccAdd1;
    private javax.swing.JButton MccAdd2;
    private javax.swing.JButton MccAdd3;
    private javax.swing.JButton MccAdd4;
    private javax.swing.JButton MccAdd5;
    private javax.swing.JButton MccMin1;
    private javax.swing.JButton MccMin2;
    private javax.swing.JButton MccMin3;
    private javax.swing.JButton MccMin4;
    private javax.swing.JButton MccMin5;
    private javax.swing.JButton MccQty1;
    private javax.swing.JButton MccQty2;
    private javax.swing.JButton MccQty3;
    private javax.swing.JButton MccQty4;
    private javax.swing.JButton MccQty5;
    private javax.swing.JLabel MccStk1;
    private javax.swing.JLabel MccStk2;
    private javax.swing.JLabel MccStk3;
    private javax.swing.JLabel MccStk4;
    private javax.swing.JLabel MccStk5;
    private javax.swing.JButton MmtAdd1;
    private javax.swing.JButton MmtAdd2;
    private javax.swing.JButton MmtAdd3;
    private javax.swing.JButton MmtAdd4;
    private javax.swing.JButton MmtAdd5;
    private javax.swing.JButton MmtMin1;
    private javax.swing.JButton MmtMin2;
    private javax.swing.JButton MmtMin3;
    private javax.swing.JButton MmtMin4;
    private javax.swing.JButton MmtMin5;
    private javax.swing.JButton MmtQty1;
    private javax.swing.JButton MmtQty2;
    private javax.swing.JButton MmtQty3;
    private javax.swing.JButton MmtQty4;
    private javax.swing.JButton MmtQty5;
    private javax.swing.JLabel MmtStk1;
    private javax.swing.JLabel MmtStk2;
    private javax.swing.JLabel MmtStk3;
    private javax.swing.JLabel MmtStk4;
    private javax.swing.JLabel MmtStk5;
    private javax.swing.JTabbedPane OptnSz;
    private javax.swing.JTabbedPane OptnSz1;
    private javax.swing.JButton Print;
    private javax.swing.JButton SccAdd1;
    private javax.swing.JButton SccAdd2;
    private javax.swing.JButton SccAdd3;
    private javax.swing.JButton SccAdd4;
    private javax.swing.JButton SccAdd5;
    private javax.swing.JButton SccMin1;
    private javax.swing.JButton SccMin2;
    private javax.swing.JButton SccMin3;
    private javax.swing.JButton SccMin4;
    private javax.swing.JButton SccMin5;
    private javax.swing.JButton SccQty1;
    private javax.swing.JButton SccQty2;
    private javax.swing.JButton SccQty3;
    private javax.swing.JButton SccQty4;
    private javax.swing.JButton SccQty5;
    private javax.swing.JLabel SccStk1;
    private javax.swing.JLabel SccStk2;
    private javax.swing.JLabel SccStk3;
    private javax.swing.JLabel SccStk4;
    private javax.swing.JLabel SccStk5;
    private javax.swing.JButton SmtAdd1;
    private javax.swing.JButton SmtAdd2;
    private javax.swing.JButton SmtAdd3;
    private javax.swing.JButton SmtAdd4;
    private javax.swing.JButton SmtAdd5;
    private javax.swing.JButton SmtMin1;
    private javax.swing.JButton SmtMin2;
    private javax.swing.JButton SmtMin3;
    private javax.swing.JButton SmtMin4;
    private javax.swing.JButton SmtMin5;
    private javax.swing.JButton SmtQty1;
    private javax.swing.JButton SmtQty2;
    private javax.swing.JButton SmtQty3;
    private javax.swing.JButton SmtQty4;
    private javax.swing.JButton SmtQty5;
    private javax.swing.JLabel SmtStk1;
    private javax.swing.JLabel SmtStk2;
    private javax.swing.JLabel SmtStk3;
    private javax.swing.JLabel SmtStk4;
    private javax.swing.JLabel SmtStk5;
    private javax.swing.JTabbedPane T_R;
    private javax.swing.JLabel UperDate;
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton add4;
    private javax.swing.JButton add5;
    private javax.swing.JTextField cash;
    public javax.swing.JLabel cashier;
    private javax.swing.JTabbedPane cate;
    private javax.swing.JLabel cc;
    private javax.swing.JPanel ccP;
    private javax.swing.JLabel chnge;
    private javax.swing.JLabel clr;
    private javax.swing.JPanel clrP;
    private javax.swing.JLabel del;
    private javax.swing.JPanel delP;
    private javax.swing.JComboBox<String> discount;
    public javax.swing.JLabel emploImg;
    private javax.swing.JLabel fr;
    private javax.swing.JButton frAdd1;
    private javax.swing.JButton frAdd2;
    private javax.swing.JButton frAdd3;
    private javax.swing.JButton frAdd4;
    private javax.swing.JButton frAdd5;
    private javax.swing.JButton frMin1;
    private javax.swing.JButton frMin2;
    private javax.swing.JButton frMin3;
    private javax.swing.JButton frMin4;
    private javax.swing.JButton frMin5;
    private javax.swing.JPanel frP;
    private javax.swing.JButton frQty1;
    private javax.swing.JButton frQty2;
    private javax.swing.JButton frQty3;
    private javax.swing.JButton frQty4;
    private javax.swing.JButton frQty5;
    private javax.swing.JLabel frStk1;
    private javax.swing.JLabel frStk2;
    private javax.swing.JLabel frStk3;
    private javax.swing.JLabel frStk4;
    private javax.swing.JLabel frStk5;
    private javax.swing.JLabel hc;
    private javax.swing.JPanel hcP;
    private javax.swing.JLabel hist;
    private javax.swing.JPanel histP;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lo;
    private javax.swing.JPanel loP;
    private javax.swing.JButton min1;
    private javax.swing.JButton min2;
    private javax.swing.JButton min3;
    private javax.swing.JButton min4;
    private javax.swing.JButton min5;
    private javax.swing.JLabel mt;
    private javax.swing.JPanel mtP;
    private javax.swing.JLabel n0;
    private javax.swing.JPanel n0P;
    private javax.swing.JLabel n1;
    private javax.swing.JPanel n1P;
    private javax.swing.JLabel n2;
    private javax.swing.JPanel n2P;
    private javax.swing.JLabel n3;
    private javax.swing.JPanel n3P;
    private javax.swing.JLabel n4;
    private javax.swing.JPanel n4P;
    private javax.swing.JLabel n5;
    private javax.swing.JPanel n5P;
    private javax.swing.JLabel n6;
    private javax.swing.JPanel n6P;
    private javax.swing.JLabel n7;
    private javax.swing.JPanel n7P;
    private javax.swing.JLabel n8;
    private javax.swing.JPanel n8P;
    private javax.swing.JLabel n9;
    private javax.swing.JPanel n9P;
    private javax.swing.JButton pay;
    private javax.swing.JComboBox<String> paymentMethod;
    private javax.swing.JLabel prc1;
    private javax.swing.JLabel prc10;
    private javax.swing.JLabel prc11;
    private javax.swing.JLabel prc12;
    private javax.swing.JLabel prc13;
    private javax.swing.JLabel prc14;
    private javax.swing.JLabel prc15;
    private javax.swing.JLabel prc16;
    private javax.swing.JLabel prc17;
    private javax.swing.JLabel prc18;
    private javax.swing.JLabel prc19;
    private javax.swing.JLabel prc2;
    private javax.swing.JLabel prc20;
    private javax.swing.JLabel prc21;
    private javax.swing.JLabel prc22;
    private javax.swing.JLabel prc23;
    private javax.swing.JLabel prc24;
    private javax.swing.JLabel prc25;
    private javax.swing.JLabel prc26;
    private javax.swing.JLabel prc27;
    private javax.swing.JLabel prc28;
    private javax.swing.JLabel prc29;
    private javax.swing.JLabel prc3;
    private javax.swing.JLabel prc30;
    private javax.swing.JLabel prc4;
    private javax.swing.JLabel prc5;
    private javax.swing.JLabel prc6;
    private javax.swing.JLabel prc7;
    private javax.swing.JLabel prc8;
    private javax.swing.JLabel prc9;
    private javax.swing.JButton qty1;
    private javax.swing.JButton qty2;
    private javax.swing.JButton qty3;
    private javax.swing.JButton qty4;
    private javax.swing.JButton qty5;
    private javax.swing.JTextArea rc;
    private javax.swing.JLabel rcpt;
    private javax.swing.JLabel rcpt1;
    private javax.swing.JLabel rcpt3;
    private javax.swing.JPanel rcptP;
    private javax.swing.JPanel rcptP1;
    private javax.swing.JPanel rcptP3;
    private javax.swing.JLabel stk1;
    private javax.swing.JLabel stk2;
    private javax.swing.JLabel stk3;
    private javax.swing.JLabel stk4;
    private javax.swing.JLabel stk5;
    private javax.swing.JLabel tbl;
    private javax.swing.JLabel tbl1;
    private javax.swing.JLabel tbl2;
    private javax.swing.JPanel tblP;
    private javax.swing.JPanel tblP1;
    private javax.swing.JPanel tblP2;
    private javax.swing.JLabel tot;
    javax.swing.JLabel wel;
    // End of variables declaration//GEN-END:variables
}
