 (ns macros)

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
    chart
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
    Icons
    Cookies
    DOM
    KeyboardAccelerators
    Locale
    Rest
    Validator
    ])


(def reserved-tags #{})


(defn create-grommet-react-component [tag]
  (let [tag-name (if (reserved-tags (name tag))
                   (-> tag name (str "RG") symbol)
                   tag)]
    `(def ~tag-name (reagent.core/adapt-react-class
                      (aget js/Grommet ~(name tag))))))


(defmacro export-grommet-react-components []
  `(do ~@(map create-grommet-react-component
              grommet-react-tags)))
