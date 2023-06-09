(ns tools.drilling.uikit.browser.mui
  (:require [tools.drilling.uikit.u :refer [pc ppc]]
            [com.fulcrologic.fulcro.algorithms.react-interop :refer [react-factory]]
            ["@mui/material" :as mui]
            ["@mui/x-data-grid" :as muix]))

(def prim-accordion (react-factory mui/Accordion))
(def prim-accordion-actions (react-factory mui/AccordionActions))
(def prim-accordion-details (react-factory mui/AccordionDetails))
(def prim-accordion-summary (react-factory mui/AccordionSummary))
(def prim-alert (react-factory mui/Alert))
(def prim-alert-title (react-factory mui/AlertTitle))
(def prim-app-bar (react-factory mui/AppBar))
(def prim-autocomplete (react-factory mui/Autocomplete))
(def prim-avatar (react-factory mui/Avatar))
(def prim-avatar-group (react-factory mui/AvatarGroup))
(def prim-backdrop (react-factory mui/Backdrop))
(def prim-badge (react-factory mui/Badge))
(def prim-bottom-navigation (react-factory mui/BottomNavigation))
(def prim-bottom-navigation-action (react-factory mui/BottomNavigationAction))
(def prim-box (react-factory mui/Box))
(def prim-breadcrumbs (react-factory mui/Breadcrumbs))
(def prim-button (react-factory mui/Button))
(def prim-button-base (react-factory mui/ButtonBase))
(def prim-button-group (react-factory mui/ButtonGroup))
(def prim-card (react-factory mui/Card))
(def prim-card-action-area (react-factory mui/CardActionArea))
(def prim-card-actions (react-factory mui/CardActions))
(def prim-card-content (react-factory mui/CardContent))
(def prim-card-header (react-factory mui/CardHeader))
(def prim-card-media (react-factory mui/CardMedia))
(def prim-checkbox (react-factory mui/Checkbox))
(def prim-chip (react-factory mui/Chip))
(def prim-circular-progress (react-factory mui/CircularProgress))
(def prim-collapse (react-factory mui/Collapse))
(def prim-container (react-factory mui/Container))
(def prim-css-baseline (react-factory mui/CssBaseline))
(def prim-dialog (react-factory mui/Dialog))
(def prim-dialog-actions (react-factory mui/DialogActions))
(def prim-dialog-content (react-factory mui/DialogContent))
(def prim-dialog-content-text (react-factory mui/DialogContentText))
(def prim-dialog-title (react-factory mui/DialogTitle))
(def prim-divider (react-factory mui/Divider))
(def prim-drawer (react-factory mui/Drawer))
(def prim-fab (react-factory mui/Fab))
(def prim-fade (react-factory mui/Fade))
(def prim-filled-input (react-factory mui/FilledInput))
(def prim-form-control (react-factory mui/FormControl))
(def prim-form-control-label (react-factory mui/FormControlLabel))
(def prim-form-group (react-factory mui/FormGroup))
(def prim-form-helper-text (react-factory mui/FormHelperText))
(def prim-form-label (react-factory mui/FormLabel))
(def prim-global-styles (react-factory mui/GlobalStyles))
(def prim-grid (react-factory mui/Grid))
(def prim-grow (react-factory mui/Grow))
(def prim-hidden (react-factory mui/Hidden))
(def prim-icon (react-factory mui/Icon))
(def prim-icon-button (react-factory mui/IconButton))
(def prim-image-list (react-factory mui/ImageList))
(def prim-image-list-item (react-factory mui/ImageListItem))
(def prim-image-list-item-bar (react-factory mui/ImageListItemBar))
(def prim-input (react-factory mui/Input))
(def prim-input-adornment (react-factory mui/InputAdornment))
(def prim-input-base (react-factory mui/InputBase))
(def prim-input-label (react-factory mui/InputLabel))
(def prim-linear-progress (react-factory mui/LinearProgress))
(def prim-link (react-factory mui/Link))
(def prim-list (react-factory mui/List))
(def prim-list-item (react-factory mui/ListItem))
(def prim-list-item-avatar (react-factory mui/ListItemAvatar))
(def prim-list-item-button (react-factory mui/ListItemButton))
(def prim-list-item-icon (react-factory mui/ListItemIcon))
(def prim-list-item-secondary-action (react-factory mui/ListItemSecondaryAction))
(def prim-list-item-text (react-factory mui/ListItemText))
(def prim-list-subheader (react-factory mui/ListSubheader))
(def prim-loading-button (react-factory mui/LoadingButton))
(def prim-masonry (react-factory mui/Masonry))
(def prim-menu (react-factory mui/Menu))
(def prim-menu-item (react-factory mui/MenuItem))
(def prim-menu-list (react-factory mui/MenuList))
(def prim-mobile-stepper (react-factory mui/MobileStepper))
(def prim-modal (react-factory mui/Modal))
(def prim-native-select (react-factory mui/NativeSelect))
(def prim-outlined-input (react-factory mui/OutlinedInput))
(def prim-pagination (react-factory mui/Pagination))
(def prim-pagination-item (react-factory mui/PaginationItem))
(def prim-paper (react-factory mui/Paper))
(def prim-popover (react-factory mui/Popover))
(def prim-popper (react-factory mui/Popper))
(def prim-radio (react-factory mui/Radio))
(def prim-radio-group (react-factory mui/RadioGroup))
(def prim-rating (react-factory mui/Rating))
(def prim-scoped-css-baseline (react-factory mui/ScopedCssBaseline))
(def prim-select (react-factory mui/Select))
(def prim-skeleton (react-factory mui/Skeleton))
(def prim-slide (react-factory mui/Slide))
(def prim-slider (react-factory mui/Slider))
(def prim-snackbar (react-factory mui/Snackbar))
(def prim-snackbar-content (react-factory mui/SnackbarContent))
(def prim-speed-dial (react-factory mui/SpeedDial))
(def prim-speed-dial-action (react-factory mui/SpeedDialAction))
(def prim-speed-dial-icon (react-factory mui/SpeedDialIcon))
(def prim-stack (react-factory mui/Stack))
(def prim-step (react-factory mui/Step))
(def prim-step-button (react-factory mui/StepButton))
(def prim-step-connector (react-factory mui/StepConnector))
(def prim-step-content (react-factory mui/StepContent))
(def prim-step-icon (react-factory mui/StepIcon))
(def prim-step-label (react-factory mui/StepLabel))
(def prim-stepper (react-factory mui/Stepper))
(def prim-svg-icon (react-factory mui/SvgIcon))
(def prim-swipeable-drawer (react-factory mui/SwipeableDrawer))
(def prim-switch (react-factory mui/Switch))
(def prim-tab (react-factory mui/Tab))
(def prim-tab-context (react-factory mui/TabContext))
(def prim-table (react-factory mui/Table))
(def prim-table-body (react-factory mui/TableBody))
(def prim-table-cell (react-factory mui/TableCell))
(def prim-table-container (react-factory mui/TableContainer))
(def prim-table-footer (react-factory mui/TableFooter))
(def prim-table-head (react-factory mui/TableHead))
(def prim-table-pagination (react-factory mui/TablePagination))
(def prim-table-row (react-factory mui/TableRow))
(def prim-table-sort-label (react-factory mui/TableSortLabel))
(def prim-tab-list (react-factory mui/TabList))
(def prim-tab-panel (react-factory mui/TabPanel))
(def prim-tabs (react-factory mui/Tabs))
(def prim-tab-scroll-button (react-factory mui/TabScrollButton))
(def prim-text-field (react-factory mui/TextField))
(def prim-timeline (react-factory mui/Timeline))
(def prim-timeline-connector (react-factory mui/TimelineConnector))
(def prim-timeline-content (react-factory mui/TimelineContent))
(def prim-timeline-dot (react-factory mui/TimelineDot))
(def prim-timeline-item (react-factory mui/TimelineItem))
(def prim-timeline-opposite-content (react-factory mui/TimelineOppositeContent))
(def prim-timeline-separator (react-factory mui/TimelineSeparator))
(def prim-toggle-button (react-factory mui/ToggleButton))
(def prim-toggle-button-group (react-factory mui/ToggleButtonGroup))
(def prim-toolbar (react-factory mui/Toolbar))
(def prim-tooltip (react-factory mui/Tooltip))
(def prim-tree-item (react-factory mui/TreeItem))
(def prim-tree-view (react-factory mui/TreeView))
(def prim-typography (react-factory mui/Typography))
(def prim-zoom (react-factory mui/Zoom))



(def accordion (pc prim-accordion))
(def accordion-actions (pc prim-accordion-actions))
(def accordion-details (pc prim-accordion-details))
(def accordion-summary (pc prim-accordion-summary))
(def alert (pc prim-alert))
(def alert-title (pc prim-alert-title))
(def app-bar (pc prim-app-bar))
(def autocomplete (pc prim-autocomplete))
(def avatar (pc prim-avatar))
(def avatar-group (pc prim-avatar-group))
(def backdrop (pc prim-backdrop))
(def badge (pc prim-badge))
(def bottom-navigation (pc prim-bottom-navigation))
(def bottom-navigation-action (pc prim-bottom-navigation-action))
(def box (pc prim-box))
(def breadcrumbs (pc prim-breadcrumbs))
(def button (pc prim-button))
(def button-base (pc prim-button-base))
(def button-group (pc prim-button-group))
(def card (pc prim-card))
(def card-action-area (pc prim-card-action-area))
(def card-actions (pc prim-card-actions))
(def card-content (pc prim-card-content))
(def card-header (pc prim-card-header))
(def card-media (pc prim-card-media))
(def checkbox (pc prim-checkbox))
(def chip (pc prim-chip))
(def circular-progress (pc prim-circular-progress))
(def collapse (pc prim-collapse))
(def container (pc prim-container))
(def css-baseline (pc prim-css-baseline))
(def dialog (pc prim-dialog))
(def dialog-actions (pc prim-dialog-actions))
(def dialog-content (pc prim-dialog-content))
(def dialog-content-text (pc prim-dialog-content-text))
(def dialog-title (pc prim-dialog-title))
(def divider (pc prim-divider))
(def drawer (pc prim-drawer))
(def fab (pc prim-fab))
(def fade (pc prim-fade))
(def filled-input (pc prim-filled-input))
(def form-control (pc prim-form-control))
(def form-control-label (pc prim-form-control-label))
(def form-group (pc prim-form-group))
(def form-helper-text (pc prim-form-helper-text))
(def form-label (pc prim-form-label))
(def global-styles (pc prim-global-styles))
(def grid (pc prim-grid))
(def grow (pc prim-grow))
(def hidden (pc prim-hidden))
(def icon (pc prim-icon))
(def icon-button (pc prim-icon-button))
(def image-list (pc prim-image-list))
(def image-list-item (pc prim-image-list-item))
(def image-list-item-bar (pc prim-image-list-item-bar))
(def input (pc prim-input))
(def input-adornment (pc prim-input-adornment))
(def input-base (pc prim-input-base))
(def input-label (pc prim-input-label))
(def linear-progress (pc prim-linear-progress))
(def link (pc prim-link))
(def list (pc prim-list))
(def list-item (pc prim-list-item))
(def list-item-avatar (pc prim-list-item-avatar))
(def list-item-button (pc prim-list-item-button))
(def list-item-icon (pc prim-list-item-icon))
(def list-item-secondary-action (pc prim-list-item-secondary-action))
(def list-item-text (pc prim-list-item-text))
(def list-subheader (pc prim-list-subheader))
(def loading-button (pc prim-loading-button))
(def masonry (pc prim-masonry))
(def menu (pc prim-menu))
(def menu-item (pc prim-menu-item))
(def menu-list (pc prim-menu-list))
(def mobile-stepper (pc prim-mobile-stepper))
(def modal (pc prim-modal))
(def native-select (pc prim-native-select))
(def outlined-input (pc prim-outlined-input))
(def pagination (pc prim-pagination))
(def pagination-item (pc prim-pagination-item))
(def paper (pc prim-paper))
(def popover (pc prim-popover))
(def popper (pc prim-popper))
(def radio (pc prim-radio))
(def radio-group (pc prim-radio-group))
(def rating (pc prim-rating))
(def scoped-css-baseline (pc prim-scoped-css-baseline))
(def select (pc prim-select))
(def skeleton (pc prim-skeleton))
(def slide (pc prim-slide))
(def slider (pc prim-slider))
(def snackbar (pc prim-snackbar))
(def snackbar-content (pc prim-snackbar-content))
(def speed-dial (pc prim-speed-dial))
(def speed-dial-action (pc prim-speed-dial-action))
(def speed-dial-icon (pc prim-speed-dial-icon))
(def stack (pc prim-stack))
(def step (pc prim-step))
(def step-button (pc prim-step-button))
(def step-connector (pc prim-step-connector))
(def step-content (pc prim-step-content))
(def step-icon (pc prim-step-icon))
(def step-label (pc prim-step-label))
(def stepper (pc prim-stepper))
(def svg-icon (pc prim-svg-icon))
(def swipeable-drawer (pc prim-swipeable-drawer))
(def switch (pc prim-switch))
(def tab (pc prim-tab))
(def tab-context (pc prim-tab-context))
(def table (pc prim-table))
(def table-body (pc prim-table-body))
(def table-cell (pc prim-table-cell))
(def table-container (pc prim-table-container))
(def table-footer (pc prim-table-footer))
(def table-head (pc prim-table-head))
(def table-pagination (pc prim-table-pagination))
(def table-row (pc prim-table-row))
(def table-sort-label (pc prim-table-sort-label))
(def tab-list (pc prim-tab-list))
(def tab-panel (pc prim-tab-panel))
(def tabs (pc prim-tabs))
(def tab-scroll-button (pc prim-tab-scroll-button))
(def text-field (pc prim-text-field))
(def timeline (pc prim-timeline))
(def timeline-connector (pc prim-timeline-connector))
(def timeline-content (pc prim-timeline-content))
(def timeline-dot (pc prim-timeline-dot))
(def timeline-item (pc prim-timeline-item))
(def timeline-opposite-content (pc prim-timeline-opposite-content))
(def timeline-separator (pc prim-timeline-separator))
(def toggle-button (pc prim-toggle-button))
(def toggle-button-group (pc prim-toggle-button-group))
(def toolbar (pc prim-toolbar))
(def tooltip (pc prim-tooltip))
(def tree-item (pc prim-tree-item))
(def tree-view (pc prim-tree-view))
(def typography (pc prim-typography))
(def zoom (pc prim-zoom))

(def prim-data-grid (react-factory mui/DataGrid))
(def prim-grid-filter-form (react-factory mui/GridFilterForm))
(def prim-grid-filter-panel (react-factory mui/GridFilterPanel))
(def prim-grid-toolbar-quick-filter (react-factory mui/GridToolbarQuickFilter))
(def prim-grid-api (react-factory mui/GridApi))
(def prim-grid-cell-params (react-factory mui/GridCellParams))
(def prim-grid-col-def (react-factory mui/GridColDef))
(def prim-grid-single-select-col-def (react-factory mui/GridSingleSelectColDef))
(def prim-grid-actions-col-def (react-factory mui/GridActionsColDef))
(def prim-grid-export-state-params (react-factory mui/GridExportStateParams))
(def prim-grid-filter-item (react-factory mui/GridFilterItem))
(def prim-grid-filter-model (react-factory mui/GridFilterModel))
(def prim-grid-filter-operator (react-factory mui/GridFilterOperator))
(def prim-grid-row-class-name-params (react-factory mui/GridRowClassNameParams))
(def prim-grid-row-params (react-factory mui/GridRowParams))
(def prim-grid-row-spacing-params (react-factory mui/GridRowSpacingParams))
(def prim-grid-csv-export-options (react-factory mui/GridCsvExportOptions))
(def prim-grid-print-export-options (react-factory mui/GridPrintExportOptions))
(def prim-grid-excel-export-options (react-factory mui/GridExcelExportOptions))

(def data-grid (pc prim-data-grid))
(def grid-filter-form (pc prim-grid-filter-form))
(def grid-filter-panel (pc prim-grid-filter-panel))
(def grid-toolbar-quick-filter (pc prim-grid-toolbar-quick-filter))
(def grid-api (pc prim-grid-api))
(def grid-cell-params (pc prim-grid-cell-params))
(def grid-col-def (pc prim-grid-col-def))
(def grid-single-select-col-def (pc prim-grid-single-select-col-def))
(def grid-actions-col-def (pc prim-grid-actions-col-def))
(def grid-export-state-params (pc prim-grid-export-state-params))
(def grid-filter-item (pc prim-grid-filter-item))
(def grid-filter-model (pc prim-grid-filter-model))
(def grid-filter-operator (pc prim-grid-filter-operator))
(def grid-row-class-name-params (pc prim-grid-row-class-name-params))
(def grid-row-params (pc prim-grid-row-params))
(def grid-row-spacing-params (pc prim-grid-row-spacing-params))
(def grid-csv-export-options (pc prim-grid-csv-export-options))
(def grid-print-export-options (pc prim-grid-print-export-options))
(def grid-excel-export-options (pc prim-grid-excel-export-options))



(def prim-date-calendar (react-factory mui/DateCalendar))
(def prim-date-field (react-factory mui/DateField))
(def prim-date-picker (react-factory mui/DatePicker))
(def prim-date-picker-toolbar (react-factory mui/DatePickerToolbar))
(def prim-date-time-field (react-factory mui/DateTimeField))
(def prim-date-time-picker (react-factory mui/DateTimePicker))
(def prim-date-time-picker-tabs (react-factory mui/DateTimePickerTabs))
(def prim-date-time-picker-toolbar (react-factory mui/DateTimePickerToolbar))
(def prim-day-calendar-skeleton (react-factory mui/DayCalendarSkeleton))
(def prim-desktop-date-picker (react-factory mui/DesktopDatePicker))
(def prim-desktop-date-time-picker (react-factory mui/DesktopDateTimePicker))
(def prim-desktop-time-picker (react-factory mui/DesktopTimePicker))
(def prim-digital-clock (react-factory mui/DigitalClock))
(def prim-localization-provider (react-factory mui/LocalizationProvider))
(def prim-mobile-date-picker (react-factory mui/MobileDatePicker))
(def prim-mobile-date-time-picker (react-factory mui/MobileDateTimePicker))
(def prim-mobile-time-picker (react-factory mui/MobileTimePicker))
(def prim-month-calendar (react-factory mui/MonthCalendar))
(def prim-multi-section-digital-clock (react-factory mui/MultiSectionDigitalClock))
(def prim-pickers-action-bar (react-factory mui/PickersActionBar))
(def prim-pickers-day (react-factory mui/PickersDay))
(def prim-pickers-layout (react-factory mui/PickersLayout))
(def prim-pickers-shortcuts (react-factory mui/PickersShortcuts))
(def prim-static-date-picker (react-factory mui/StaticDatePicker))
(def prim-static-date-time-picker (react-factory mui/StaticDateTimePicker))
(def prim-static-time-picker (react-factory mui/StaticTimePicker))
(def prim-time-clock (react-factory mui/TimeClock))
(def prim-time-field (react-factory mui/TimeField))
(def prim-time-picker (react-factory mui/TimePicker))
(def prim-time-picker-toolbar (react-factory mui/TimePickerToolbar))
(def prim-year-calendar (react-factory mui/YearCalendar))

(def date-calendar (pc prim-date-calendar))
(def date-field (pc prim-date-field))
(def date-picker (pc prim-date-picker))
(def date-picker-toolbar (pc prim-date-picker-toolbar))
(def date-time-field (pc prim-date-time-field))
(def date-time-picker (pc prim-date-time-picker))
(def date-time-picker-tabs (pc prim-date-time-picker-tabs))
(def date-time-picker-toolbar (pc prim-date-time-picker-toolbar))
(def day-calendar-skeleton (pc prim-day-calendar-skeleton))
(def desktop-date-picker (pc prim-desktop-date-picker))
(def desktop-date-time-picker (pc prim-desktop-date-time-picker))
(def desktop-time-picker (pc prim-desktop-time-picker))
(def digital-clock (pc prim-digital-clock))
(def localization-provider (pc prim-localization-provider))
(def mobile-date-picker (pc prim-mobile-date-picker))
(def mobile-date-time-picker (pc prim-mobile-date-time-picker))
(def mobile-time-picker (pc prim-mobile-time-picker))
(def month-calendar (pc prim-month-calendar))
(def multi-section-digital-clock (pc prim-multi-section-digital-clock))
(def pickers-action-bar (pc prim-pickers-action-bar))
(def pickers-day (pc prim-pickers-day))
(def pickers-layout (pc prim-pickers-layout))
(def pickers-shortcuts (pc prim-pickers-shortcuts))
(def static-date-picker (pc prim-static-date-picker))
(def static-date-time-picker (pc prim-static-date-time-picker))
(def static-time-picker (pc prim-static-time-picker))
(def time-clock (pc prim-time-clock))
(def time-field (pc prim-time-field))
(def time-picker (pc prim-time-picker))
(def time-picker-toolbar (pc prim-time-picker-toolbar))
(def year-calendar (pc prim-year-calendar))



#_(def mui-components
  '[
    Accordion
    AccordionActions
    AccordionDetails
    AccordionSummary
    Alert
    AlertTitle
    AppBar
    Autocomplete
    Avatar
    AvatarGroup
    Backdrop
    Badge
    BottomNavigation
    BottomNavigationAction
    Box
    Breadcrumbs
    Button
    ButtonBase
    ButtonGroup
    Card
    CardActionArea
    CardActions
    CardContent
    CardHeader
    CardMedia
    Checkbox
    Chip
    CircularProgress
    Collapse
    Container
    CssBaseline
    Dialog
    DialogActions
    DialogContent
    DialogContentText
    DialogTitle
    Divider
    Drawer
    Fab
    Fade
    FilledInput
    FormControl
    FormControlLabel
    FormGroup
    FormHelperText
    FormLabel
    GlobalStyles
    Grid
    Grow
    Hidden
    Icon
    IconButton
    ImageList
    ImageListItem
    ImageListItemBar
    Input
    InputAdornment
    InputBase
    InputLabel
    LinearProgress
    Link
    List
    ListItem
    ListItemAvatar
    ListItemButton
    ListItemIcon
    ListItemSecondaryAction
    ListItemText
    ListSubheader
    LoadingButton
    Masonry
    Menu
    MenuItem
    MenuList
    MobileStepper
    Modal
    NativeSelect
    OutlinedInput
    Pagination
    PaginationItem
    Paper
    Popover
    Popper
    Radio
    RadioGroup
    Rating
    ScopedCssBaseline
    Select
    Skeleton
    Slide
    Slider
    Snackbar
    SnackbarContent
    SpeedDial
    SpeedDialAction
    SpeedDialIcon
    Stack
    Step
    StepButton
    StepConnector
    StepContent
    StepIcon
    StepLabel
    Stepper
    SvgIcon
    SwipeableDrawer
    Switch
    Tab
    TabContext
    Table
    TableBody
    TableCell
    TableContainer
    TableFooter
    TableHead
    TablePagination
    TableRow
    TableSortLabel
    TabList
    TabPanel
    Tabs
    TabScrollButton
    TextField
    Timeline
    TimelineConnector
    TimelineContent
    TimelineDot
    TimelineItem
    TimelineOppositeContent
    TimelineSeparator
    ToggleButton
    ToggleButtonGroup
    Toolbar
    Tooltip
    TreeItem
    TreeView
    Typography
    Zoom
    ])

#_(let [renames (map (comp csk/->kebab-case str) mui-components)
      prim-renames (map #(str "prim-" %) renames)
      prim-defs (map #(str "(def " %1 " (react-factory mui/" %2 "))") prim-renames mui-components)
      pc-defs (map #(str "(def " %1 " (pc " %2 "))") renames prim-renames)]
    pc-defs)


#_(def muix-grid-components
  '[
    DataGrid
    GridFilterForm
    GridFilterPanel
    GridToolbarQuickFilter
    GridApi
    GridCellParams
    GridColDef
    GridSingleSelectColDef
    GridActionsColDef
    GridExportStateParams
    GridFilterItem
    GridFilterModel
    GridFilterOperator
    GridRowClassNameParams
    GridRowParams
    GridRowSpacingParams
    GridCsvExportOptions
    GridPrintExportOptions
    GridExcelExportOptions
    ])

#_(let [renames (map (comp csk/->kebab-case str) muix-grid-components)
      prim-renames (map #(str "prim-" %) renames)
      prim-defs (map #(str "(def " %1 " (react-factory mui/" %2 "))") prim-renames muix-grid-components)
      pc-defs (map #(str "(def " %1 " (pc " %2 "))") renames prim-renames)]
  pc-defs)


#_(def muix-date-components
  '[
    DateCalendar
    DateField
    DatePicker
    DatePickerToolbar
    DateTimeField
    DateTimePicker
    DateTimePickerTabs
    DateTimePickerToolbar
    DayCalendarSkeleton
    DesktopDatePicker
    DesktopDateTimePicker
    DesktopTimePicker
    DigitalClock
    LocalizationProvider
    MobileDatePicker
    MobileDateTimePicker
    MobileTimePicker
    MonthCalendar
    MultiSectionDigitalClock
    PickersActionBar
    PickersDay
    PickersLayout
    PickersShortcuts
    StaticDatePicker
    StaticDateTimePicker
    StaticTimePicker
    TimeClock
    TimeField
    TimePicker
    TimePickerToolbar
    YearCalendar
    ])

#_(let [renames (map (comp csk/->kebab-case str) muix-date-components)
      prim-renames (map #(str "prim-" %) renames)
      prim-defs (map #(str "(def " %1 " (react-factory mui/" %2 "))") prim-renames muix-date-components)
      pc-defs (map #(str "(def " %1 " (pc " %2 "))") renames prim-renames)]
  pc-defs)
