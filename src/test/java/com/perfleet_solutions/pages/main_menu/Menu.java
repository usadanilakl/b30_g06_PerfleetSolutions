package com.perfleet_solutions.pages.main_menu;

import org.openqa.selenium.logging.Logs;

public class Menu {
    public static class Dashboards {
        public static String[] vehicles = {"Dashboards", "Dashboard"};
        public static String[] manageDashboars = {"Dashboards", "Manage Dashboards"};
    }

    public static class Fleet {
        public static String[] vehicles = {"Fleet", "Vehicles"};
        public static String[] vehiclesOdometer = {"Fleet", "Vehicle Odometer"};
        public static String[] vehiclesCosts = {"Fleet", "Vehicle Costs"};
        public static String[] vehiclesContracts = {"Fleet", "Vehicle Contracts"};
        public static String[] fuelLogs = {"Fleet", "Vehicles Fuel Logs"};
        public static String[] serviceLogs = {"Fleet", "Vehicle Services Logs"};
        public static String[] vehiclesModel = {"Fleet", "Vehicles Model"};
    }

    public static class Customers {
        public static String[] accounts = {"Customers", "Accounts"};
        public static String[] contacts = {"Customers", "Contacts"};
    }

    public static class Sales {
        public static String[] opportunities = {"Sales", "Opportunities"};
    }

    public static class Activities {
        public static String[] calls = {"Activities", "Calls"};
        public static String[] calendarEvents = {"Activities", "Calendar Events"};
    }

    public static class Marketing {
        public static String[] calls = {"Marketing", "Campaigns"};
        public static String[] calendarEvents = {"Marketing", "Email Campaigns"};
    }

    public static class ReportsSegments {
        public static class Reports {
            public static class Accounts {
                public static String[] lifeTime = {"Reports & Segments", "Reports", "Accounts", "Life Time"};
                public static String[] byOpportunities = {"Reports & Segments", "Reports", "Accounts", "By Opportunities"};
            }

            public static class Leads {
                public static String[] leadsByDate = {"Reports & Segments", "Reports", "Leads", "Leads by Date"};

            }

            public static class Opportunities {
                public static String[] opportunitiesByStatus = {"Reports & Segments", "Reports", "Opportunities", "Opportunities by Status"};
                public static String[] wonOpportunities = {"Reports & Segments", "Reports", "Opportunities", "Won Opportunities by period"};
                public static String[] totalForecast = {"Reports & Segments", "Reports", "Opportunities", "Total Forecast"};
            }

        }

        public static String[] manageCustomReports = {"Reports & Segments", "Manage Custom Reports"};

        public static class Campaigns {
            public static String[] campaignPerformance = {"Reports & Segments", "Campaigns", "Campaign Performance"};
        }
    }
    public static class System {
        public static class UserManagement{
            public static String[] businessUnits = {"System", "User Management", "Business Units"};
        }
        public static String[] vehiclesOdometer = {"System", "Contact Group"};
        public static String[] vehiclesCosts = {"System", "Jobs"};
        public static String[] vehiclesContracts = {"System", "Menus"};
        public static String[] fuelLogs = {"System", "System Calendars"};

    }

}





