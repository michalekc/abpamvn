package com.abpa;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Database {

    private Collection<Player> milwaukee = new ArrayList<>();
    private Collection<Player> chicagoC = new ArrayList<>();
    private Collection<Player> stlouis = new ArrayList<>();
    private Collection<Player> pittsburgh = new ArrayList<>();
    private Collection<Player> cincinnati = new ArrayList<>();
    private Collection<Player> atlanta = new ArrayList<>();
    private Collection<Player> newyorkM = new ArrayList<>();
    private Collection<Player> washington = new ArrayList<>();
    private Collection<Player> miami = new ArrayList<>();
    private Collection<Player> philadelphia = new ArrayList<>();
    private Collection<Player> sandiego = new ArrayList<>();
    private Collection<Player> sanfrancisco = new ArrayList<>();
    private Collection<Player> losangelesD = new ArrayList<>();
    private Collection<Player> colorado = new ArrayList<>();
    private Collection<Player> arizona = new ArrayList<>();
    private Collection<Player> toronto = new ArrayList<>();
    private Collection<Player> tampabay = new ArrayList<>();
    private Collection<Player> baltimore = new ArrayList<>();
    private Collection<Player> newyorkY = new ArrayList<>();
    private Collection<Player> boston = new ArrayList<>();
    private Collection<Player> cleveland = new ArrayList<>();
    private Collection<Player> detroit = new ArrayList<>();
    private Collection<Player> minnesota = new ArrayList<>();
    private Collection<Player> kansascity = new ArrayList<>();
    private Collection<Player> chicagoW = new ArrayList<>();
    private Collection<Player> seattle = new ArrayList<>();
    private Collection<Player> losangelesA = new ArrayList<>();
    private Collection<Player> oakland = new ArrayList<>();
    private Collection<Player> texas = new ArrayList<>();
    private Collection<Player> houston = new ArrayList<>();

    void fill(List<String[]> allRows) {
        
        for(String[] row: allRows) {
            Player r = new Player(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8],
                row[9], row[10], row[11], row[12], row[13], row[14], row[15], row[16], row[17],
                row[18], row[19], row[20], row[21], row[22], row[23], row[24], row[25], row[26],
                row[27], row[28], row[29], row[30], row[31], row[32], row[33], row[34], row[35],
                row[36], row[37], row[38], row[39], row[40], row[41], row[42], row[43], row[44],
                row[45], row[46], row[47], row[48], row[49], row[50], row[51], row[52], row[53],
                row[54], row[55], row[56], row[57], row[58], row[59], row[60], row[61], row[62],
                row[63], row[64], row[65], row[66], row[67], row[68], row[69], row[70], row[71],
                row[72], row[73], row[74], row[75], row[76], row[77], row[78], row[79], row[80]);

            if(r.getTeam().equalsIgnoreCase("Milwaukee Brewers")) {
                milwaukee.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Chicago Cubs")) {
                chicagoC.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Cincinnati Reds")) {
                cincinnati.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Pittsburgh Pirates")) {
                pittsburgh.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("St. Louis Cardinals")) {
                stlouis.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Colorado Rockies")) {
                colorado.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("San Francisco Giants")) {
                sanfrancisco.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Los Angeles Dodgers")) {
                losangelesD.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("San Diego Padres")) {
                sandiego.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Arizona Diamondbacks")) {
                arizona.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("New York Mets")) {
                newyorkM.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Philadelphia Phillies")) {
                philadelphia.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Miami Marlins")) {
                miami.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Washington Nationals")) {
                washington.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Atlanta Braves")) {
                atlanta.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Toronto Blue Jays")) {
                toronto.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Boston Red Sox")) {
                boston.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("New York Yankees")) {
                newyorkY.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Tampa Bay Rays")) {
                tampabay.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Baltimore Orioles")) {
                baltimore.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Houston Astros")) {
                houston.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Seattle Mariners")) {
                seattle.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Los Angeles Angels")) {
                losangelesA.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Texas Rangers")) {
                texas.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Oakland Athletics")) {
                oakland.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Detroit Tigers")) {
                detroit.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Cleveland Indians")) {
                cleveland.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Minnesota Twins")) {
                minnesota.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Kansas City Royals")) {
                kansascity.add(r);
            }
            if(r.getTeam().equalsIgnoreCase("Chicago White Sox")) {
                chicagoW.add(r);
            }
        }

    }

    ObservableList<Player> getMilwaukee() {
        return milwaukee.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getChicagoCubs() {
        return chicagoC.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getPirates() {
        return pittsburgh.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getReds() {
        return cincinnati.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getCardinals() {
        return stlouis.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getBraves() {
        return atlanta.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getNationals() {
        return washington.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getMets() {
        return newyorkM.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getPhillies() {
        return philadelphia.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getMarlins() {
        return miami.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getPadres() {
        return sandiego.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getDBacks() {
        return arizona.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getRockies() {
        return colorado.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getDodgers() {
        return losangelesD.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getGiants() {
        return sanfrancisco.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getToronto() {
        return toronto.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getRedSox() {
        return boston.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getOrioles() {
        return baltimore.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getRays() {
        return tampabay.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getYankees() {
        return newyorkY.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getIndians() {
        return cleveland.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getTigers() {
        return detroit.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getTwins() {
        return minnesota.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getWhiteSox() {
        return chicagoW.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getRoyals() {
        return kansascity.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getAstros() {
        return houston.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getAs() {
        return oakland.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getMariners() {
        return seattle.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getAngels() {
        return losangelesA.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }
    ObservableList<Player> getRangers() {
        return texas.stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
    }

}
