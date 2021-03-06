/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * energyMeter.java
 *
 * Created on Sep 15, 2011, 5:10:36 PM
 */
package rssi_graph.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.DialShape;
import org.jfree.chart.plot.MeterInterval;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;

/**
 * Analog energy meter
 * 
 * @author ph4r05
 */
public class energyMeter extends javax.swing.JPanel {

    /** Creates new form energyMeter */
    public energyMeter() {
        initComponents();
    }
    
     /**  
     *   
     */   
    private static final long serialVersionUID = 1L;   
    private DefaultValueDataset dataset;   
   
    /**
     * Initializes internal panel containing analog meter
     */
    public void initMeter(){
        this.jPanel1 = this.createMeterPanel();
        this.jPanel1.setName("jPanel1"); // NOI18N
        
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(100, 100));
        
        setName("Form"); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        this.jPanel1.repaint();
        this.jPanel1.revalidate();
        
        //this.invalidate();
        this.repaint();
        this.revalidate();
    }
    
    /**
     * Sets current value of energy to meter
     * @param val 
     */
    public void setCurrentValue(double val){
        // only 1 decimal place here
        double newVal = Math.round(val*10) / 10;
        this.dataset.setValue(newVal);
    }
   
    /**
     * Create chart (from demo)
     * @param valuedataset
     * @return 
     */
    private static JFreeChart createChart(ValueDataset valuedataset)   
    {   
        MeterPlot meterplot = new MeterPlot(valuedataset);   
        meterplot.setRange(new Range(0.0D, 100.0D));   
        meterplot.addInterval(new MeterInterval("Critical", new Range(0.0D, 10.0D), Color.lightGray, new BasicStroke(2.0F), new Color(255, 0, 0, 128)));   
        meterplot.addInterval(new MeterInterval("Warning", new Range(10.0D, 25.0D), Color.lightGray, new BasicStroke(2.0F), new Color(255, 255, 0, 64)));   
        meterplot.addInterval(new MeterInterval("Normal", new Range(25.0D, 100.0D), Color.lightGray, new BasicStroke(2.0F), new Color(0, 255, 0, 64)));   
        
        meterplot.setNeedlePaint(Color.darkGray);   
        meterplot.setDialBackgroundPaint(Color.white);   
        meterplot.setDialOutlinePaint(Color.gray);   
        meterplot.setDialShape(DialShape.CHORD);   
        meterplot.setMeterAngle(260);   
        meterplot.setTickLabelsVisible(true);   
        meterplot.setTickLabelFont(new Font("Dialog", 1, 10));
        meterplot.setTickLabelPaint(Color.darkGray);   
        meterplot.setTickSize(5D);   
        meterplot.setTickPaint(Color.lightGray);   
        meterplot.setValuePaint(Color.black);   
        meterplot.setValueFont(new Font("Dialog", 1, 14));   
        meterplot.setUnits("");
        
        
        JFreeChart jfreechart = new JFreeChart("Energie", JFreeChart.DEFAULT_TITLE_FONT, meterplot, true);   
        return jfreechart;   
    }   
   
    public JPanel createMeterPanel()   
    {   
        this.dataset = new DefaultValueDataset(0.0D);   
        JFreeChart jfreechart = createChart(this.dataset);   
        ChartPanel chartpanel = new ChartPanel(jfreechart);   
        return chartpanel;   
    }   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setName("Form"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
