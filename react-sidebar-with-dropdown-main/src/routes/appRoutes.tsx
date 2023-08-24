import DashboardPageLayout from "../pages/dashboard/DashboardPageLayout";
import HomePage from "../pages/home/HomePage";
import { RouteType } from "./config";
import DefaultPage from "../pages/dashboard/DefaultPage";
import DashboardIndex from "../pages/dashboard/DashboardIndex";
import ChangelogPage from "../pages/changelog/ChangelogPage";
import AnalyticsPage from "../pages/dashboard/AnalyticsPage";
import SaasPage from "../pages/dashboard/SaasPage";
import ComponentPageLayout from "../pages/component/ComponentPageLayout";
import DashboardOutlinedIcon from '@mui/icons-material/DashboardOutlined';
import AppsOutlinedIcon from '@mui/icons-material/AppsOutlined';
import ArticleOutlinedIcon from '@mui/icons-material/ArticleOutlined';
import FormatListBulletedOutlinedIcon from '@mui/icons-material/FormatListBulletedOutlined';
import FileDownloadOutlinedIcon from '@mui/icons-material/FileDownloadOutlined';
import AlertPage from "../pages/component/AlertPage";
import ButtonPage from "../pages/component/ButtonPage";
import InstallationPage from "../pages/installation/InstallationPage";
import DocumentationPage from "../pages/documentation/DocumentationPage";
import AccountDetails from "../pages/AccountDetails";
import AccountStatement from "../pages/AccountStatement";
import AccountSummary from "../pages/AccountSummary";
//import Transaction from "../pages/Transaction";
//import TransferSuccessful from "../pages/TransferSuccesful";

const appRoutes: RouteType[] = [
  {
    index: true,
    element: <HomePage />,
    state: "home"
  },
  /*{
    path: "/installation",
    element: <InstallationPage />,
    state: "installation",
    sidebarProps: {
      displayText: "Installation",
      icon: <FileDownloadOutlinedIcon />
    }
  },
  {
    path: "/dashboard",
    element: <DashboardPageLayout />,
    state: "dashboard",
    sidebarProps: {
      displayText: "Dashboard",
      icon: <DashboardOutlinedIcon />
    },
    child: [
      {
        index: true,
        element: <DashboardIndex />,
        state: "dashboard.index"
      },
      {
        path: "/dashboard/default",
        element: <DefaultPage />,
        state: "dashboard.default",
        sidebarProps: {
          displayText: "Default"
        },
      },
      {
        path: "/dashboard/analytics",
        element: <AnalyticsPage />,
        state: "dashboard.analytics",
        sidebarProps: {
          displayText: "Analytic"
        }
      },
      {
        path: "/dashboard/saas",
        element: <SaasPage />,
        state: "dashboard.saas",
        sidebarProps: {
          displayText: "Saas"
        }
      }
    ]
  },*/
 
  {
    path: "/accountDetails",
    element: <AccountDetails />,
    state: "accountDetails",
    sidebarProps: {
      displayText: "Account Details",
      icon: <ArticleOutlinedIcon />
    }
  },
  {
    path: "/accountStatement",
    element: <AccountStatement />,
    state: "accountStatement",
    sidebarProps: {
      displayText: "Account Statement",
      icon: <ArticleOutlinedIcon />
    }
  },
  {
    path: "/accountSummary",
    element: <AccountSummary />,
    state: "accountSummary",
    sidebarProps: {
      displayText: "Account Summary",
      icon: <ArticleOutlinedIcon />
    }
  }
  //,
  /*{
    path: "/transaction",
    element: <Transaction />,
    state: "transaction",
    sidebarProps: {
      displayText: "Transaction",
      icon: <FormatListBulletedOutlinedIcon />
    }
  }*/
];

export default appRoutes;