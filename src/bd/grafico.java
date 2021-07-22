/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Lincoln dos Reis
 */
public class grafico {
    int nTerritoriais=0,nRaciais=0,nReligiosos=0,nEconomicos=0;
    public void fetchData(){
            Connection conn = null;
            String url = "jdbc:postgresql://localhost/EPBD2";
            Properties props = new Properties();
            props.setProperty("user","postgres");
            props.setProperty("password","admin");
            props.setProperty("autosave","conservative");
        try {
            conn = DriverManager.getConnection(url, props);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select count(*) from territorial");
            rs.next();
            nTerritoriais = rs.getInt("count");
            rs = stmt.executeQuery("select count(*) from religioso");
            rs.next();
            nReligiosos = rs.getInt("count");
            rs = stmt.executeQuery("select count(*) from racial");
            rs.next();
            nRaciais = rs.getInt("count");
            rs = stmt.executeQuery("select count(*) from economico");
            rs.next();
            nEconomicos = rs.getInt("count");
            
        } catch (SQLException ex) {
            Logger.getLogger(grafico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    };
    public DefaultCategoryDataset criarDataSet(){
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(nTerritoriais, "Territoriais", "");
        ds.addValue(nReligiosos, "Religiosos", "");
        ds.addValue(nRaciais, "Raciais", "");
        ds.addValue(nEconomicos, "Econômicos", "");
        return ds;
        
    }
    public ChartPanel criarGraficoBarras(){
        DefaultCategoryDataset cd = criarDataSet();
        JFreeChart grafico = ChartFactory.createBarChart("Conflitos por tipo",
                "",
                "Tipo de conflito",
                cd,
                PlotOrientation.VERTICAL,
                true, false, false);
        ChartPanel cp = new ChartPanel(grafico);
        return cp;
    }
}
