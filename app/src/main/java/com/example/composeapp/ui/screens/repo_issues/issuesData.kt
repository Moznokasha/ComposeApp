package com.example.composeapp.ui.screens.repo_issues

import com.example.composeapp.ui.screens.repo_issues.model.IssueUiModel

fun getIssueData(): List<IssueUiModel>{
    return listOf(
        IssueUiModel(1,"Bump pyarrow from 7...", "Open", "NONE", "CreatedAt:", "2023-11-9, 23:0 PM" ),
        IssueUiModel(2,"Français", "Open", "NONE", "CreatedAt:", "2023-11-2, 9:38 AM" ),
        IssueUiModel(3,"Bump werkzeug from ...", "Open", "NONE", "CreatedAt:", "2023-10-25, 18:52 PM" ),
        IssueUiModel(4,"Bump urllib3 from 1.2...", "Open", "NONE", "CreatedAt:", "2023-10-17, 22:59 PM" ),
        IssueUiModel(5,"ORQA fine tuning with...", "Open", "NONE", "CreatedAt:", "2023-10-9, 15:3 PM" ),
        IssueUiModel(6,"Bump pillow from 9.2...", "Open", "NONE", "CreatedAt:", "2023-10-4, 0:35 AM" )
    )

}
