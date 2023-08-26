package com.finzlyassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class FXTrade {
        private static double usdToInrRate = 66.00;
        private static List<FXTrade1> trades = new ArrayList<>();
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("Select an option:");
                System.out.println("1. Book Trade");
                System.out.println("2. Print Trades");
                System.out.println("3. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice) {
                    case 1:

                        System.out.println("Enter customer Name:");
                        String customerName = scanner.nextLine();
                        if (isValidName(customerName)) {

                            System.out.println("Enter Currency Pair:");
                            String currencyPair = scanner.nextLine();

                            if (!currencyPair.equals("USDINR")) {
                                System.out.println("Invalid currency pair. Only USDINR is supported.");
                                return;
                            }

                            System.out.println("Enter amount to transfer:");
                            double amount = scanner.nextDouble();
                            if (amount <= 0) {
                                System.out.println("Enter valid amount");
                            } else {
                                System.out.println("Do you want to get Rate? (Yes/No)");
                                scanner.nextLine();
                                String rateChoice = scanner.nextLine();

                                if (rateChoice.equalsIgnoreCase("Yes")) {
                                    System.out.println("You are transferring INR " + amount * usdToInrRate +
                                            " to " + customerName + ". (Assuming that rate was " + usdToInrRate + ")");
                                }

                                System.out.println("Book/Cancel this trade? (Book/Cancel)");
                                String bookChoice = scanner.nextLine();

                                if (bookChoice.equalsIgnoreCase("Book")) {
                                    trades.add(new FXTrade1(currencyPair, customerName, amount, usdToInrRate));
                                    System.out.println("Trade for USDINR has been booked with rate " + usdToInrRate +
                                            ". The amount of Rs " + (amount * usdToInrRate) + " will be transferred in 2 working days to " + customerName + ".");
                                } else if (bookChoice.equalsIgnoreCase("Cancel")) {
                                    System.out.println("Trade is Canceled.");
                                }
                            }
                        }else{
                            System.out.println("Enter Valid Name");
                        }
                        break;
                    case 2:

                        System.out.println("TradeNo CurrencyPair CustomerName Amount Rate");
                        for (FXTrade1 trade : trades) {
                            System.out.println(trade.getTradeNo() + " " + trade.getCurrencyPair() + " " +
                                    trade.getCustomerName() + " INR" + (trade.getAmount() * trade.getRate()) + " " + trade.getRate());
                        }
                        break;
                    case 3:
                        exit = exitConfirmation(scanner);
                        break;
                    default:
                        System.out.println("Invalid option. Please select a valid option.");
                }

            }

            System.out.println("Bye - have a good day");
        }
        public static boolean isValidName(String name) {

            String regex = "^[a-zA-Z\\s]+$";


            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(name);


            return matcher.matches();
        }




        private static boolean exitConfirmation(Scanner scanner) {
            System.out.println("Do you really want to exit (Y/N)");
            String choice = scanner.nextLine();
            return choice.equalsIgnoreCase("Y");
        }
    }


