package ch20.mysql.sec09.exam02;

import java.sql.Blob;
import java.util.Date;
import java.util.Objects;

public class Board {
    @Override
    public String toString() {
        return "Board{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bwriter='" + bwriter + '\'' +
                ", bdate=" + bdate +
                ", bfilename='" + bfilename + '\'' +
                ", bfiledata=" + bfiledata +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return bno == board.bno && btitle.equals(board.btitle) && bcontent.equals(board.bcontent) && bwriter.equals(board.bwriter) && bdate.equals(board.bdate) && bfilename.equals(board.bfilename) && bfiledata.equals(board.bfiledata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata);
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getBfilename() {
        return bfilename;
    }

    public void setBfilename(String bfilename) {
        this.bfilename = bfilename;
    }

    public Blob getBfiledata() {
        return bfiledata;
    }

    public void setBfiledata(Blob bfiledata) {
        this.bfiledata = bfiledata;
    }

    public Board(int bno, String btitle, String bcontent, String bwriter, Date bdate, String bfilename, Blob bfiledata) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
        this.bdate = bdate;
        this.bfilename = bfilename;
        this.bfiledata = bfiledata;
    }

    public Board() {
    }

    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;
    private String bfilename;
    private Blob bfiledata;
}