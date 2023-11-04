package com.perfleet_solutions.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainMenu {
    private static List<String> dashboard = new ArrayList<>(Arrays.asList("Dashboard", "Manage Dashboards"));
    private static List<String> fleet = new ArrayList<>(Arrays.asList(
            "Vehicles",
            "Vehicles Odometer",
            "Vehicles Costs",
            "Vehicles Contracts",
            "Vehicles Fuel Logs",
            "Vehicles Service Logs",
            "Vehicles Model"
    ));
    private static List<String> sales = new ArrayList<>(Arrays.asList("Opportunities"));
    private static List<String> activities = new ArrayList<>(Arrays.asList("Calls", "Calendar Events"));
    private static List<String> marketing = new ArrayList<>(Arrays.asList("Campaigns", "Email Campaigns"));
    private static List<String> reportsAndSegments = new ArrayList<>(Arrays.asList("Calls", "Calendar Events"));
    private static List<String> system = new ArrayList<>(Arrays.asList("Calls", "Calendar Events"));
}
