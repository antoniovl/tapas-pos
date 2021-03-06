/*
 * Copyright (C) 2010 Francisco José Morero Peyrona. All Rights Reserved.
 *
 * This file is part of Tapas project: http://code.google.com/p/tapas-tpv/
 *
 * GNU Classpath is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the free
 * Software Foundation; either version 3, or (at your option) any later version.
 *
 * Tapas is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Tapas; see the file COPYING.  If not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.peyrona.tapas.office;

import com.peyrona.tapas.persistence.Configuration;
import com.peyrona.tapas.swing.SwingUtils;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 * Panel del tab "Ticket" de la dialog de Configuración de la aplicación.
 * Permite la configuración del ticket de caja que se imprime.
 *
 * @author Francisco Morero Peyrona (www.peyrona.com)
 */
final class Ticket extends javax.swing.JPanel implements ActionListener
{
    private Configuration config;

    /**
     * Constructor de argumento cero.
     */
    Ticket( Configuration config )
    {
        this.config = config;   // Guardo la referencia

        initComponents();

        Image image  = config.getTicketHeaderImage();

        // Inicializo los componentes Swing
        if( image != null )
        {
            lblImageHeaderIcon.setIcon( new ImageIcon( image ) );
        }

        txtHeaderText.setText( config.getTicketHeader() );
        txtFooterText.setText( config.getTicketFooter() );
    }

    //------------------------------------------------------------------------//

    // Este método es llamado cuando se va a cerrar la dialog
    @Override
    public void actionPerformed( ActionEvent e )
    {
        ImageIcon icon      = (ImageIcon) lblImageHeaderIcon.getIcon();
        Image     imgHeader = (icon == null ? null : icon.getImage());
        String    sHeader   = txtHeaderText.getText();
        String    sFooter   = txtFooterText.getText();

        // Actualizamos la configuración con los valores de los componentes Swing
        config.setTicketHeaderImage( imgHeader );
        config.setTicketHeader( sHeader );
        config.setTicketFooter( sFooter );
    }

    //------------------------------------------------------------------------//

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImgHeader = new javax.swing.JLabel();
        lblImageHeaderIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHeaderText = new javax.swing.JTextArea();
        btnSelectImage = new javax.swing.JButton();
        lblFooterText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFooterText = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();
        btnDiscardImage = new javax.swing.JButton();

        lblImgHeader.setText("Imagen en la cabecera (es opcional)");

        lblImageHeaderIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageHeaderIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Texto de cabecera (es opcional)");

        txtHeaderText.setColumns(20);
        txtHeaderText.setRows(5);
        jScrollPane1.setViewportView(txtHeaderText);

        btnSelectImage.setText("Seleccionar");
        btnSelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSelectHeaderImage(evt);
            }
        });

        lblFooterText.setText("Texto de pie (es opcional)");

        txtFooterText.setColumns(20);
        txtFooterText.setRows(5);
        jScrollPane2.setViewportView(txtFooterText);

        lblTitle.setFont(lblTitle.getFont().deriveFont((float)16));
        lblTitle.setText("Configuración del ticket de caja");

        btnDiscardImage.setText("Borrar");
        btnDiscardImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onDiscardImage(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFooterText)
                    .addComponent(lblImageHeaderIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImgHeader)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelectImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDiscardImage)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImgHeader)
                    .addComponent(btnSelectImage)
                    .addComponent(btnDiscardImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImageHeaderIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblFooterText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void onSelectHeaderImage(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onSelectHeaderImage
    {//GEN-HEADEREND:event_onSelectHeaderImage
        BufferedImage bimg = SwingUtils.ImageChooser();

        if( bimg != null )
        {
            lblImageHeaderIcon.setIcon( new ImageIcon( bimg ) );
        }
    }//GEN-LAST:event_onSelectHeaderImage

    private void onDiscardImage(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDiscardImage
    {//GEN-HEADEREND:event_onDiscardImage
        lblImageHeaderIcon.setIcon( null );
        lblImageHeaderIcon.setDisabledIcon( null );
    }//GEN-LAST:event_onDiscardImage

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscardImage;
    private javax.swing.JButton btnSelectImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFooterText;
    private javax.swing.JLabel lblImageHeaderIcon;
    private javax.swing.JLabel lblImgHeader;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtFooterText;
    private javax.swing.JTextArea txtHeaderText;
    // End of variables declaration//GEN-END:variables
}