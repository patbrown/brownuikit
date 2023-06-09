(ns tools.drilling.uikit.native.rnp
  (:require [com.fulcrologic.fulcro-native.alpha.components :refer [react-factory]]
            [tools.drilling.uikit.u :refer [pc ppc]]
            ["react-native-paper" :as rnp]))

(def prim-activity-indicator (react-factory rnp/ActivityIndicator))
(def activity-indicator (pc prim-activity-indicator))
(def prim-appbar-action (react-factory rnp/Appbar.Action))
(def appbar-action (pc prim-appbar-action))
(def prim-appbar-back-action (react-factory rnp/Appbar.BackAction))
(def appbar-back (pc prim-appbar-back-action))
(def prim-appbar-content (react-factory rnp/Appbar.Content))
(def appbar-content (pc prim-appbar-content))
(def prim-appbar-header (react-factory rnp/Appbar.Header))
(def appbar-header (pc prim-appbar-header))
(def prim-avatar-icon (react-factory rnp/Avatar.Icon))
(def avatar-icon (pc prim-avatar-icon))
(def prim-avatar-image (react-factory rnp/Avatar.Image))
(def avatar-image (pc prim-avatar-image))
(def prim-avatar-text (react-factory rnp/Avatar.Text))
(def avatar-text (pc prim-avatar-text))
(def prim-badge (react-factory rnp/Badge))
(def badge (pc prim-badge))
(def prim-banner (react-factory rnp/Banner))
(def banner (pc prim-banner))
(def prim-button (react-factory rnp/Button))
(def button (pc prim-button))
(def prim-card (react-factory rnp/Card))
(def card (pc prim-card))
(def prim-card-actions (react-factory rnp/Card.Actions))
(def card-actions (pc prim-card-actions))
(def prim-card-content (react-factory rnp/Card.Content))
(def card-content (pc prim-card-content))
(def prim-card-cover (react-factory rnp/Card.Cover))
(def card-cover (pc prim-card-cover))
(def prim-card-title (react-factory rnp/Card.Title))
(def card-title (pc prim-card-title))
(def prim-checkbox (react-factory rnp/Checkbox))
(def checkbox (pc prim-checkbox))
(def prim-checkbox-android (react-factory rnp/Checkbox.Android))
(def checkbox-android (pc prim-checkbox-android))
(def prim-checkbox-ios (react-factory rnp/Checkbox.IOS))
(def checkbox-ios (pc prim-checkbox-ios))
(def prim-checkbox-item (react-factory rnp/Checkbox.Item))
(def checkbox-item (pc prim-checkbox-item))
(def prim-chip (react-factory rnp/Chip))
(def chip (pc prim-chip))
(def prim-data-table (react-factory rnp/DataTable))
(def table (pc prim-data-table))
(def prim-data-table-cell (react-factory rnp/DataTable.Cell))
(def table-cell (pc prim-data-table-cell))
(def prim-data-table-header (react-factory rnp/DataTable.Header))
(def table-header (pc prim-data-table-header))
(def prim-data-table-pagination (react-factory rnp/DataTable.Pagination))
(def table-pagination (pc prim-data-table-pagination))
(def prim-data-table-row (react-factory rnp/DataTable.Row))
(def table-row (pc prim-data-table-row))
(def prim-data-table-title (react-factory rnp/DataTable.Title))
(def table-title (pc prim-data-table-title))
(def prim-dialog (react-factory rnp/Dialog))
(def dialog (pc prim-dialog))
(def prim-dialog-actions (react-factory rnp/Dialog.Actions))
(def dialog-actions (pc prim-dialog-actions))
(def prim-dialog-content (react-factory rnp/Dialog.Content))
(def dialog-content (pc prim-dialog-content))
(def prim-dialog-icon (react-factory rnp/Dialog.Icon))
(def dialog-icon (pc prim-dialog-icon))
(def prim-dialog-scroll-area (react-factory rnp/Dialog.ScrollArea))
(def dialog-scroll-area (pc prim-dialog-scroll-area))
(def prim-dialog-title (react-factory rnp/Dialog.Title))
(def dialog-title (pc prim-dialog-title))
(def prim-divider (react-factory rnp/Divider))
(def divider (pc prim-divider))
(def prim-drawer-collapsed-item (react-factory rnp/Drawer.CollapsedItem))
(def drawer-collapsed-item (pc prim-drawer-collapsed-item))
(def prim-drawer-item (react-factory rnp/Drawer.Item))
(def drawer-item (pc prim-drawer-item))
(def prim-drawer-section (react-factory rnp/Drawer.Section))
(def drawer-section (pc prim-drawer-section))
(def prim-fab (react-factory rnp/FAB))
(def fab (pc prim-fab))
(def prim-animated-fab (react-factory rnp/AnimatedFAB))
(def animated-fab (pc prim-animated-fab))
(def prim-fab-group (react-factory rnp/FAB.Group))
(def fab-group (pc prim-fab-group))
(def prim-icon-button (react-factory rnp/IconButton))
(def icon-button (pc prim-icon-button))
(def prim-list (react-factory rnp/List))
(def collection (pc prim-list))
(def prim-list-accordion (react-factory rnp/List.Accordion))
(def accordion (pc prim-list-accordion))
(def prim-list-accordion-group (react-factory rnp/List.AccordionGroup))
(def accordion-group (pc prim-list-accordion-group))
(def prim-list-icon (react-factory rnp/List.Icon))
(def collection-icon (pc prim-list-icon))
(def prim-list-item (react-factory rnp/List.Item))
(def collection-item (pc prim-list-item))
(def prim-list-section (react-factory rnp/List.Section))
(def collection-section (pc prim-list-section))
(def prim-list-subheader (react-factory rnp/List.Subheader))
(def collection-subheader (pc prim-list-subheader))
(def prim-menu (react-factory rnp/Menu))
(def menu (pc prim-menu))
(def prim-menu-item (react-factory rnp/Menu.Item))
(def menu-item (pc prim-menu-item))
(def prim-modal (react-factory rnp/Modal))
(def modal (pc prim-modal))
(def prim-portal (react-factory rnp/Portal))
(def portal (pc prim-portal))
(def prim-portal-host (react-factory rnp/Portal.Host))
(def portal-host (pc prim-portal-host))
(def prim-progress-bar (react-factory rnp/ProgressBar))
(def progress-bar (pc prim-progress-bar))
(def prim-radio-button (react-factory rnp/RadioButton))
(def radio-button (pc prim-radio-button))
(def prim-radio-button-android (react-factory rnp/RadioButton.Android))
(def radio-button-android (pc prim-radio-button-android))
(def prim-radio-button-group (react-factory rnp/RadioButton.Group))
(def radio-button-group (pc prim-radio-button-group))
(def prim-radio-button-ios (react-factory rnp/RadioButton.IOS))
(def radio-button-ios (pc prim-radio-button-ios))
(def prim-radio-button-item (react-factory rnp/RadioButton.Item))
(def radio-button-item (pc prim-radio-button-item))
(def prim-search-bar (react-factory rnp/SearchBar))
(def search-bar (pc prim-search-bar))
(def prim-segmented-buttons (react-factory rnp/SegmentedButtons))
(def segmented-buttons (pc prim-segmented-buttons))
(def prim-snackbar (react-factory rnp/Snackbar))
(def snackbar (pc prim-snackbar))
(def prim-surface (react-factory rnp/Surface))
(def surface (pc prim-surface))
(def prim-switch (react-factory rnp/Switch))
(def switch (pc prim-switch))
(def prim-text (react-factory rnp/Text))
(def text (pc prim-text))
(def prim-text-input (react-factory rnp/TextInput))
(def text-input (pc prim-text-input))
(def prim-text-input-affix (react-factory rnp/TextInput.Affix))
(def text-input-affix (pc prim-text-input-affix))
(def prim-text-input-icon (react-factory rnp/TextInput.Icon))
(def text-input-icon (pc prim-text-input-icon))
(def prim-toggle-button (react-factory rnp/ToggleButton))
(def toggle-button (pc prim-toggle-button))
(def prim-toggle-button-group (react-factory rnp/ToggleButton.Group))
(def toggle-button-group (pc prim-toggle-button-group))
(def prim-toggle-button-row (react-factory rnp/ToggleButton.Row))
(def toggle-button-row (pc prim-toggle-button-row))
(def prim-tooltip (react-factory rnp/Tooltip))
(def tooltip (pc prim-tooltip))
(def prim-touchable-ripple (react-factory rnp/TouchableRipple))
(def touchable-ripple (pc prim-touchable-ripple))

#_(def rnp-components
  '[
   rnp/ActivityIndicator
   rnp/Appbar.Action
   rnp/Appbar.BackAction
   rnp/Appbar.Content
   rnp/Appbar.Header
   rnp/Avatar.Icon
   rnp/Avatar.Image
   rnp/Avatar.Text
   rnp/Badge
   rnp/Banner
   rnp/Button
   rnp/Card
   rnp/Card.Actions
   rnp/Card.Content
   rnp/Card.Cover
   rnp/Card.Title
   rnp/Checkbox
   rnp/Checkbox.Android
   rnp/Checkbox.IOS
   rnp/Checkbox.Item
   rnp/Chip
   rnp/DataTable
   rnp/DataTable.Cell
   rnp/DataTable.Header
   rnp/DataTable.Pagination
   rnp/DataTable.Row
   rnp/DataTable.Title
   rnp/Dialog
   rnp/Dialog.Actions
   rnp/Dialog.Content
   rnp/Dialog.Icon
   rnp/Dialog.ScrollArea
   rnp/Dialog.Title
   rnp/Divider
   rnp/Drawer.CollapsedItem
   rnp/Drawer.Item
   rnp/Drawer.Section
   rnp/FAB
   rnp/AnimatedFAB
   rnp/FAB.Group
   rnp/IconButton
   rnp/List
   rnp/List.Accordion
   rnp/List.AccordionGroup
   rnp/List.Icon
   rnp/List.Item
   rnp/List.Section
   rnp/List.Subheader
   rnp/Menu
   rnp/Menu.Item
   rnp/Modal
   rnp/Portal
   rnp/Portal.Host
   rnp/ProgressBar
   rnp/RadioButton
   rnp/RadioButton.Android
   rnp/RadioButton.Group
   rnp/RadioButton.IOS
   rnp/RadioButton.Item
   rnp/SearchBar
   rnp/SegmentedButtons
   rnp/Snackbar
   rnp/Surface
   rnp/Switch
   rnp/Text
   rnp/TextInput
   rnp/TextInput.Affix
   rnp/TextInput.Icon
   rnp/ToggleButton
   rnp/ToggleButton.Group
   rnp/ToggleButton.Row
   rnp/Tooltip
   rnp/TouchableRipple])
