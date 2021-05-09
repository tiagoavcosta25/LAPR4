package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.cataloguemanagement.application.CatalogueSearchController;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ListCatalogueUI extends AbstractListUI<Catalogue> {
    private final CatalogueSearchController theController = new CatalogueSearchController();
    private final CatalogueTitle m_oCatalogueTitle;
    private final CatalogueBriefDescription m_oCatalogueBriefDescription;
    private final CatalogueCompleteDescription m_oCatalogueCompleteDescription;
    private final Team oTeam;
    private final boolean wordSearch;

    public ListCatalogueUI() {
        //Casual constructor
        this.m_oCatalogueTitle = null;
        this.m_oCatalogueBriefDescription = null;
        this.m_oCatalogueCompleteDescription = null;
        this.oTeam = null;
        this.wordSearch = false;
    }

    public ListCatalogueUI(CatalogueTitle catalogueTitle, boolean wordSearch) {
        this.m_oCatalogueTitle = catalogueTitle;
        this.m_oCatalogueBriefDescription = null;
        this.m_oCatalogueCompleteDescription = null;
        this.wordSearch = wordSearch;
        this.oTeam = null;
    }

    public ListCatalogueUI(CatalogueBriefDescription catalogueBriefDescription, boolean wordSearch) {
        this.m_oCatalogueBriefDescription = catalogueBriefDescription;
        this.m_oCatalogueCompleteDescription = null;
        this.m_oCatalogueTitle = null;
        this.wordSearch = wordSearch;
        this.oTeam = null;
    }

    public ListCatalogueUI(CatalogueCompleteDescription catalogueCompleteDescription, boolean wordSearch) {
        this.m_oCatalogueCompleteDescription = catalogueCompleteDescription;
        this.m_oCatalogueBriefDescription = null;
        this.m_oCatalogueTitle = null;
        this.wordSearch = wordSearch;
        this.oTeam = null;
    }

    public ListCatalogueUI(Team oTeam) {
        this.m_oCatalogueCompleteDescription = null;
        this.m_oCatalogueBriefDescription = null;
        this.m_oCatalogueTitle = null;
        this.wordSearch = false;
        this.oTeam = oTeam;
    }

    @Override
    public String headline() {
        return "List Catalogues";
    }

    @Override
    protected String emptyMessage() {
        return "No data.";
    }

    @Override
    protected Iterable<Catalogue> elements() {
        if(this.m_oCatalogueTitle != null) {
            return theController.findByTitle(m_oCatalogueTitle);
        }
        else if(this.m_oCatalogueBriefDescription != null) {
            if(wordSearch)
                return theController.findByWordBriefDescription(m_oCatalogueBriefDescription);
            else
                return theController.findByBriefDescription(m_oCatalogueBriefDescription);
        }
        else if(this.m_oCatalogueCompleteDescription != null) {
            if(wordSearch)
                return theController.findByWordCompleteDescription(m_oCatalogueCompleteDescription);
            else
                return theController.findByCompleteDescription(m_oCatalogueCompleteDescription);
        }
        else if(this.oTeam != null) {
            return theController.findByTeam(oTeam);
        }

        return theController.getCatalogues();
    }

    @Override
    protected Visitor<Catalogue> elementPrinter() {
        return new CataloguePrinter();
    }

    @Override
    protected String elementName() {
        return "Catalogue";
    }

    @Override
    protected String listHeader() {
        return String.format("#  %-60s%-50s%-90s%-15s", "TITLE" , "BRIEF DESCRIPTION", "COMPLETE DESCRIPTION", "TEAMS THAT HAVE ACCESS");
    }
}
