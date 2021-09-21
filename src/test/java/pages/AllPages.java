package pages;

import pages.android.*;

public class AllPages {

     //parametresiz contractor olustur
    public AllPages(){}
    //her page class return type ile private instance olusturduk;
    private APIDemosPage apiDemosPage;
    private MainPage mainPage;
    private PreferenceDependenciesPage preferenceDependenciesPage;
    private PreferencePage preferencePage;
    private SwitchPage switchPage;
    private ViewsPage viewsPage;
    private DragDropPage dragDropPage;
    private DateWidgetsPage dateWidgetsPage;

    //her page klass icin public method olsuturp obje olustracagiz
    public APIDemosPage apiDemosPage(){
        if (apiDemosPage == null){
            apiDemosPage = new APIDemosPage();
        }
        return apiDemosPage;
    }
    public MainPage mainPage(){
        if (mainPage == null){
            mainPage =  new MainPage();
        }
        return mainPage;
    }

    public PreferencePage preferencePage(){
        if (preferencePage== null){
            preferencePage = new PreferencePage();
        }
        return preferencePage;
    }

    public PreferenceDependenciesPage preferenceDependenciesPage(){
        if (preferenceDependenciesPage == null){
            preferenceDependenciesPage = new PreferenceDependenciesPage();
        }
        return preferenceDependenciesPage;
    }

    public SwitchPage switchPage(){
        if (switchPage == null){
            switchPage = new SwitchPage();
        }
        return switchPage;
    }
    public ViewsPage viewsPage(){
        if (viewsPage == null){
            viewsPage = new ViewsPage();
        }
        return viewsPage;
    }

    public DragDropPage dragDropPage(){
        if (dragDropPage == null){
            dragDropPage = new DragDropPage();
        }
        return dragDropPage;
    }

    public DateWidgetsPage dateWidgetsPage(){
        if (dateWidgetsPage == null){
            dateWidgetsPage = new DateWidgetsPage();
        }
        return dateWidgetsPage;
    }

}