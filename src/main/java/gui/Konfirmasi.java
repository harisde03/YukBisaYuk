package gui;

import classes.Pembeli;
import database.DataBase;
import database.Konfigurasi;
import gui.dialog.InfoPengguna;
import gui.dialog.Pembayaran;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Konfirmasi extends javax.swing.JFrame {

    public Konfirmasi(Pembeli pembeli) {
        this.pembeli = pembeli;
        this.totalHarga = 0;

        try {
            this.konfigurasi = new Konfigurasi();
        } catch (IOException | FontFormatException ex) {
            Logger.getLogger(Konfirmasi.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

        if (pembeli.getJumlahBuku() == 0) {
            buttonKonfirmasi.setEnabled(false);
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

        panelHeader = new javax.swing.JPanel();
        fillerPreHeader = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        labelTitle = new javax.swing.JLabel();
        fillerMidHeader = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        labelEmail = new javax.swing.JLabel();
        fillerMid2Header = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        labelUserProfile = new javax.swing.JLabel();
        fillerPosHeader = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        panelBody = new javax.swing.JPanel();
        scrollBackground = new javax.swing.JScrollPane();
        panelBackground = new javax.swing.JPanel();
        panelFooter = new javax.swing.JPanel();
        fillerPreFooter = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        labelTotal = new javax.swing.JLabel();
        fillerMidFooter1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        buttonKembali = new javax.swing.JButton();
        fillerMidFooter2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        buttonKonfirmasi = new javax.swing.JButton();
        fillerPosFooter = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YukBayarYuk - Keranjang Belanja");
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        panelHeader.setBackground(new java.awt.Color(204, 213, 174));
        panelHeader.setMaximumSize(new java.awt.Dimension(32767, 60));
        panelHeader.setMinimumSize(new java.awt.Dimension(800, 60));
        panelHeader.setPreferredSize(new java.awt.Dimension(800, 60));
        panelHeader.setLayout(new javax.swing.BoxLayout(panelHeader, javax.swing.BoxLayout.LINE_AXIS));
        panelHeader.add(fillerPreHeader);

        labelTitle.setFont(konfigurasi.getPhilosopher(36));
        labelTitle.setText("YukBayarYuk");
        panelHeader.add(labelTitle);
        panelHeader.add(fillerMidHeader);

        labelEmail.setFont(konfigurasi.getRoboto(14));
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelEmail.setText(pembeli.getNama());
        panelHeader.add(labelEmail);
        panelHeader.add(fillerMid2Header);

        labelUserProfile.setFont(konfigurasi.getAwesome(18));
        labelUserProfile.setForeground(new java.awt.Color(255, 255, 255));
        labelUserProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserProfile.setText("\uf007");
        labelUserProfile.setMaximumSize(new java.awt.Dimension(30, 30));
        labelUserProfile.setMinimumSize(new java.awt.Dimension(30, 30));
        labelUserProfile.setPreferredSize(new java.awt.Dimension(30, 30));
        labelUserProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUserProfileMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelUserProfileMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelUserProfileMouseEntered(evt);
            }
        });
        panelHeader.add(labelUserProfile);
        panelHeader.add(fillerPosHeader);

        getContentPane().add(panelHeader);

        panelBody.setLayout(new java.awt.BorderLayout());

        scrollBackground.setBorder(null);
        scrollBackground.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBackground.setToolTipText("");
        scrollBackground.getVerticalScrollBar().setUnitIncrement(8);

        panelBackground.setBackground(new java.awt.Color(254, 250, 224));
        panelBackground.setLayout(new javax.swing.BoxLayout(panelBackground, javax.swing.BoxLayout.PAGE_AXIS));

        listBuku();

        scrollBackground.setViewportView(panelBackground);

        panelBody.add(scrollBackground, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelBody);

        panelFooter.setBackground(new java.awt.Color(250, 237, 205));
        panelFooter.setMaximumSize(new java.awt.Dimension(32767, 60));
        panelFooter.setMinimumSize(new java.awt.Dimension(800, 60));
        panelFooter.setPreferredSize(new java.awt.Dimension(800, 60));
        panelFooter.setLayout(new javax.swing.BoxLayout(panelFooter, javax.swing.BoxLayout.LINE_AXIS));
        panelFooter.add(fillerPreFooter);

        labelTotal.setFont(konfigurasi.getRoboto(24));
        labelTotal.setText("Total: Rp. " + String.format("%,d", totalHarga).replace(',', '.'));
        panelFooter.add(labelTotal);
        panelFooter.add(fillerMidFooter1);

        buttonKembali.setBackground(new java.awt.Color(212, 163, 115));
        buttonKembali.setFont(konfigurasi.getRobotoBold(14));
        buttonKembali.setText("Kembali");
        buttonKembali.setMaximumSize(new java.awt.Dimension(105, 35));
        buttonKembali.setMinimumSize(new java.awt.Dimension(105, 35));
        buttonKembali.setPreferredSize(new java.awt.Dimension(105, 35));
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });
        panelFooter.add(buttonKembali);
        panelFooter.add(fillerMidFooter2);

        buttonKonfirmasi.setBackground(new java.awt.Color(212, 163, 115));
        buttonKonfirmasi.setFont(konfigurasi.getRobotoBold(14));
        buttonKonfirmasi.setText("Konfirmasi");
        buttonKonfirmasi.setMaximumSize(new java.awt.Dimension(105, 35));
        buttonKonfirmasi.setMinimumSize(new java.awt.Dimension(105, 35));
        buttonKonfirmasi.setPreferredSize(new java.awt.Dimension(105, 35));
        buttonKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKonfirmasiActionPerformed(evt);
            }
        });
        panelFooter.add(buttonKonfirmasi);
        panelFooter.add(fillerPosFooter);

        getContentPane().add(panelFooter);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        PilihanBuku PB = new PilihanBuku(pembeli);
        PB.setLocation(getLocation());
        PB.setVisible(true);

        if (getExtendedState() == MAXIMIZED_BOTH) {
            PB.setExtendedState(MAXIMIZED_BOTH);
        } else {
            PB.setSize(getSize());
        }

        dispose();
    }//GEN-LAST:event_buttonKembaliActionPerformed

    private void labelUserProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUserProfileMouseClicked
        InfoPengguna IP = new InfoPengguna(this, pembeli);
        IP.setLocationRelativeTo(null);
        IP.setVisible(true);
    }//GEN-LAST:event_labelUserProfileMouseClicked

    private void labelUserProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUserProfileMouseEntered
        labelUserProfile.setForeground(new java.awt.Color(233, 237, 201));
    }//GEN-LAST:event_labelUserProfileMouseEntered

    private void labelUserProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUserProfileMouseExited
        labelUserProfile.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelUserProfileMouseExited

    private void buttonKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKonfirmasiActionPerformed
        Pembayaran PB = new Pembayaran(pembeli);
        PB.setLocationRelativeTo(null);
        PB.setVisible(true);

        if (PB.getStatus() == true) {
            berhasilBayar();
        }
    }//GEN-LAST:event_buttonKonfirmasiActionPerformed

    private void berhasilBayar() {
        DataBase db = new DataBase();

        Date date = java.util.Calendar.getInstance().getTime();

        pembeli.getKeyBuku().forEach(kode -> {
            try {
                db.recordPembelian(pembeli, kode, date.toString());
            } catch (IOException ex) {
                Logger.getLogger(Konfirmasi.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        int size = panelBuku.length;

        for (int i = size - 1; i >= 0; i--) {
            pembeli.removeBuku(kodeBuku[i]);
        }

        for (int i = 0; i < panelBuku.length; i++) {
            panelBukuHarga[i].remove(labelBukuBuang[i]);
            labelBukuHarga[i].setText("Lunas");

            panelBukuHarga[i].revalidate();
            panelBukuHarga[i].repaint();
        }

        labelTotal.setText(labelTotal.getText() + " (Lunas)");

        buttonKonfirmasi.setEnabled(false);
        buttonKonfirmasi.setText("Lunas");
    }

    private void listBuku() {
        int i = 0;
        int size = pembeli.getJumlahBuku();

        panelBuku = new javax.swing.JPanel[size];
        panelBukuCover = new javax.swing.JPanel[size];
        panelBukuDeskripsi = new javax.swing.JPanel[size];
        panelBukuJudul = new javax.swing.JPanel[size];
        panelBukuHarga = new javax.swing.JPanel[size];
        labelBukuCover = new javax.swing.JLabel[size];
        labelBukuJudul = new javax.swing.JLabel[size];
        labelBukuRating = new javax.swing.JLabel[size];
        labelBukuHarga = new javax.swing.JLabel[size];
        labelBukuBuang = new javax.swing.JLabel[size];
        fillerBukuPre = new javax.swing.Box.Filler[size];
        fillerBukuMid = new javax.swing.Box.Filler[size];
        fillerBukuPos = new javax.swing.Box.Filler[size];
        fillerBukuJudul = new javax.swing.Box.Filler[size];
        fillerBukuHarga = new javax.swing.Box.Filler[size];
        separatorDeskripsi = new javax.swing.JSeparator[size];
        imageCover = new java.awt.Image[size];
        kodeBuku = new String[size];

        for (String kode : pembeli.getKeyBuku()) {
            try {
                imageCover[i] = ImageIO.read(new File("src/main/java/database/" + pembeli.getBuku(kode).getDir()))
                        .getScaledInstance(60, 90, java.awt.Image.SCALE_AREA_AVERAGING);
            } catch (IOException ex) {
                Logger.getLogger(Konfirmasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            i++;
        }

        i = 0;

        for (String kode : pembeli.getKeyBuku()) {
            panelBuku[i] = new javax.swing.JPanel();
            fillerBukuPre[i] = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
            panelBukuCover[i] = new javax.swing.JPanel();
            labelBukuCover[i] = new javax.swing.JLabel();
            fillerBukuMid[i] = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
            panelBukuDeskripsi[i] = new javax.swing.JPanel();
            panelBukuJudul[i] = new javax.swing.JPanel();
            labelBukuJudul[i] = new javax.swing.JLabel();
            fillerBukuJudul[i] = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
            labelBukuRating[i] = new javax.swing.JLabel();
            separatorDeskripsi[i] = new javax.swing.JSeparator();
            panelBukuHarga[i] = new javax.swing.JPanel();
            labelBukuHarga[i] = new javax.swing.JLabel();
            fillerBukuHarga[i] = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
            labelBukuBuang[i] = new javax.swing.JLabel();
            fillerBukuPos[i] = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));

            panelBuku[i].setBackground(new java.awt.Color(254, 250, 224));
            panelBuku[i].setMaximumSize(new java.awt.Dimension(32767, 100));
            panelBuku[i].setMinimumSize(new java.awt.Dimension(0, 100));
            panelBuku[i].setPreferredSize(new java.awt.Dimension(800, 100));
            panelBuku[i].setLayout(new javax.swing.BoxLayout(panelBuku[i], javax.swing.BoxLayout.LINE_AXIS));
            panelBuku[i].add(fillerBukuPre[i]);

            panelBukuCover[i].setMaximumSize(new java.awt.Dimension(60, 90));
            panelBukuCover[i].setMinimumSize(new java.awt.Dimension(60, 90));
            panelBukuCover[i].setPreferredSize(new java.awt.Dimension(60, 90));
            panelBukuCover[i].setLayout(new java.awt.BorderLayout());

            labelBukuCover[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelBukuCover[i].setIcon(new javax.swing.ImageIcon(imageCover[i]));
            labelBukuCover[i].setMaximumSize(new java.awt.Dimension(60, 90));
            labelBukuCover[i].setMinimumSize(new java.awt.Dimension(60, 90));
            labelBukuCover[i].setPreferredSize(new java.awt.Dimension(60, 90));
            panelBukuCover[i].add(labelBukuCover[i], java.awt.BorderLayout.CENTER);

            panelBuku[i].add(panelBukuCover[i]);
            panelBuku[i].add(fillerBukuMid[i]);

            panelBukuDeskripsi[i].setLayout(new javax.swing.BoxLayout(panelBukuDeskripsi[i], javax.swing.BoxLayout.PAGE_AXIS));

            panelBukuJudul[i].setBackground(new java.awt.Color(254, 250, 224));
            panelBukuJudul[i].setLayout(new javax.swing.BoxLayout(panelBukuJudul[i], javax.swing.BoxLayout.LINE_AXIS));

            labelBukuJudul[i].setFont(konfigurasi.getRoboto(14));
            labelBukuJudul[i].setText(pembeli.getBuku(kode).getJudul() + " by " + pembeli.getBuku(kode).getPenulis());
            labelBukuJudul[i].setMinimumSize(new java.awt.Dimension(0, 0));
            panelBukuJudul[i].add(labelBukuJudul[i]);
            panelBukuJudul[i].add(fillerBukuJudul[i]);

            labelBukuRating[i].setFont(konfigurasi.getAwesome(18));
            labelBukuRating[i].setForeground(new java.awt.Color(204, 213, 174));
            labelBukuRating[i].setText(getStar(pembeli.getBuku(kode).getRating()));
            labelBukuRating[i].setMaximumSize(new java.awt.Dimension(105, 25));
            labelBukuRating[i].setMinimumSize(new java.awt.Dimension(105, 25));
            panelBukuJudul[i].add(labelBukuRating[i]);

            panelBukuDeskripsi[i].add(panelBukuJudul[i]);

            separatorDeskripsi[i].setForeground(new java.awt.Color(0, 0, 0));
            separatorDeskripsi[i].setMaximumSize(new java.awt.Dimension(32767, 2));
            separatorDeskripsi[i].setMinimumSize(new java.awt.Dimension(0, 2));
            panelBukuDeskripsi[i].add(separatorDeskripsi[i]);

            panelBukuHarga[i].setBackground(new java.awt.Color(254, 250, 224));
            panelBukuHarga[i].setLayout(new javax.swing.BoxLayout(panelBukuHarga[i], javax.swing.BoxLayout.LINE_AXIS));

            labelBukuHarga[i].setFont(konfigurasi.getRoboto(14));
            labelBukuHarga[i].setText("Rp. " + String.format("%,d", (int) pembeli.getBuku(kode).getHarga()).replace(',', '.'));
            panelBukuHarga[i].add(labelBukuHarga[i]);
            panelBukuHarga[i].add(fillerBukuHarga[i]);

            labelBukuBuang[i].setFont(konfigurasi.getAwesome(18));
            labelBukuBuang[i].setForeground(java.awt.Color.gray);
            labelBukuBuang[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelBukuBuang[i].setText("\uf1f8");
            labelBukuBuang[i].setMaximumSize(new java.awt.Dimension(50, 25));
            labelBukuBuang[i].setMinimumSize(new java.awt.Dimension(50, 25));

            labelBukuBuang[i].setName("" + i);

            labelBukuBuang[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    labelBukuBuangMouseEntered(evt);
                }
            });

            labelBukuBuang[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    labelBukuBuangMouseExited(evt);
                }
            });

            labelBukuBuang[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    labelBukuBuangMouseClicked(evt);
                }
            });

            panelBukuHarga[i].add(labelBukuBuang[i]);

            panelBukuDeskripsi[i].add(panelBukuHarga[i]);

            panelBuku[i].add(panelBukuDeskripsi[i]);
            panelBuku[i].add(fillerBukuPos[i]);

            panelBackground.add(panelBuku[i]);

            kodeBuku[i] = kode;
            totalHarga += pembeli.getBuku(kode).getHarga();
            i++;
        }

    }

    private void labelBukuBuangMouseEntered(java.awt.event.MouseEvent evt) {
        javax.swing.JLabel label = (javax.swing.JLabel) evt.getSource();
        int num = Integer.parseInt(label.getName());

        labelBukuBuang[num].setForeground(java.awt.Color.black);
    }

    private void labelBukuBuangMouseExited(java.awt.event.MouseEvent evt) {
        javax.swing.JLabel label = (javax.swing.JLabel) evt.getSource();
        int num = Integer.parseInt(label.getName());

        labelBukuBuang[num].setForeground(java.awt.Color.gray);
    }

    private void labelBukuBuangMouseClicked(java.awt.event.MouseEvent evt) {
        javax.swing.JLabel label = (javax.swing.JLabel) evt.getSource();
        int num = Integer.parseInt(label.getName());

        panelBackground.remove(panelBuku[num]);

        panelBackground.revalidate();
        panelBackground.repaint();

        totalHarga -= pembeli.getBuku(kodeBuku[num]).getHarga();

        labelTotal.setText("Total: Rp. " + String.format("%,d", totalHarga).replace(',', '.'));

        pembeli.removeBuku(kodeBuku[num]);

        if (pembeli.getJumlahBuku() == 0) {
            buttonKonfirmasi.setEnabled(false);
        }
    }

    private String getStar(double rating) {
        String stars = "";

        for (int i = 0; i < (int) rating; i++) {
            stars += "\uf005";
        }

        if (rating - (int) rating == 0.5) {
            stars += "\uf089";
        }

        return stars;
    }

    private Pembeli pembeli;
    private int totalHarga;
    private Konfigurasi konfigurasi;

    // Varibles for Listed Books
    private javax.swing.JPanel[] panelBuku;
    private javax.swing.JPanel[] panelBukuCover;
    private javax.swing.JPanel[] panelBukuDeskripsi;
    private javax.swing.JPanel[] panelBukuJudul;
    private javax.swing.JPanel[] panelBukuHarga;
    private javax.swing.JLabel[] labelBukuCover;
    private javax.swing.JLabel[] labelBukuJudul;
    private javax.swing.JLabel[] labelBukuRating;
    private javax.swing.JLabel[] labelBukuHarga;
    private javax.swing.JLabel[] labelBukuBuang;
    private javax.swing.JSeparator[] separatorDeskripsi;
    private javax.swing.Box.Filler[] fillerBukuPre;
    private javax.swing.Box.Filler[] fillerBukuMid;
    private javax.swing.Box.Filler[] fillerBukuPos;
    private javax.swing.Box.Filler[] fillerBukuJudul;
    private javax.swing.Box.Filler[] fillerBukuHarga;
    private java.awt.Image[] imageCover;
    private String[] kodeBuku;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonKonfirmasi;
    private javax.swing.Box.Filler fillerMid2Header;
    private javax.swing.Box.Filler fillerMidFooter1;
    private javax.swing.Box.Filler fillerMidFooter2;
    private javax.swing.Box.Filler fillerMidHeader;
    private javax.swing.Box.Filler fillerPosFooter;
    private javax.swing.Box.Filler fillerPosHeader;
    private javax.swing.Box.Filler fillerPreFooter;
    private javax.swing.Box.Filler fillerPreHeader;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelUserProfile;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JScrollPane scrollBackground;
    // End of variables declaration//GEN-END:variables
}
