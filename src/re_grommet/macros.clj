 (ns re-grommet.macros)

(def grommet-react-tags
  '[Accordion
    AccordionPanel
    Anchor
    Animate
    App
    Article
    Box
    Button
    Card
    Carousel
    ;    Chart
    CheckBox
    Columns
    DateTime
    Distribution
    Footer
    Form
    FormattedMessage
    FormField
    FormFields
    Grommet
    Header
    Heading
    Headline
    Hero
    Image
    Label
    Layer
    Legend
    List
    ListItem
    LoginForm
    Map
    Markdown
    Menu
    Meter
    Notification
    NumberInput
    Object
    Paragraph
    Quote
    RadioButton
    Search
    SearchInput
    Section
    Select
    Sidebar
    SkipLinkAnchor
    SkipLinks
    SocialShare
    Split
    SunBurst
    SVGIcon
    Tab
    Table
    TableHeader
    TableRow
    Tabs
    TBD
    TextInput
    Tile
    Tiles
    Timestamp
    Tip
    Title
    Toast
    Topology
    Value
    Video
    WorldMap
    ;Icons
    ;Cookies
    ;DOM
    ;KeyboardAccelerators
    ;Locale
    ;Rest
    ;Validator
    ])


(def reserved-tags #{"List" "Box"})


(defn create-grommet-react-component [tag]
  (let [tag-name (if (reserved-tags (name tag))
                   (-> tag name (str "RG") symbol)
                   tag)]
    `(def ~tag-name (aget js/Grommet ~(name tag))
       )))


(defmacro export-grommet-react-components []
  `(do ~@(map create-grommet-react-component
              grommet-react-tags)))

;; Icons.  Created as elements as they're almost always refs in componets
(def grommet-icon-tags
  '[
    AccessAccessibility
    AccessAd
    AccessAssistListening
    AccessBraille
    AccessSign
    AccessTty
    AccessVolumeControl
    AccessWheelchairActive
    AccessWheelchair
    Achievement
    Action
    Actions
    AddCircle
    Add
    Aggregate
    Aid
    Alarm
    Alert
    Analytics
    Announce
    Apps
    Archive
    Article
    Ascend
    Attachment
    BackTen
    BarChart
    Basket
    Blog
    Book
    Bookmark
    BottomCorner
    BrandAppleAppStore
    BrandCodepenEdit
    BrandCodepenTry
    BrandGooglePlay
    BrandGrommetOutline
    BrandGrommetPath
    BrandHpeElementOutline
    BrandHpeElementPath
    BrandHpeLabsInsigniaOutline
    BrandHpeLabsInsignia
    BrandHpeStackCentered
    BrandHpeStack
    Briefcase
    Brush
    Bug
    Bundle
    BusinessService
    Calculator
    Calendar
    Camera
    Capacity
    Car
    CaretDown
    CaretNext
    CaretPrevious
    CaretUp
    Cart
    Catalog
    ChapterAdd
    ChapterNext
    ChapterPrevious
    Chat
    CheckboxSelected
    Checkbox
    Checkmark
    CircleInformation
    CirclePlay
    CircleQuestion
    ClearOption
    Clear
    Cli
    Clipboard
    Clock
    Clone
    Close
    ClosedCaption
    CloudComputer
    CloudDownload
    CloudSoftware
    CloudUpload
    Cloud
    Cluster
    Code
    Columns
    Compare
    Compass
    Compliance
    Configure
    Connect
    ContactInfo
    Contact
    Contract
    Copy
    CreditCard
    Cube
    Cubes
    Currency
    Cursor
    Cut
    Cycle
    Dashboard
    Database
    Deliver
    Deploy
    Descend
    Desktop
    Detach
    Diamond
    Directions
    Dislike
    DocumentCloud
    DocumentConfig
    DocumentCsv
    DocumentDownload
    DocumentExcel
    DocumentExe
    DocumentImage
    DocumentLocked
    DocumentMissing
    DocumentNotes
    DocumentOutlook
    DocumentPdf
    DocumentPerformance
    DocumentPpt
    DocumentRtf
    DocumentSound
    DocumentStore
    DocumentTest
    DocumentThreat
    DocumentTime
    DocumentTransfer
    DocumentTxt
    DocumentUpdate
    DocumentUpload
    DocumentUser
    DocumentVerified
    DocumentVideo
    DocumentWindows
    DocumentWord
    DocumentZip
    Document
    Domain
    Down
    Download
    Drag
    DriveCage
    Duplicate
    Edit
    Eject
    EmptyCircle
    Expand
    Fan
    FastForward
    Favorite
    Filter
    FingerPrint
    Flag
    FolderCycle
    FolderOpen
    Folder
    ForwardTen
    Gallery
    Gamepad
    Gift
    Globe
    Grid
    Group
    Grow
    Halt
    Help
    History
    Home
    HostMaintenance
    Host
    Image
    Impact
    InProgress
    Inbox
    Indicator
    Info
    Inherit
    Inspect
    Install
    Integration
    Iteration
    Java
    Language
    Launch
    Layer
    License
    Like
    LineChart
    LinkBottom
    LinkDown
    LinkNext
    LinkPrevious
    LinkTop
    LinkUp
    Link
    Local
    LocationPin
    Location
    Lock
    Login
    Logout
    Magic
    MailOption
    Mail
    Manual
    MapLocation
    Map
    Menu
    Microphone
    Money
    Monitor
    More
    Multiple
    Navigate
    NewWindow
    New
    Next
    Nodes
    Note
    Notes
    Notification
    ObjectGroup
    ObjectUngroup
    Optimize
    Organization
    Overview
    Pan
    PauseFill
    Pause
    PersonalComputer
    PieChart
    Pin
    Plan
    PlatformAmazon
    PlatformAndroid
    PlatformApple
    PlatformArchlinux
    PlatformAruba
    PlatformCentos
    PlatformChrome
    PlatformCloudlinux
    PlatformDebian
    PlatformDocker
    PlatformDos
    PlatformDropbox
    PlatformEdge
    PlatformFedora
    PlatformFirefox
    PlatformFreebsd
    PlatformGoogle
    PlatformHadoop
    PlatformHeroku
    PlatformHorton
    PlatformHp
    PlatformHpi
    PlatformInternetExplorer
    PlatformJava
    PlatformMandriva
    PlatformMysql
    PlatformNorton
    PlatformOnedrive
    PlatformOpera
    PlatformOracle
    PlatformPiedPiper
    PlatformRaspberry
    PlatformReactjs
    PlatformRedhat
    PlatformSafariOption
    PlatformSafari
    PlatformSco
    PlatformSolaris
    PlatformSuse
    PlatformSwift
    PlatformTurbolinux
    PlatformUbuntu
    PlatformUnixware
    PlatformVmware
    PlatformWindowsLegacy
    PlatformWindows
    PlayFill
    Play
    Power
    Previous
    Print
    RadialSelected
    Radial
    Refresh
    Resources
    Resume
    Revert
    Rewind
    Risk
    Robot
    Rss
    Run
    Satellite
    Save
    Scan
    ScheduleNew
    SchedulePlay
    Schedule
    Schedules
    Scorecard
    SearchAdvanced
    Search
    Secure
    Select
    Selection
    Send
    ServerCluster
    Server
    Servers
    ServicePlay
    Services
    SettingsOption
    Share
    ShieldSecurity
    Shield
    Shift
    Sidebar
    SocialAmazon
    SocialAmex
    SocialBitcoin
    SocialCodepen
    SocialCreativeCommons
    SocialDropbox
    SocialFacebookOption
    SocialFacebook
    SocialGithub
    SocialGooglePlus
    SocialGoogleWallet
    SocialInstagram
    SocialLinkedinOption
    SocialLinkedin
    SocialMail
    SocialMastercard
    SocialMedium
    SocialPaypal
    SocialPinterest
    SocialProductHunt
    SocialReddit
    SocialSkype
    SocialSlack
    SocialSnapchat
    SocialSquare
    SocialStackOverflow
    SocialStripe
    SocialTumblr
    SocialTwitter
    SocialVimeo
    SocialVine
    SocialVisa
    SocialWordpress
    SocialYoutube
    Sort
    Split
    Splits
    Stakeholder
    Standards-3dEffects
    StandardsConnectivity
    StandardsCss3
    StandardsDevice
    StandardsFireball
    StandardsHtml5
    StandardsMultimedia
    StandardsOfflineStorage
    StandardsPerformance
    StandardsSematics
    StarHalf
    Star
    Steps
    StopFill
    Stop
    Storage
    StreetView
    SubtractCircle
    Subtract
    Support
    Sync
    System
    TableAdd
    Table
    Tag
    Target
    Task
    Tasks
    Technology
    Template
    Terminal
    TestDesktop
    Test
    TextWrap
    Threats
    Ticket
    Tools
    Tooltip
    TopCorner
    Transaction
    Trash
    Tree
    Trigger
    Trophy
    Troubleshoot
    Unlink
    Unlock
    Up
    Update
    Upgrade
    Upload
    UserAdd
    UserAdmin
    UserExpert
    UserFemale
    UserManager
    UserNew
    UserPolice
    UserSettings
    UserWorker
    User
    Validate
    Video
    View
    VirtualMachine
    VmMaintenance
    VolumeLow
    VolumeMute
    Volume
    Vulnerability
    Waypoint
    Workshop
    ZoomIn
    ZoomOut])

(def reserved-icon-tags #{})


(defn create-grommet-react-icon [tag]
  (let [tag-name (if (reserved-icon-tags (name tag))
                   (-> tag name (str "RG") symbol)
                   (-> tag name (str "Icon") symbol))]
    `(def ~tag-name (aget js/Grommet "Icons" "Base" ~(name tag)))))


(defmacro export-grommet-react-icons []
  `(do ~@(map create-grommet-react-icon
              grommet-icon-tags)))