package com.company.classes;

/**
 * Created by tkoleva on 07/26/16.
 */
//Task 17
public class GSMCallHistoryTest {
    private GSM gsm = new GSM();

    public void executeCallHistoryTest(){

        startCalls();
        endCalls();
        printCallsCount();
        printTotalCallCost();
        printCallDurations();
    }

    private void printCallDurations() {
        for (Call call: gsm.callHistory()) {
            System.out.println(call.getCallDuration());
        }
    }

    private void printTotalCallCost() {
        double price = 1.37;
        double totalPrice = gsm.getTotalCallPrice(price);
        System.out.println(totalPrice);
    }

    private void printCallsCount() {
        int callSize = gsm.callHistory().size();
        System.out.println(callSize);
    }

    private void endCalls() {
        //Set values to Calls
        for (Call call: gsm.callHistory()) {
            call.endCall();
        }
    }

    private void startCalls() {
        for (int i = 0; i < 4; i++) {
            gsm.addCall(new Call());
            try {
                Thread.sleep(1000 + i * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
