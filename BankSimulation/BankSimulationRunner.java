package BankSimulation;

/**
 * @author Fabian Zelaya
 * @version 1.0
 * @created Sun Sep 11, 20222
 * 
 * @description Simulating a Queue of Waiting Customers.
 * 
 * @instructions This program uses a Queue to simulate a line of customers
 *               waiting to be served at a bank.
 * 
 */

public class BankSimulationRunner {
    public static void main(String[] args) {
        final double START_TIME = 9 * 60; // 9 a.m.
        final double END_TIME = 17 * 60; // 5 p.m.

        final int NTELLERS = 5;

        Simulation sim = new BankSimulation(NTELLERS);
        sim.addEvent(new Arrival(START_TIME));
        sim.run(START_TIME, END_TIME);
    }
}
// FZ

/**
 * Sample output:
 * 
 * 9:00:00 AM 0 customers in line 5 customers being served
 * 
 */