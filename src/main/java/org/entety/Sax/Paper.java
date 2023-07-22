package org.entety.Sax;

import org.entety.SinglePaper;

import java.util.ArrayList;
import java.util.List;

public class Paper {
    public List<SinglePaper> getSinglePapers() {
        return singlePapers;
    }

    public void setSinglePapers(List<SinglePaper> singlePapers) {
        this.singlePapers = singlePapers;
    }

    public List<SinglePaper> singlePapers;
}
