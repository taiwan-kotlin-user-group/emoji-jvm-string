package net.purefunc.emoji

enum class Emoji1(
    private val intArray: IntArray,
) {
    // 🌞 🌞 🌞
    SUN_WITH_FACE(intArrayOf(0x1F31E)),
    // 🪐 🪐 🪐
    RINGED_PLANET(intArrayOf(0x1FA90)),
    // ⭐ ⭐ ⭐
    STAR(intArrayOf(0x2B50)),
    // 🌟 🌟 🌟
    GLOWING_STAR(intArrayOf(0x1F31F)),
    // 🌠 🌠 🌠
    SHOOTING_STAR(intArrayOf(0x1F320)),
    // 🌌 🌌 🌌
    MILKY_WAY(intArrayOf(0x1F30C)),
    // ☁️ ☁️ ☁️
    CLOUD(intArrayOf(0x2601,0xFE0F)),
    // ⛅ ⛅ ⛅
    SUN_BEHIND_CLOUD(intArrayOf(0x26C5)),
    // ⛈️ ⛈️ ⛈️
    CLOUD_WITH_LIGHTNING_AND_RAIN(intArrayOf(0x26C8,0xFE0F)),
    // 🌤️ 🌤️ 🌤️
    SUN_BEHIND_SMALL_CLOUD(intArrayOf(0x1F324,0xFE0F)),
    // 🌥️ 🌥️ 🌥️
    SUN_BEHIND_LARGE_CLOUD(intArrayOf(0x1F325,0xFE0F)),
    // 🌦️ 🌦️ 🌦️
    SUN_BEHIND_RAIN_CLOUD(intArrayOf(0x1F326,0xFE0F)),
    // 🌧️ 🌧️ 🌧️
    CLOUD_WITH_RAIN(intArrayOf(0x1F327,0xFE0F)),
    // 🌨️ 🌨️ 🌨️
    CLOUD_WITH_SNOW(intArrayOf(0x1F328,0xFE0F)),
    // 🌩️ 🌩️ 🌩️
    CLOUD_WITH_LIGHTNING(intArrayOf(0x1F329,0xFE0F)),
    // 🌪️ 🌪️ 🌪️
    TORNADO(intArrayOf(0x1F32A,0xFE0F)),
    // 🌫️ 🌫️ 🌫️
    FOG(intArrayOf(0x1F32B,0xFE0F)),
    // 🌬️ 🌬️ 🌬️
    WIND_FACE(intArrayOf(0x1F32C,0xFE0F)),
    // 🌀 🌀 🌀
    CYCLONE(intArrayOf(0x1F300)),
    // 🌈 🌈 🌈
    RAINBOW(intArrayOf(0x1F308)),
    // 🌂 🌂 🌂
    CLOSED_UMBRELLA(intArrayOf(0x1F302)),
    // ☂️ ☂️ ☂️
    UMBRELLA(intArrayOf(0x2602,0xFE0F)),
    // ☔ ☔ ☔
    UMBRELLA_WITH_RAIN_DROPS(intArrayOf(0x2614)),
    // ⛱️ ⛱️ ⛱️
    UMBRELLA_ON_GROUND(intArrayOf(0x26F1,0xFE0F)),
    // ⚡ ⚡ ⚡
    HIGH_VOLTAGE(intArrayOf(0x26A1)),
    // ❄️ ❄️ ❄️
    SNOWFLAKE(intArrayOf(0x2744,0xFE0F)),
    // ☃️ ☃️ ☃️
    SNOWMAN(intArrayOf(0x2603,0xFE0F)),
    // ⛄ ⛄ ⛄
    SNOWMAN_WITHOUT_SNOW(intArrayOf(0x26C4)),
    // ☄️ ☄️ ☄️
    COMET(intArrayOf(0x2604,0xFE0F)),
    // 🔥 🔥 🔥
    FIRE(intArrayOf(0x1F525)),
    // 💧 💧 💧
    DROPLET(intArrayOf(0x1F4A7)),
    // 🌊 🌊 🌊
    WATER_WAVE(intArrayOf(0x1F30A)),
    // 🎃 🎃 🎃
    JACK_O_LANTERN(intArrayOf(0x1F383)),
    // 🎄 🎄 🎄
    CHRISTMAS_TREE(intArrayOf(0x1F384)),
    // 🎆 🎆 🎆
    FIREWORKS(intArrayOf(0x1F386)),
    // 🎇 🎇 🎇
    SPARKLER(intArrayOf(0x1F387)),
    // 🧨 🧨 🧨
    FIRECRACKER(intArrayOf(0x1F9E8)),
    // ✨ ✨ ✨
    SPARKLES(intArrayOf(0x2728)),
    // 🎈 🎈 🎈
    BALLOON(intArrayOf(0x1F388)),
    // 🎉 🎉 🎉
    PARTY_POPPER(intArrayOf(0x1F389)),
    // 🎊 🎊 🎊
    CONFETTI_BALL(intArrayOf(0x1F38A)),
    // 🎋 🎋 🎋
    TANABATA_TREE(intArrayOf(0x1F38B)),
    // 🎍 🎍 🎍
    PINE_DECORATION(intArrayOf(0x1F38D)),
    // 🎎 🎎 🎎
    JAPANESE_DOLLS(intArrayOf(0x1F38E)),
    // 🎏 🎏 🎏
    CARP_STREAMER(intArrayOf(0x1F38F)),
    // 🎐 🎐 🎐
    WIND_CHIME(intArrayOf(0x1F390)),
    // 🎑 🎑 🎑
    MOON_VIEWING_CEREMONY(intArrayOf(0x1F391)),
    // 🧧 🧧 🧧
    RED_ENVELOPE(intArrayOf(0x1F9E7)),
    // 🎀 🎀 🎀
    RIBBON(intArrayOf(0x1F380)),
    // 🎁 🎁 🎁
    WRAPPED_GIFT(intArrayOf(0x1F381)),
    // 🎗️ 🎗️ 🎗️
    REMINDER_RIBBON(intArrayOf(0x1F397,0xFE0F)),
    // 🎟️ 🎟️ 🎟️
    ADMISSION_TICKETS(intArrayOf(0x1F39F,0xFE0F)),
    // 🎫 🎫 🎫
    TICKET(intArrayOf(0x1F3AB)),
    // 🎖️ 🎖️ 🎖️
    MILITARY_MEDAL(intArrayOf(0x1F396,0xFE0F)),
    // 🏆 🏆 🏆
    TROPHY(intArrayOf(0x1F3C6)),
    // 🏅 🏅 🏅
    SPORTS_MEDAL(intArrayOf(0x1F3C5)),
    // 🥇 🥇 🥇
    FIRST_PLACE_MEDAL(intArrayOf(0x1F947)),
    // 🥈 🥈 🥈
    SECOND_PLACE_MEDAL(intArrayOf(0x1F948)),
    // 🥉 🥉 🥉
    THIRD_PLACE_MEDAL(intArrayOf(0x1F949)),
    // ⚽ ⚽ ⚽
    SOCCER_BALL(intArrayOf(0x26BD)),
    // ⚾ ⚾ ⚾
    BASEBALL(intArrayOf(0x26BE)),
    // 🥎 🥎 🥎
    SOFTBALL(intArrayOf(0x1F94E)),
    // 🏀 🏀 🏀
    BASKETBALL(intArrayOf(0x1F3C0)),
    // 🏐 🏐 🏐
    VOLLEYBALL(intArrayOf(0x1F3D0)),
    // 🏈 🏈 🏈
    AMERICAN_FOOTBALL(intArrayOf(0x1F3C8)),
    // 🏉 🏉 🏉
    RUGBY_FOOTBALL(intArrayOf(0x1F3C9)),
    // 🎾 🎾 🎾
    TENNIS(intArrayOf(0x1F3BE)),
    // 🥏 🥏 🥏
    FLYING_DISC(intArrayOf(0x1F94F)),
    // 🎳 🎳 🎳
    BOWLING(intArrayOf(0x1F3B3)),
    // 🏏 🏏 🏏
    CRICKET_GAME(intArrayOf(0x1F3CF)),
    // 🏑 🏑 🏑
    FIELD_HOCKEY(intArrayOf(0x1F3D1)),
    // 🏒 🏒 🏒
    ICE_HOCKEY(intArrayOf(0x1F3D2)),
    // 🥍 🥍 🥍
    LACROSSE(intArrayOf(0x1F94D)),
    // 🏓 🏓 🏓
    PING_PONG(intArrayOf(0x1F3D3)),
    // 🏸 🏸 🏸
    BADMINTON(intArrayOf(0x1F3F8)),
    // 🥊 🥊 🥊
    BOXING_GLOVE(intArrayOf(0x1F94A)),
    // 🥋 🥋 🥋
    MARTIAL_ARTS_UNIFORM(intArrayOf(0x1F94B)),
    // 🥅 🥅 🥅
    GOAL_NET(intArrayOf(0x1F945)),
    // ⛳ ⛳ ⛳
    FLAG_IN_HOLE(intArrayOf(0x26F3)),
    // ⛸️ ⛸️ ⛸️
    ICE_SKATE(intArrayOf(0x26F8,0xFE0F)),
    // 🎣 🎣 🎣
    FISHING_POLE(intArrayOf(0x1F3A3)),
    // 🤿 🤿 🤿
    DIVING_MASK(intArrayOf(0x1F93F)),
    // 🎽 🎽 🎽
    RUNNING_SHIRT(intArrayOf(0x1F3BD)),
    // 🎿 🎿 🎿
    SKIS(intArrayOf(0x1F3BF)),
    // 🛷 🛷 🛷
    SLED(intArrayOf(0x1F6F7)),
    // 🥌 🥌 🥌
    CURLING_STONE(intArrayOf(0x1F94C)),
    // 🎯 🎯 🎯
    BULLSEYE(intArrayOf(0x1F3AF)),
    // 🪀 🪀 🪀
    YO_YO(intArrayOf(0x1FA80)),
    // 🪁 🪁 🪁
    KITE(intArrayOf(0x1FA81)),
    // 🔫 🔫 🔫
    WATER_PISTOL(intArrayOf(0x1F52B)),
    // 🎱 🎱 🎱
    POOL_8_BALL(intArrayOf(0x1F3B1)),
    // 🔮 🔮 🔮
    CRYSTAL_BALL(intArrayOf(0x1F52E)),
    // 🪄 🪄 🪄
    MAGIC_WAND(intArrayOf(0x1FA84)),
    // 🎮 🎮 🎮
    VIDEO_GAME(intArrayOf(0x1F3AE)),
    // 🕹️ 🕹️ 🕹️
    JOYSTICK(intArrayOf(0x1F579,0xFE0F)),
    // 🎰 🎰 🎰
    SLOT_MACHINE(intArrayOf(0x1F3B0)),
    // 🎲 🎲 🎲
    GAME_DIE(intArrayOf(0x1F3B2)),
    // 🧩 🧩 🧩
    PUZZLE_PIECE(intArrayOf(0x1F9E9)),
    // 🧸 🧸 🧸
    TEDDY_BEAR(intArrayOf(0x1F9F8)),
    // 🪅 🪅 🪅
    PIÑATA(intArrayOf(0x1FA85)),
    // 🪩 🪩 🪩
    MIRROR_BALL(intArrayOf(0x1FAA9)),
    // 🪆 🪆 🪆
    NESTING_DOLLS(intArrayOf(0x1FA86)),
    // ♠️ ♠️ ♠️
    SPADE_SUIT(intArrayOf(0x2660,0xFE0F)),
    // ♥️ ♥️ ♥️
    HEART_SUIT(intArrayOf(0x2665,0xFE0F)),
    // ♦️ ♦️ ♦️
    DIAMOND_SUIT(intArrayOf(0x2666,0xFE0F)),
    // ♣️ ♣️ ♣️
    CLUB_SUIT(intArrayOf(0x2663,0xFE0F)),
    // ♟️ ♟️ ♟️
    CHESS_PAWN(intArrayOf(0x265F,0xFE0F)),
    // 🃏 🃏 🃏
    JOKER(intArrayOf(0x1F0CF)),
    // 🀄 🀄 🀄
    MAHJONG_RED_DRAGON(intArrayOf(0x1F004)),
    // 🎴 🎴 🎴
    FLOWER_PLAYING_CARDS(intArrayOf(0x1F3B4)),
    // 🎭 🎭 🎭
    PERFORMING_ARTS(intArrayOf(0x1F3AD)),
    // 🖼️ 🖼️ 🖼️
    FRAMED_PICTURE(intArrayOf(0x1F5BC,0xFE0F)),
    // 🎨 🎨 🎨
    ARTIST_PALETTE(intArrayOf(0x1F3A8)),
    // 🧵 🧵 🧵
    THREAD(intArrayOf(0x1F9F5)),
    // 🪡 🪡 🪡
    SEWING_NEEDLE(intArrayOf(0x1FAA1)),
    // 🧶 🧶 🧶
    YARN(intArrayOf(0x1F9F6)),
    // 🪢 🪢 🪢
    KNOT(intArrayOf(0x1FAA2)),
    // 👓 👓 👓
    GLASSES(intArrayOf(0x1F453)),
    // 🕶️ 🕶️ 🕶️
    SUNGLASSES(intArrayOf(0x1F576,0xFE0F)),
    // 🥽 🥽 🥽
    GOGGLES(intArrayOf(0x1F97D)),
    // 🥼 🥼 🥼
    LAB_COAT(intArrayOf(0x1F97C)),
    // 🦺 🦺 🦺
    SAFETY_VEST(intArrayOf(0x1F9BA)),
    // 👔 👔 👔
    NECKTIE(intArrayOf(0x1F454)),
    // 👕 👕 👕
    T_SHIRT(intArrayOf(0x1F455)),
    // 👖 👖 👖
    JEANS(intArrayOf(0x1F456)),
    // 🧣 🧣 🧣
    SCARF(intArrayOf(0x1F9E3)),
    // 🧤 🧤 🧤
    GLOVES(intArrayOf(0x1F9E4)),
    // 🧥 🧥 🧥
    COAT(intArrayOf(0x1F9E5)),
    // 🧦 🧦 🧦
    SOCKS(intArrayOf(0x1F9E6)),
    // 👗 👗 👗
    DRESS(intArrayOf(0x1F457)),
    // 👘 👘 👘
    KIMONO(intArrayOf(0x1F458)),
    // 🥻 🥻 🥻
    SARI(intArrayOf(0x1F97B)),
    // 🩱 🩱 🩱
    ONE_PIECE_SWIMSUIT(intArrayOf(0x1FA71)),
    // 🩲 🩲 🩲
    BRIEFS(intArrayOf(0x1FA72)),
    // 🩳 🩳 🩳
    SHORTS(intArrayOf(0x1FA73)),
    // 👙 👙 👙
    BIKINI(intArrayOf(0x1F459)),
    // 👚 👚 👚
    WOMANS_CLOTHES(intArrayOf(0x1F45A)),
    // 🪭 🪭 🪭
    FOLDING_HAND_FAN(intArrayOf(0x1FAAD)),
    // 👛 👛 👛
    PURSE(intArrayOf(0x1F45B)),
    // 👜 👜 👜
    HANDBAG(intArrayOf(0x1F45C)),
    // 👝 👝 👝
    CLUTCH_BAG(intArrayOf(0x1F45D)),
    // 🛍️ 🛍️ 🛍️
    SHOPPING_BAGS(intArrayOf(0x1F6CD,0xFE0F)),
    // 🎒 🎒 🎒
    BACKPACK(intArrayOf(0x1F392)),
    // 🩴 🩴 🩴
    THONG_SANDAL(intArrayOf(0x1FA74)),
    // 👞 👞 👞
    MANS_SHOE(intArrayOf(0x1F45E)),
    // 👟 👟 👟
    RUNNING_SHOE(intArrayOf(0x1F45F)),
    // 🥾 🥾 🥾
    HIKING_BOOT(intArrayOf(0x1F97E)),
    // 🥿 🥿 🥿
    FLAT_SHOE(intArrayOf(0x1F97F)),
    // 👠 👠 👠
    HIGH_HEELED_SHOE(intArrayOf(0x1F460)),
    // 👡 👡 👡
    WOMANS_SANDAL(intArrayOf(0x1F461)),
    // 🩰 🩰 🩰
    BALLET_SHOES(intArrayOf(0x1FA70)),
    // 👢 👢 👢
    WOMANS_BOOT(intArrayOf(0x1F462)),
    // 🪮 🪮 🪮
    HAIR_PICK(intArrayOf(0x1FAAE)),
    // 👑 👑 👑
    CROWN(intArrayOf(0x1F451)),
    // 👒 👒 👒
    WOMANS_HAT(intArrayOf(0x1F452)),
    // 🎩 🎩 🎩
    TOP_HAT(intArrayOf(0x1F3A9)),
    // 🎓 🎓 🎓
    GRADUATION_CAP(intArrayOf(0x1F393)),
    // 🧢 🧢 🧢
    BILLED_CAP(intArrayOf(0x1F9E2)),
    // 🪖 🪖 🪖
    MILITARY_HELMET(intArrayOf(0x1FA96)),
    // ⛑️ ⛑️ ⛑️
    RESCUE_WORKERS_HELMET(intArrayOf(0x26D1,0xFE0F)),
    // 📿 📿 📿
    PRAYER_BEADS(intArrayOf(0x1F4FF)),
    // 💄 💄 💄
    LIPSTICK(intArrayOf(0x1F484)),
    // 💍 💍 💍
    RING(intArrayOf(0x1F48D)),
    // 💎 💎 💎
    GEM_STONE(intArrayOf(0x1F48E)),
    // 🔇 🔇 🔇
    MUTED_SPEAKER(intArrayOf(0x1F507)),
    // 🔈 🔈 🔈
    SPEAKER_LOW_VOLUME(intArrayOf(0x1F508)),
    // 🔉 🔉 🔉
    SPEAKER_MEDIUM_VOLUME(intArrayOf(0x1F509)),
    // 🔊 🔊 🔊
    SPEAKER_HIGH_VOLUME(intArrayOf(0x1F50A)),
    // 📢 📢 📢
    LOUDSPEAKER(intArrayOf(0x1F4E2)),
    // 📣 📣 📣
    MEGAPHONE(intArrayOf(0x1F4E3)),
    // 📯 📯 📯
    POSTAL_HORN(intArrayOf(0x1F4EF)),
    // 🔔 🔔 🔔
    BELL(intArrayOf(0x1F514)),
    // 🔕 🔕 🔕
    BELL_WITH_SLASH(intArrayOf(0x1F515)),
    // 🎼 🎼 🎼
    MUSICAL_SCORE(intArrayOf(0x1F3BC)),
    // 🎵 🎵 🎵
    MUSICAL_NOTE(intArrayOf(0x1F3B5)),
    // 🎶 🎶 🎶
    MUSICAL_NOTES(intArrayOf(0x1F3B6)),
    // 🎙️ 🎙️ 🎙️
    STUDIO_MICROPHONE(intArrayOf(0x1F399,0xFE0F)),
    // 🎚️ 🎚️ 🎚️
    LEVEL_SLIDER(intArrayOf(0x1F39A,0xFE0F)),
    // 🎛️ 🎛️ 🎛️
    CONTROL_KNOBS(intArrayOf(0x1F39B,0xFE0F)),
    // 🎤 🎤 🎤
    MICROPHONE(intArrayOf(0x1F3A4)),
    // 🎧 🎧 🎧
    HEADPHONE(intArrayOf(0x1F3A7)),
    // 📻 📻 📻
    RADIO(intArrayOf(0x1F4FB)),
    // 🎷 🎷 🎷
    SAXOPHONE(intArrayOf(0x1F3B7)),
    // 🪗 🪗 🪗
    ACCORDION(intArrayOf(0x1FA97)),
    // 🎸 🎸 🎸
    GUITAR(intArrayOf(0x1F3B8)),
    // 🎹 🎹 🎹
    MUSICAL_KEYBOARD(intArrayOf(0x1F3B9)),
    // 🎺 🎺 🎺
    TRUMPET(intArrayOf(0x1F3BA)),
    // 🎻 🎻 🎻
    VIOLIN(intArrayOf(0x1F3BB)),
    // 🪕 🪕 🪕
    BANJO(intArrayOf(0x1FA95)),
    // 🥁 🥁 🥁
    DRUM(intArrayOf(0x1F941)),
    // 🪘 🪘 🪘
    LONG_DRUM(intArrayOf(0x1FA98)),
    // 🪇 🪇 🪇
    MARACAS(intArrayOf(0x1FA87)),
    // 🪈 🪈 🪈
    FLUTE(intArrayOf(0x1FA88)),
    // 📱 📱 📱
    MOBILE_PHONE(intArrayOf(0x1F4F1)),
    // 📲 📲 📲
    MOBILE_PHONE_WITH_ARROW(intArrayOf(0x1F4F2)),
    // ☎️ ☎️ ☎️
    TELEPHONE(intArrayOf(0x260E,0xFE0F)),
    // 📞 📞 📞
    TELEPHONE_RECEIVER(intArrayOf(0x1F4DE)),
    // 📟 📟 📟
    PAGER(intArrayOf(0x1F4DF)),
    // 📠 📠 📠
    FAX_MACHINE(intArrayOf(0x1F4E0)),
    // 🔋 🔋 🔋
    BATTERY(intArrayOf(0x1F50B)),
    // 🪫 🪫 🪫
    LOW_BATTERY(intArrayOf(0x1FAAB)),
    // 🔌 🔌 🔌
    ELECTRIC_PLUG(intArrayOf(0x1F50C)),
    // 💻 💻 💻
    LAPTOP(intArrayOf(0x1F4BB)),
    // 🖥️ 🖥️ 🖥️
    DESKTOP_COMPUTER(intArrayOf(0x1F5A5,0xFE0F)),
    // 🖨️ 🖨️ 🖨️
    PRINTER(intArrayOf(0x1F5A8,0xFE0F)),
    // ⌨️ ⌨️ ⌨️
    KEYBOARD(intArrayOf(0x2328,0xFE0F)),
    // 🖱️ 🖱️ 🖱️
    COMPUTER_MOUSE(intArrayOf(0x1F5B1,0xFE0F)),
    // 🖲️ 🖲️ 🖲️
    TRACKBALL(intArrayOf(0x1F5B2,0xFE0F)),
    // 💽 💽 💽
    COMPUTER_DISK(intArrayOf(0x1F4BD)),
    // 💾 💾 💾
    FLOPPY_DISK(intArrayOf(0x1F4BE)),
    // 💿 💿 💿
    OPTICAL_DISK(intArrayOf(0x1F4BF)),
    // 📀 📀 📀
    DVD(intArrayOf(0x1F4C0)),
    // 🧮 🧮 🧮
    ABACUS(intArrayOf(0x1F9EE)),
    // 🎥 🎥 🎥
    MOVIE_CAMERA(intArrayOf(0x1F3A5)),
    // 🎞️ 🎞️ 🎞️
    FILM_FRAMES(intArrayOf(0x1F39E,0xFE0F)),
    // 📽️ 📽️ 📽️
    FILM_PROJECTOR(intArrayOf(0x1F4FD,0xFE0F)),
    // 🎬 🎬 🎬
    CLAPPER_BOARD(intArrayOf(0x1F3AC)),
    // 📺 📺 📺
    TELEVISION(intArrayOf(0x1F4FA)),
    // 📷 📷 📷
    CAMERA(intArrayOf(0x1F4F7)),
    // 📸 📸 📸
    CAMERA_WITH_FLASH(intArrayOf(0x1F4F8)),
    // 📹 📹 📹
    VIDEO_CAMERA(intArrayOf(0x1F4F9)),
    // 📼 📼 📼
    VIDEOCASSETTE(intArrayOf(0x1F4FC)),
    // 🔍 🔍 🔍
    MAGNIFYING_GLASS_TILTED_LEFT(intArrayOf(0x1F50D)),
    // 🔎 🔎 🔎
    MAGNIFYING_GLASS_TILTED_RIGHT(intArrayOf(0x1F50E)),
    // 🕯️ 🕯️ 🕯️
    CANDLE(intArrayOf(0x1F56F,0xFE0F)),
    // 💡 💡 💡
    LIGHT_BULB(intArrayOf(0x1F4A1)),
    // 🔦 🔦 🔦
    FLASHLIGHT(intArrayOf(0x1F526)),
    // 🏮 🏮 🏮
    RED_PAPER_LANTERN(intArrayOf(0x1F3EE)),
    // 🪔 🪔 🪔
    DIYA_LAMP(intArrayOf(0x1FA94)),
    // 📔 📔 📔
    NOTEBOOK_WITH_DECORATIVE_COVER(intArrayOf(0x1F4D4)),
    // 📕 📕 📕
    CLOSED_BOOK(intArrayOf(0x1F4D5)),
    // 📖 📖 📖
    OPEN_BOOK(intArrayOf(0x1F4D6)),
    // 📗 📗 📗
    GREEN_BOOK(intArrayOf(0x1F4D7)),
    // 📘 📘 📘
    BLUE_BOOK(intArrayOf(0x1F4D8)),
    // 📙 📙 📙
    ORANGE_BOOK(intArrayOf(0x1F4D9)),
    // 📚 📚 📚
    BOOKS(intArrayOf(0x1F4DA)),
    // 📓 📓 📓
    NOTEBOOK(intArrayOf(0x1F4D3)),
    // 📒 📒 📒
    LEDGER(intArrayOf(0x1F4D2)),
    // 📃 📃 📃
    PAGE_WITH_CURL(intArrayOf(0x1F4C3)),
    // 📜 📜 📜
    SCROLL(intArrayOf(0x1F4DC)),
    // 📄 📄 📄
    PAGE_FACING_UP(intArrayOf(0x1F4C4)),
    // 📰 📰 📰
    NEWSPAPER(intArrayOf(0x1F4F0)),
    // 🗞️ 🗞️ 🗞️
    ROLLED_UP_NEWSPAPER(intArrayOf(0x1F5DE,0xFE0F)),
    // 📑 📑 📑
    BOOKMARK_TABS(intArrayOf(0x1F4D1)),
    // 🔖 🔖 🔖
    BOOKMARK(intArrayOf(0x1F516)),
    // 🏷️ 🏷️ 🏷️
    LABEL(intArrayOf(0x1F3F7,0xFE0F)),
    // 💰 💰 💰
    MONEY_BAG(intArrayOf(0x1F4B0)),
    // 🪙 🪙 🪙
    COIN(intArrayOf(0x1FA99)),
    // 💴 💴 💴
    YEN_BANKNOTE(intArrayOf(0x1F4B4)),
    // 💵 💵 💵
    DOLLAR_BANKNOTE(intArrayOf(0x1F4B5)),
    // 💶 💶 💶
    EURO_BANKNOTE(intArrayOf(0x1F4B6)),
    // 💷 💷 💷
    POUND_BANKNOTE(intArrayOf(0x1F4B7)),
    // 💸 💸 💸
    MONEY_WITH_WINGS(intArrayOf(0x1F4B8)),
    // 💳 💳 💳
    CREDIT_CARD(intArrayOf(0x1F4B3)),
    // 🧾 🧾 🧾
    RECEIPT(intArrayOf(0x1F9FE)),
    // 💹 💹 💹
    CHART_INCREASING_WITH_YEN(intArrayOf(0x1F4B9)),
    // ✉️ ✉️ ✉️
    ENVELOPE(intArrayOf(0x2709,0xFE0F)),
    // 📧 📧 📧
    E_MAIL(intArrayOf(0x1F4E7)),
    // 📨 📨 📨
    INCOMING_ENVELOPE(intArrayOf(0x1F4E8)),
    // 📩 📩 📩
    ENVELOPE_WITH_ARROW(intArrayOf(0x1F4E9)),
    // 📤 📤 📤
    OUTBOX_TRAY(intArrayOf(0x1F4E4)),
    // 📥 📥 📥
    INBOX_TRAY(intArrayOf(0x1F4E5)),
    // 📦 📦 📦
    PACKAGES(intArrayOf(0x1F4E6)),
    // 📫 📫 📫
    CLOSED_MAILBOX_WITH_RAISED_FLAG(intArrayOf(0x1F4EB)),
    // 📪 📪 📪
    CLOSED_MAILBOX_WITH_LOWERED_FLAG(intArrayOf(0x1F4EA)),
    // 📬 📬 📬
    OPEN_MAILBOX_WITH_RAISED_FLAG(intArrayOf(0x1F4EC)),
    // 📭 📭 📭
    OPEN_MAILBOX_WITH_LOWERED_FLAG(intArrayOf(0x1F4ED)),
    // 📮 📮 📮
    POSTBOX(intArrayOf(0x1F4EE)),
    // 🗳️ 🗳️ 🗳️
    BALLOT_BOX_WITH_BALLOT(intArrayOf(0x1F5F3,0xFE0F)),
    // ✏️ ✏️ ✏️
    PENCIL(intArrayOf(0x270F,0xFE0F)),
    // ✒️ ✒️ ✒️
    BLACK_NIB(intArrayOf(0x2712,0xFE0F)),
    // 🖋️ 🖋️ 🖋️
    FOUNTAIN_PEN(intArrayOf(0x1F58B,0xFE0F)),
    // 🖊️ 🖊️ 🖊️
    PEN(intArrayOf(0x1F58A,0xFE0F)),
    // 🖌️ 🖌️ 🖌️
    PAINTBRUSH(intArrayOf(0x1F58C,0xFE0F)),
    // 🖍️ 🖍️ 🖍️
    CRAYON(intArrayOf(0x1F58D,0xFE0F)),
    // 📝 📝 📝
    MEMO(intArrayOf(0x1F4DD)),
    // 💼 💼 💼
    BRIEFCASE(intArrayOf(0x1F4BC)),
    // 📁 📁 📁
    FILE_FOLDER(intArrayOf(0x1F4C1)),
    // 📂 📂 📂
    OPEN_FILE_FOLDER(intArrayOf(0x1F4C2)),
    // 🗂️ 🗂️ 🗂️
    CARD_INDEX_DIVIDERS(intArrayOf(0x1F5C2,0xFE0F)),
    // 📅 📅 📅
    CALENDAR(intArrayOf(0x1F4C5)),
    // 📆 📆 📆
    TEAR_OFF_CALENDAR(intArrayOf(0x1F4C6)),
    // 🗒️ 🗒️ 🗒️
    SPIRAL_NOTEPAD(intArrayOf(0x1F5D2,0xFE0F)),
    // 🗓️ 🗓️ 🗓️
    SPIRAL_CALENDAR(intArrayOf(0x1F5D3,0xFE0F)),
    // 📇 📇 📇
    CARD_INDEX(intArrayOf(0x1F4C7)),
    // 📈 📈 📈
    CHART_INCREASING(intArrayOf(0x1F4C8)),
    // 📉 📉 📉
    CHART_DECREASING(intArrayOf(0x1F4C9)),
    // 📊 📊 📊
    BAR_CHART(intArrayOf(0x1F4CA)),
    // 📋 📋 📋
    CLIPBOARD(intArrayOf(0x1F4CB)),
    // 📌 📌 📌
    PUSHPIN(intArrayOf(0x1F4CC)),
    // 📍 📍 📍
    ROUND_PUSHPIN(intArrayOf(0x1F4CD)),
    // 📎 📎 📎
    PAPERCLIP(intArrayOf(0x1F4CE)),
    // 🖇️ 🖇️ 🖇️
    LINKED_PAPERCLIPS(intArrayOf(0x1F587,0xFE0F)),
    // 📏 📏 📏
    STRAIGHT_RULER(intArrayOf(0x1F4CF)),
    // 📐 📐 📐
    TRIANGULAR_RULER(intArrayOf(0x1F4D0)),
    // ✂️ ✂️ ✂️
    SCISSORS(intArrayOf(0x2702,0xFE0F)),
    // 🗃️ 🗃️ 🗃️
    CARD_FILE_BOX(intArrayOf(0x1F5C3,0xFE0F)),
    // 🗄️ 🗄️ 🗄️
    FILE_CABINET(intArrayOf(0x1F5C4,0xFE0F)),
    // 🗑️ 🗑️ 🗑️
    WASTEBASKET(intArrayOf(0x1F5D1,0xFE0F)),
    // 🔒 🔒 🔒
    LOCKED(intArrayOf(0x1F512)),
    // 🔓 🔓 🔓
    UNLOCKED(intArrayOf(0x1F513)),
    // 🔏 🔏 🔏
    LOCKED_WITH_PEN(intArrayOf(0x1F50F)),
    // 🔐 🔐 🔐
    LOCKED_WITH_KEY(intArrayOf(0x1F510)),
    // 🔑 🔑 🔑
    KEY(intArrayOf(0x1F511)),
    // 🗝️ 🗝️ 🗝️
    OLD_KEY(intArrayOf(0x1F5DD,0xFE0F)),
    // 🔨 🔨 🔨
    HAMMER(intArrayOf(0x1F528)),
    // 🪓 🪓 🪓
    AXE(intArrayOf(0x1FA93)),
    // ⛏️ ⛏️ ⛏️
    PICK(intArrayOf(0x26CF,0xFE0F)),
    // ⚒️ ⚒️ ⚒️
    HAMMER_AND_PICK(intArrayOf(0x2692,0xFE0F)),
    // 🛠️ 🛠️ 🛠️
    HAMMER_AND_WRENCH(intArrayOf(0x1F6E0,0xFE0F)),
    // 🗡️ 🗡️ 🗡️
    DAGGER(intArrayOf(0x1F5E1,0xFE0F)),
    // ⚔️ ⚔️ ⚔️
    CROSSED_SWORDS(intArrayOf(0x2694,0xFE0F)),
    // 💣 💣 💣
    BOMB(intArrayOf(0x1F4A3)),
    // 🪃 🪃 🪃
    BOOMERANG(intArrayOf(0x1FA83)),
    // 🏹 🏹 🏹
    BOW_AND_ARROW(intArrayOf(0x1F3F9)),
    // 🛡️ 🛡️ 🛡️
    SHIELD(intArrayOf(0x1F6E1,0xFE0F)),
    // 🪚 🪚 🪚
    CARPENTRY_SAW(intArrayOf(0x1FA9A)),
    // 🔧 🔧 🔧
    WRENCH(intArrayOf(0x1F527)),
    // 🪛 🪛 🪛
    SCREWDRIVER(intArrayOf(0x1FA9B)),
    // 🔩 🔩 🔩
    NUT_AND_BOLT(intArrayOf(0x1F529)),
    // ⚙️ ⚙️ ⚙️
    GEAR(intArrayOf(0x2699,0xFE0F)),
    // 🗜️ 🗜️ 🗜️
    CLAMP(intArrayOf(0x1F5DC,0xFE0F)),
    // ⚖️ ⚖️ ⚖️
    BALANCE_SCALE(intArrayOf(0x2696,0xFE0F)),
    // 🦯 🦯 🦯
    WHITE_CANE(intArrayOf(0x1F9AF)),
    // 🔗 🔗 🔗
    LINK(intArrayOf(0x1F517)),
    // ⛓️ ⛓️ ⛓️
    CHAINS(intArrayOf(0x26D3,0xFE0F)),
    // 🪝 🪝 🪝
    HOOK(intArrayOf(0x1FA9D)),
    // 🧰 🧰 🧰
    TOOLBOX(intArrayOf(0x1F9F0)),
    // 🧲 🧲 🧲
    MAGNET(intArrayOf(0x1F9F2)),
    // 🪜 🪜 🪜
    LADDER(intArrayOf(0x1FA9C)),
    // ⚗️ ⚗️ ⚗️
    ALEMBIC(intArrayOf(0x2697,0xFE0F)),
    // 🧪 🧪 🧪
    TEST_TUBE(intArrayOf(0x1F9EA)),
    // 🧫 🧫 🧫
    PETRI_DISH(intArrayOf(0x1F9EB)),
    // 🧬 🧬 🧬
    DNA(intArrayOf(0x1F9EC)),
    // 🔬 🔬 🔬
    MICROSCOPE(intArrayOf(0x1F52C)),
    // 🔭 🔭 🔭
    TELESCOPE(intArrayOf(0x1F52D)),
    // 📡 📡 📡
    SATELLITE_ANTENNA(intArrayOf(0x1F4E1)),
    // 💉 💉 💉
    SYRINGE(intArrayOf(0x1F489)),
    // 🩸 🩸 🩸
    DROP_OF_BLOOD(intArrayOf(0x1FA78)),
    // 💊 💊 💊
    PILL(intArrayOf(0x1F48A)),
    // 🩹 🩹 🩹
    ADHESIVE_BANDAGE(intArrayOf(0x1FA79)),
    // 🩼 🩼 🩼
    CRUTCH(intArrayOf(0x1FA7C)),
    // 🩺 🩺 🩺
    STETHOSCOPE(intArrayOf(0x1FA7A)),
    // 🩻 🩻 🩻
    X_RAY(intArrayOf(0x1FA7B)),
    // 🚪 🚪 🚪
    DOOR(intArrayOf(0x1F6AA)),
    // 🛗 🛗 🛗
    ELEVATOR(intArrayOf(0x1F6D7)),
    // 🪞 🪞 🪞
    MIRROR(intArrayOf(0x1FA9E)),
    // 🪟 🪟 🪟
    WINDOW(intArrayOf(0x1FA9F)),
    // 🛏️ 🛏️ 🛏️
    BED(intArrayOf(0x1F6CF,0xFE0F)),
    // 🛋️ 🛋️ 🛋️
    COUCH_AND_LAMP(intArrayOf(0x1F6CB,0xFE0F)),
    // 🪑 🪑 🪑
    CHAIR(intArrayOf(0x1FA91)),
    // 🚽 🚽 🚽
    TOILET(intArrayOf(0x1F6BD)),
    // 🪠 🪠 🪠
    PLUNGER(intArrayOf(0x1FAA0)),
    // 🚿 🚿 🚿
    SHOWER(intArrayOf(0x1F6BF)),
    // 🛁 🛁 🛁
    BATHTUB(intArrayOf(0x1F6C1)),
    // 🪤 🪤 🪤
    MOUSE_TRAP(intArrayOf(0x1FAA4)),
    // 🪒 🪒 🪒
    RAZOR(intArrayOf(0x1FA92)),
    // 🧴 🧴 🧴
    LOTION_BOTTLE(intArrayOf(0x1F9F4)),
    // 🧷 🧷 🧷
    SAFETY_PIN(intArrayOf(0x1F9F7)),
    // 🧹 🧹 🧹
    BROOM(intArrayOf(0x1F9F9)),
    // 🧺 🧺 🧺
    BASKET(intArrayOf(0x1F9FA)),
    // 🧻 🧻 🧻
    ROLL_OF_PAPER(intArrayOf(0x1F9FB)),
    // 🪣 🪣 🪣
    BUCKET(intArrayOf(0x1FAA3)),
    // 🧼 🧼 🧼
    SOAP(intArrayOf(0x1F9FC)),
    // 🫧 🫧 🫧
    BUBBLES(intArrayOf(0x1FAE7)),
    // 🪥 🪥 🪥
    TOOTHBRUSH(intArrayOf(0x1FAA5)),
    // 🧽 🧽 🧽
    SPONGE(intArrayOf(0x1F9FD)),
    // 🧯 🧯 🧯
    FIRE_EXTINGUISHER(intArrayOf(0x1F9EF)),
    // 🛒 🛒 🛒
    SHOPPING_CART(intArrayOf(0x1F6D2)),
    // 🚬 🚬 🚬
    CIGARETTE(intArrayOf(0x1F6AC)),
    // ⚰️ ⚰️ ⚰️
    COFFIN(intArrayOf(0x26B0,0xFE0F)),
    // 🪦 🪦 🪦
    HEADSTONE(intArrayOf(0x1FAA6)),
    // ⚱️ ⚱️ ⚱️
    FUNERAL_URN(intArrayOf(0x26B1,0xFE0F)),
    // 🧿 🧿 🧿
    NAZAR_AMULET(intArrayOf(0x1F9FF)),
    // 🪬 🪬 🪬
    HAMSA(intArrayOf(0x1FAAC)),
    // 🗿 🗿 🗿
    MOAI(intArrayOf(0x1F5FF)),
    // 🪧 🪧 🪧
    PLACARD(intArrayOf(0x1FAA7)),
    // 🪪 🪪 🪪
    IDENTIFICATION_CARD(intArrayOf(0x1FAAA)),
    // 🏧 🏧 🏧
    ATM_SIGN(intArrayOf(0x1F3E7)),
    // 🚮 🚮 🚮
    LITTER_IN_BIN_SIGN(intArrayOf(0x1F6AE)),
    // 🚰 🚰 🚰
    POTABLE_WATER(intArrayOf(0x1F6B0)),
    // ♿ ♿ ♿
    WHEELCHAIR_SYMBOL(intArrayOf(0x267F)),
    // 🚹 🚹 🚹
    MENS_ROOM(intArrayOf(0x1F6B9)),
    // 🚺 🚺 🚺
    WOMENS_ROOM(intArrayOf(0x1F6BA)),
    // 🚻 🚻 🚻
    RESTROOM(intArrayOf(0x1F6BB)),
    // 🚼 🚼 🚼
    BABY_SYMBOL(intArrayOf(0x1F6BC)),
    // 🚾 🚾 🚾
    WATER_CLOSET(intArrayOf(0x1F6BE)),
    // 🛂 🛂 🛂
    PASSPORT_CONTROL(intArrayOf(0x1F6C2)),
    // 🛃 🛃 🛃
    CUSTOMS(intArrayOf(0x1F6C3)),
    // 🛄 🛄 🛄
    BAGGAGE_CLAIM(intArrayOf(0x1F6C4)),
    // 🛅 🛅 🛅
    LEFT_LUGGAGE(intArrayOf(0x1F6C5)),
    // ⚠️ ⚠️ ⚠️
    WARNING(intArrayOf(0x26A0,0xFE0F)),
    // 🚸 🚸 🚸
    CHILDREN_CROSSING(intArrayOf(0x1F6B8)),
    // ⛔ ⛔ ⛔
    NO_ENTRY(intArrayOf(0x26D4)),
    // 🚫 🚫 🚫
    PROHIBITED(intArrayOf(0x1F6AB)),
    // 🚳 🚳 🚳
    NO_BICYCLES(intArrayOf(0x1F6B3)),
    // 🚭 🚭 🚭
    NO_SMOKING(intArrayOf(0x1F6AD)),
    // 🚯 🚯 🚯
    NO_LITTERING(intArrayOf(0x1F6AF)),
    // 🚱 🚱 🚱
    NON_POTABLE_WATER(intArrayOf(0x1F6B1)),
    // 🚷 🚷 🚷
    NO_PEDESTRIANS(intArrayOf(0x1F6B7)),
    // 📵 📵 📵
    NO_MOBILE_PHONES(intArrayOf(0x1F4F5)),
    // 🔞 🔞 🔞
    NO_ONE_UNDER_EIGHTEEN(intArrayOf(0x1F51E)),
    // ☢️ ☢️ ☢️
    RADIOACTIVE(intArrayOf(0x2622,0xFE0F)),
    // ☣️ ☣️ ☣️
    BIOHAZARD(intArrayOf(0x2623,0xFE0F)),
    // ⬆️ ⬆️ ⬆️
    UP_ARROW(intArrayOf(0x2B06,0xFE0F)),
    // ↗️ ↗️ ↗️
    UP_RIGHT_ARROW(intArrayOf(0x2197,0xFE0F)),
    // ➡️ ➡️ ➡️
    RIGHT_ARROW(intArrayOf(0x27A1,0xFE0F)),
    // ↘️ ↘️ ↘️
    DOWN_RIGHT_ARROW(intArrayOf(0x2198,0xFE0F)),
    // ⬇️ ⬇️ ⬇️
    DOWN_ARROW(intArrayOf(0x2B07,0xFE0F)),
    // ↙️ ↙️ ↙️
    DOWN_LEFT_ARROW(intArrayOf(0x2199,0xFE0F)),
    // ⬅️ ⬅️ ⬅️
    LEFT_ARROW(intArrayOf(0x2B05,0xFE0F)),
    // ↖️ ↖️ ↖️
    UP_LEFT_ARROW(intArrayOf(0x2196,0xFE0F)),
    // ↕️ ↕️ ↕️
    UP_DOWN_ARROW(intArrayOf(0x2195,0xFE0F)),
    // ↔️ ↔️ ↔️
    LEFT_RIGHT_ARROW(intArrayOf(0x2194,0xFE0F)),
    // ↩️ ↩️ ↩️
    RIGHT_ARROW_CURVING_LEFT(intArrayOf(0x21A9,0xFE0F)),
    // ↪️ ↪️ ↪️
    LEFT_ARROW_CURVING_RIGHT(intArrayOf(0x21AA,0xFE0F)),
    // ⤴️ ⤴️ ⤴️
    RIGHT_ARROW_CURVING_UP(intArrayOf(0x2934,0xFE0F)),
    // ⤵️ ⤵️ ⤵️
    RIGHT_ARROW_CURVING_DOWN(intArrayOf(0x2935,0xFE0F)),
    // 🔃 🔃 🔃
    CLOCKWISE_VERTICAL_ARROWS(intArrayOf(0x1F503)),
    // 🔄 🔄 🔄
    COUNTERCLOCKWISE_ARROWS_BUTTON(intArrayOf(0x1F504)),
    // 🔙 🔙 🔙
    BACK_ARROW(intArrayOf(0x1F519)),
    // 🔚 🔚 🔚
    END_ARROW(intArrayOf(0x1F51A)),
    // 🔛 🔛 🔛
    ON_ARROW(intArrayOf(0x1F51B)),
    // 🔜 🔜 🔜
    SOON_ARROW(intArrayOf(0x1F51C)),
    // 🔝 🔝 🔝
    TOP_ARROW(intArrayOf(0x1F51D)),
    // 🛐 🛐 🛐
    PLACE_OF_WORSHIP(intArrayOf(0x1F6D0)),
    // ⚛️ ⚛️ ⚛️
    ATOM_SYMBOL(intArrayOf(0x269B,0xFE0F)),
    // 🕉️ 🕉️ 🕉️
    OM(intArrayOf(0x1F549,0xFE0F)),
    // ✡️ ✡️ ✡️
    STAR_OF_DAVID(intArrayOf(0x2721,0xFE0F)),
    // ☸️ ☸️ ☸️
    WHEEL_OF_DHARMA(intArrayOf(0x2638,0xFE0F)),
    // ☯️ ☯️ ☯️
    YIN_YANG(intArrayOf(0x262F,0xFE0F)),
    // ✝️ ✝️ ✝️
    LATIN_CROSS(intArrayOf(0x271D,0xFE0F)),
    // ☦️ ☦️ ☦️
    ORTHODOX_CROSS(intArrayOf(0x2626,0xFE0F)),
    // ☪️ ☪️ ☪️
    STAR_AND_CRESCENT(intArrayOf(0x262A,0xFE0F)),
    // ☮️ ☮️ ☮️
    PEACE_SYMBOL(intArrayOf(0x262E,0xFE0F)),
    // 🕎 🕎 🕎
    MENORAH(intArrayOf(0x1F54E)),
    // 🔯 🔯 🔯
    DOTTED_SIX_POINTED_STAR(intArrayOf(0x1F52F)),
    // 🪯 🪯 🪯
    KHANDA(intArrayOf(0x1FAAF)),
    // ♈ ♈ ♈
    ARIES(intArrayOf(0x2648)),
    // ♉ ♉ ♉
    TAURUS(intArrayOf(0x2649)),
    // ♊ ♊ ♊
    GEMINI(intArrayOf(0x264A)),
    // ♋ ♋ ♋
    CANCER(intArrayOf(0x264B)),
    // ♌ ♌ ♌
    LEO(intArrayOf(0x264C)),
    // ♍ ♍ ♍
    VIRGO(intArrayOf(0x264D)),
    // ♎ ♎ ♎
    LIBRA(intArrayOf(0x264E)),
    // ♏ ♏ ♏
    SCORPIO(intArrayOf(0x264F)),
    // ♐ ♐ ♐
    SAGITTARIUS(intArrayOf(0x2650)),
    // ♑ ♑ ♑
    CAPRICORN(intArrayOf(0x2651)),
    // ♒ ♒ ♒
    AQUARIUS(intArrayOf(0x2652)),
    // ♓ ♓ ♓
    PISCES(intArrayOf(0x2653)),
    // ⛎ ⛎ ⛎
    OPHIUCHUS(intArrayOf(0x26CE)),
    // 🔀 🔀 🔀
    SHUFFLE_TRACKS_BUTTON(intArrayOf(0x1F500)),
    // 🔁 🔁 🔁
    REPEAT_BUTTON(intArrayOf(0x1F501)),
    // 🔂 🔂 🔂
    REPEAT_SINGLE_BUTTON(intArrayOf(0x1F502)),
    // ▶️ ▶️ ▶️
    PLAY_BUTTON(intArrayOf(0x25B6,0xFE0F)),
    // ⏩ ⏩ ⏩
    FAST_FORWARD_BUTTON(intArrayOf(0x23E9)),
    // ⏭️ ⏭️ ⏭️
    NEXT_TRACK_BUTTON(intArrayOf(0x23ED,0xFE0F)),
    // ⏯️ ⏯️ ⏯️
    PLAY_OR_PAUSE_BUTTON(intArrayOf(0x23EF,0xFE0F)),
    // ◀️ ◀️ ◀️
    REVERSE_BUTTON(intArrayOf(0x25C0,0xFE0F)),
    // ⏪ ⏪ ⏪
    FAST_REVERSE_BUTTON(intArrayOf(0x23EA)),
    // ⏮️ ⏮️ ⏮️
    LAST_TRACK_BUTTON(intArrayOf(0x23EE,0xFE0F)),
    // 🔼 🔼 🔼
    UPWARDS_BUTTON(intArrayOf(0x1F53C)),
    // ⏫ ⏫ ⏫
    FAST_UP_BUTTON(intArrayOf(0x23EB)),
    // 🔽 🔽 🔽
    DOWNWARDS_BUTTON(intArrayOf(0x1F53D)),
    // ⏬ ⏬ ⏬
    FAST_DOWN_BUTTON(intArrayOf(0x23EC)),
    // ⏸️ ⏸️ ⏸️
    PAUSE_BUTTON(intArrayOf(0x23F8,0xFE0F)),
    // ⏹️ ⏹️ ⏹️
    STOP_BUTTON(intArrayOf(0x23F9,0xFE0F)),
    // ⏺️ ⏺️ ⏺️
    RECORD_BUTTON(intArrayOf(0x23FA,0xFE0F)),
    // ⏏️ ⏏️ ⏏️
    EJECT_BUTTON(intArrayOf(0x23CF,0xFE0F)),
    // 🎦 🎦 🎦
    CINEMA(intArrayOf(0x1F3A6)),
    // 🔅 🔅 🔅
    DIM_BUTTON(intArrayOf(0x1F505)),
    // 🔆 🔆 🔆
    BRIGHT_BUTTON(intArrayOf(0x1F506)),
    // 📶 📶 📶
    ANTENNA_BARS(intArrayOf(0x1F4F6)),
    // 🛜 🛜 🛜
    WIRELESS(intArrayOf(0x1F6DC)),
    // 📳 📳 📳
    VIBRATION_MODE(intArrayOf(0x1F4F3)),
    // 📴 📴 📴
    MOBILE_PHONE_OFF(intArrayOf(0x1F4F4)),
    // ♀️ ♀️ ♀️
    FEMALE_SIGN(intArrayOf(0x2640,0xFE0F)),
    // ♂️ ♂️ ♂️
    MALE_SIGN(intArrayOf(0x2642,0xFE0F)),
    // ⚧️ ⚧️ ⚧️
    TRANSGENDER_SYMBOL(intArrayOf(0x26A7,0xFE0F)),
    // ✖️ ✖️ ✖️
    MULTIPLY(intArrayOf(0x2716,0xFE0F)),
    // ➕ ➕ ➕
    PLUS(intArrayOf(0x2795)),
    // ➖ ➖ ➖
    MINUS(intArrayOf(0x2796)),
    // ➗ ➗ ➗
    DIVIDE(intArrayOf(0x2797)),
    // 🟰 🟰 🟰
    HEAVY_EQUALS_SIGN(intArrayOf(0x1F7F0)),
    // ♾️ ♾️ ♾️
    INFINITY(intArrayOf(0x267E,0xFE0F)),
    // ‼️ ‼️ ‼️
    DOUBLE_EXCLAMATION_MARK(intArrayOf(0x203C,0xFE0F)),
    // ⁉️ ⁉️ ⁉️
    EXCLAMATION_QUESTION_MARK(intArrayOf(0x2049,0xFE0F)),
    // ❓ ❓ ❓
    RED_QUESTION_MARK(intArrayOf(0x2753)),
    // ❔ ❔ ❔
    WHITE_QUESTION_MARK(intArrayOf(0x2754)),
    // ❕ ❕ ❕
    WHITE_EXCLAMATION_MARK(intArrayOf(0x2755)),
    // ❗ ❗ ❗
    RED_EXCLAMATION_MARK(intArrayOf(0x2757)),
    // 〰️ 〰️ 〰️
    WAVY_DASH(intArrayOf(0x3030,0xFE0F)),
    // 💱 💱 💱
    CURRENCY_EXCHANGE(intArrayOf(0x1F4B1)),
    // 💲 💲 💲
    HEAVY_DOLLAR_SIGN(intArrayOf(0x1F4B2)),
    // ⚕️ ⚕️ ⚕️
    MEDICAL_SYMBOL(intArrayOf(0x2695,0xFE0F)),
    // ♻️ ♻️ ♻️
    RECYCLING_SYMBOL(intArrayOf(0x267B,0xFE0F)),
    // ⚜️ ⚜️ ⚜️
    FLEUR_DE_LIS(intArrayOf(0x269C,0xFE0F)),
    // 🔱 🔱 🔱
    TRIDENT_EMBLEM(intArrayOf(0x1F531)),
    // 📛 📛 📛
    NAME_BADGE(intArrayOf(0x1F4DB)),
    // 🔰 🔰 🔰
    JAPANESE_SYMBOL_FOR_BEGINNER(intArrayOf(0x1F530)),
    // ⭕ ⭕ ⭕
    HOLLOW_RED_CIRCLE(intArrayOf(0x2B55)),
    // ✅ ✅ ✅
    CHECK_MARK_BUTTON(intArrayOf(0x2705)),
    // ☑️ ☑️ ☑️
    CHECK_BOX_WITH_CHECK(intArrayOf(0x2611,0xFE0F)),
    // ✔️ ✔️ ✔️
    CHECK_MARK(intArrayOf(0x2714,0xFE0F)),
    // ❌ ❌ ❌
    CROSS_MARK(intArrayOf(0x274C)),
    // ❎ ❎ ❎
    CROSS_MARK_BUTTON(intArrayOf(0x274E)),
    // ➰ ➰ ➰
    CURLY_LOOP(intArrayOf(0x27B0)),
    // ➿ ➿ ➿
    DOUBLE_CURLY_LOOP(intArrayOf(0x27BF)),
    // 〽️ 〽️ 〽️
    PART_ALTERNATION_MARK(intArrayOf(0x303D,0xFE0F)),
    // ✳️ ✳️ ✳️
    EIGHT_SPOKED_ASTERISK(intArrayOf(0x2733,0xFE0F)),
    // ✴️ ✴️ ✴️
    EIGHT_POINTED_STAR(intArrayOf(0x2734,0xFE0F)),
    // ❇️ ❇️ ❇️
    SPARKLE(intArrayOf(0x2747,0xFE0F)),
    // ©️ ©️ ©️
    COPYRIGHT(intArrayOf(0x00A9,0xFE0F)),
    // ®️ ®️ ®️
    REGISTERED(intArrayOf(0x00AE,0xFE0F)),
    // ™️ ™️ ™️
    TRADE_MARK(intArrayOf(0x2122,0xFE0F)),
    // #️⃣ #️⃣ #️⃣
    KEYCAP_HASH(intArrayOf(0x0023,0xFE0F,0x20E3)),
    // *️⃣ *️⃣ *️⃣
    KEYCAP_STAR(intArrayOf(0x002A,0xFE0F,0x20E3)),
    // 0️⃣ 0️⃣ 0️⃣
    KEYCAP_0(intArrayOf(0x0030,0xFE0F,0x20E3)),
    // 1️⃣ 1️⃣ 1️⃣
    KEYCAP_1(intArrayOf(0x0031,0xFE0F,0x20E3)),
    // 2️⃣ 2️⃣ 2️⃣
    KEYCAP_2(intArrayOf(0x0032,0xFE0F,0x20E3)),
    // 3️⃣ 3️⃣ 3️⃣
    KEYCAP_3(intArrayOf(0x0033,0xFE0F,0x20E3)),
    // 4️⃣ 4️⃣ 4️⃣
    KEYCAP_4(intArrayOf(0x0034,0xFE0F,0x20E3)),
    // 5️⃣ 5️⃣ 5️⃣
    KEYCAP_5(intArrayOf(0x0035,0xFE0F,0x20E3)),
    // 6️⃣ 6️⃣ 6️⃣
    KEYCAP_6(intArrayOf(0x0036,0xFE0F,0x20E3)),
    // 7️⃣ 7️⃣ 7️⃣
    KEYCAP_7(intArrayOf(0x0037,0xFE0F,0x20E3)),
    // 8️⃣ 8️⃣ 8️⃣
    KEYCAP_8(intArrayOf(0x0038,0xFE0F,0x20E3)),
    // 9️⃣ 9️⃣ 9️⃣
    KEYCAP_9(intArrayOf(0x0039,0xFE0F,0x20E3)),
    // 🔟 🔟 🔟
    KEYCAP_10(intArrayOf(0x1F51F)),
    // 🔠 🔠 🔠
    INPUT_LATIN_UPPERCASE(intArrayOf(0x1F520)),
    // 🔡 🔡 🔡
    INPUT_LATIN_LOWERCASE(intArrayOf(0x1F521)),
    // 🔢 🔢 🔢
    INPUT_NUMBERS(intArrayOf(0x1F522)),
    // 🔣 🔣 🔣
    INPUT_SYMBOLS(intArrayOf(0x1F523)),
    // 🔤 🔤 🔤
    INPUT_LATIN_LETTERS(intArrayOf(0x1F524)),
    // 🅰️ 🅰️ 🅰️
    A_BUTTON_BLOOD_TYPE(intArrayOf(0x1F170,0xFE0F)),
    // 🆎 🆎 🆎
    AB_BUTTON_BLOOD_TYPE(intArrayOf(0x1F18E)),
    // 🅱️ 🅱️ 🅱️
    B_BUTTON_BLOOD_TYPE(intArrayOf(0x1F171,0xFE0F)),
    // 🆑 🆑 🆑
    CL_BUTTON(intArrayOf(0x1F191)),
    // 🆒 🆒 🆒
    COOL_BUTTON(intArrayOf(0x1F192)),
    // 🆓 🆓 🆓
    FREE_BUTTON(intArrayOf(0x1F193)),
    // ℹ️ ℹ️ ℹ️
    INFORMATION(intArrayOf(0x2139,0xFE0F)),
    // 🆔 🆔 🆔
    ID_BUTTON(intArrayOf(0x1F194)),
    // Ⓜ️ Ⓜ️ Ⓜ️
    CIRCLED_M(intArrayOf(0x24C2,0xFE0F)),
    // 🆕 🆕 🆕
    NEW_BUTTON(intArrayOf(0x1F195)),
    // 🆖 🆖 🆖
    NG_BUTTON(intArrayOf(0x1F196)),
    // 🅾️ 🅾️ 🅾️
    O_BUTTON_BLOOD_TYPE(intArrayOf(0x1F17E,0xFE0F)),
    // 🆗 🆗 🆗
    OK_BUTTON(intArrayOf(0x1F197)),
    // 🅿️ 🅿️ 🅿️
    P_BUTTON(intArrayOf(0x1F17F,0xFE0F)),
    // 🆘 🆘 🆘
    SOS_BUTTON(intArrayOf(0x1F198)),
    // 🆙 🆙 🆙
    UP_BUTTON(intArrayOf(0x1F199)),
    // 🆚 🆚 🆚
    VS_BUTTON(intArrayOf(0x1F19A)),
    // 🈁 🈁 🈁
    JAPANESE_HERE_BUTTON(intArrayOf(0x1F201)),
    // 🈂️ 🈂️ 🈂️
    JAPANESE_SERVICE_CHARGE_BUTTON(intArrayOf(0x1F202,0xFE0F)),
    // 🈷️ 🈷️ 🈷️
    JAPANESE_MONTHLY_AMOUNT_BUTTON(intArrayOf(0x1F237,0xFE0F)),
    // 🈶 🈶 🈶
    JAPANESE_NOT_FREE_OF_CHARGE_BUTTON(intArrayOf(0x1F236)),
    // 🈯 🈯 🈯
    JAPANESE_RESERVED_BUTTON(intArrayOf(0x1F22F)),
    // 🉐 🉐 🉐
    JAPANESE_BARGAIN_BUTTON(intArrayOf(0x1F250)),
    // 🈹 🈹 🈹
    JAPANESE_DISCOUNT_BUTTON(intArrayOf(0x1F239)),
    // 🈚 🈚 🈚
    JAPANESE_FREE_OF_CHARGE_BUTTON(intArrayOf(0x1F21A)),
    // 🈲 🈲 🈲
    JAPANESE_PROHIBITED_BUTTON(intArrayOf(0x1F232)),
    // 🉑 🉑 🉑
    JAPANESE_ACCEPTABLE_BUTTON(intArrayOf(0x1F251)),
    // 🈸 🈸 🈸
    JAPANESE_APPLICATION_BUTTON(intArrayOf(0x1F238)),
    // 🈴 🈴 🈴
    JAPANESE_PASSING_GRADE_BUTTON(intArrayOf(0x1F234)),
    // 🈳 🈳 🈳
    JAPANESE_VACANCY_BUTTON(intArrayOf(0x1F233)),
    // ㊗️ ㊗️ ㊗️
    JAPANESE_CONGRATULATIONS_BUTTON(intArrayOf(0x3297,0xFE0F)),
    // ㊙️ ㊙️ ㊙️
    JAPANESE_SECRET_BUTTON(intArrayOf(0x3299,0xFE0F)),
    // 🈺 🈺 🈺
    JAPANESE_OPEN_FOR_BUSINESS_BUTTON(intArrayOf(0x1F23A)),
    // 🈵 🈵 🈵
    JAPANESE_NO_VACANCY_BUTTON(intArrayOf(0x1F235)),
    // 🔴 🔴 🔴
    RED_CIRCLE(intArrayOf(0x1F534)),
    // 🟠 🟠 🟠
    ORANGE_CIRCLE(intArrayOf(0x1F7E0)),
    // 🟡 🟡 🟡
    YELLOW_CIRCLE(intArrayOf(0x1F7E1)),
    // 🟢 🟢 🟢
    GREEN_CIRCLE(intArrayOf(0x1F7E2)),
    // 🔵 🔵 🔵
    BLUE_CIRCLE(intArrayOf(0x1F535)),
    // 🟣 🟣 🟣
    PURPLE_CIRCLE(intArrayOf(0x1F7E3)),
    // 🟤 🟤 🟤
    BROWN_CIRCLE(intArrayOf(0x1F7E4)),
    // ⚫ ⚫ ⚫
    BLACK_CIRCLE(intArrayOf(0x26AB)),
    // ⚪ ⚪ ⚪
    WHITE_CIRCLE(intArrayOf(0x26AA)),
    // 🟥 🟥 🟥
    RED_SQUARE(intArrayOf(0x1F7E5)),
    // 🟧 🟧 🟧
    ORANGE_SQUARE(intArrayOf(0x1F7E7)),
    // 🟨 🟨 🟨
    YELLOW_SQUARE(intArrayOf(0x1F7E8)),
    // 🟩 🟩 🟩
    GREEN_SQUARE(intArrayOf(0x1F7E9)),
    // 🟦 🟦 🟦
    BLUE_SQUARE(intArrayOf(0x1F7E6)),
    // 🟪 🟪 🟪
    PURPLE_SQUARE(intArrayOf(0x1F7EA)),
    // 🟫 🟫 🟫
    BROWN_SQUARE(intArrayOf(0x1F7EB)),
    // ⬛ ⬛ ⬛
    BLACK_LARGE_SQUARE(intArrayOf(0x2B1B)),
    // ⬜ ⬜ ⬜
    WHITE_LARGE_SQUARE(intArrayOf(0x2B1C)),
    // ◼️ ◼️ ◼️
    BLACK_MEDIUM_SQUARE(intArrayOf(0x25FC,0xFE0F)),
    // ◻️ ◻️ ◻️
    WHITE_MEDIUM_SQUARE(intArrayOf(0x25FB,0xFE0F)),
    // ◾ ◾ ◾
    BLACK_MEDIUM_SMALL_SQUARE(intArrayOf(0x25FE)),
    // ◽ ◽ ◽
    WHITE_MEDIUM_SMALL_SQUARE(intArrayOf(0x25FD)),
    // ▪️ ▪️ ▪️
    BLACK_SMALL_SQUARE(intArrayOf(0x25AA,0xFE0F)),
    // ▫️ ▫️ ▫️
    WHITE_SMALL_SQUARE(intArrayOf(0x25AB,0xFE0F)),
    // 🔶 🔶 🔶
    LARGE_ORANGE_DIAMOND(intArrayOf(0x1F536)),
    // 🔷 🔷 🔷
    LARGE_BLUE_DIAMOND(intArrayOf(0x1F537)),
    // 🔸 🔸 🔸
    SMALL_ORANGE_DIAMOND(intArrayOf(0x1F538)),
    // 🔹 🔹 🔹
    SMALL_BLUE_DIAMOND(intArrayOf(0x1F539)),
    // 🔺 🔺 🔺
    RED_TRIANGLE_POINTED_UP(intArrayOf(0x1F53A)),
    // 🔻 🔻 🔻
    RED_TRIANGLE_POINTED_DOWN(intArrayOf(0x1F53B)),
    // 💠 💠 💠
    DIAMOND_WITH_A_DOT(intArrayOf(0x1F4A0)),
    // 🔘 🔘 🔘
    RADIO_BUTTON(intArrayOf(0x1F518)),
    // 🔳 🔳 🔳
    WHITE_SQUARE_BUTTON(intArrayOf(0x1F533)),
    // 🔲 🔲 🔲
    BLACK_SQUARE_BUTTON(intArrayOf(0x1F532)),
    // 🏁 🏁 🏁
    CHEQUERED_FLAG(intArrayOf(0x1F3C1)),
    // 🚩 🚩 🚩
    TRIANGULAR_FLAG(intArrayOf(0x1F6A9)),
    // 🎌 🎌 🎌
    CROSSED_FLAGS(intArrayOf(0x1F38C)),
    // 🏴 🏴 🏴
    BLACK_FLAG(intArrayOf(0x1F3F4)),
    // 🏳️ 🏳️ 🏳️
    WHITE_FLAG(intArrayOf(0x1F3F3,0xFE0F)),
    // 🏳️‍🌈 🏳️‍🌈 🏳️‍🌈
    RAINBOW_FLAG(intArrayOf(0x1F3F3,0xFE0F,0x200D,0x1F308)),
    // 🏳️‍⚧️ 🏳️‍⚧️ 🏳️‍⚧️
    TRANSGENDER_FLAG(intArrayOf(0x1F3F3,0xFE0F,0x200D,0x26A7,0xFE0F)),
    // 🏴‍☠️ 🏴‍☠️ 🏴‍☠️
    PIRATE_FLAG(intArrayOf(0x1F3F4,0x200D,0x2620,0xFE0F)),
    // 🇦🇨 🇦🇨 🇦🇨
    FLAG_ASCENSION_ISLAND(intArrayOf(0x1F1E6,0x1F1E8)),
    // 🇦🇩 🇦🇩 🇦🇩
    FLAG_ANDORRA(intArrayOf(0x1F1E6,0x1F1E9)),
    // 🇦🇪 🇦🇪 🇦🇪
    FLAG_UNITED_ARAB_EMIRATES(intArrayOf(0x1F1E6,0x1F1EA)),
    // 🇦🇫 🇦🇫 🇦🇫
    FLAG_AFGHANISTAN(intArrayOf(0x1F1E6,0x1F1EB)),
    // 🇦🇬 🇦🇬 🇦🇬
    FLAG_ANTIGUA_AND_BARBUDA(intArrayOf(0x1F1E6,0x1F1EC)),
    // 🇦🇮 🇦🇮 🇦🇮
    FLAG_ANGUILLA(intArrayOf(0x1F1E6,0x1F1EE)),
    // 🇦🇱 🇦🇱 🇦🇱
    FLAG_ALBANIA(intArrayOf(0x1F1E6,0x1F1F1)),
    // 🇦🇲 🇦🇲 🇦🇲
    FLAG_ARMENIA(intArrayOf(0x1F1E6,0x1F1F2)),
    // 🇦🇴 🇦🇴 🇦🇴
    FLAG_ANGOLA(intArrayOf(0x1F1E6,0x1F1F4)),
    // 🇦🇶 🇦🇶 🇦🇶
    FLAG_ANTARCTICA(intArrayOf(0x1F1E6,0x1F1F6)),
    // 🇦🇷 🇦🇷 🇦🇷
    FLAG_ARGENTINA(intArrayOf(0x1F1E6,0x1F1F7)),
    // 🇦🇸 🇦🇸 🇦🇸
    FLAG_AMERICAN_SAMOA(intArrayOf(0x1F1E6,0x1F1F8)),
    // 🇦🇹 🇦🇹 🇦🇹
    FLAG_AUSTRIA(intArrayOf(0x1F1E6,0x1F1F9)),
    // 🇦🇺 🇦🇺 🇦🇺
    FLAG_AUSTRALIA(intArrayOf(0x1F1E6,0x1F1FA)),
    // 🇦🇼 🇦🇼 🇦🇼
    FLAG_ARUBA(intArrayOf(0x1F1E6,0x1F1FC)),
    // 🇦🇽 🇦🇽 🇦🇽
    FLAG_ÅLAND_ISLANDS(intArrayOf(0x1F1E6,0x1F1FD)),
    // 🇦🇿 🇦🇿 🇦🇿
    FLAG_AZERBAIJAN(intArrayOf(0x1F1E6,0x1F1FF)),
    // 🇧🇦 🇧🇦 🇧🇦
    FLAG_BOSNIA_AND_HERZEGOVINA(intArrayOf(0x1F1E7,0x1F1E6)),
    // 🇧🇧 🇧🇧 🇧🇧
    FLAG_BARBADOS(intArrayOf(0x1F1E7,0x1F1E7)),
    // 🇧🇩 🇧🇩 🇧🇩
    FLAG_BANGLADESH(intArrayOf(0x1F1E7,0x1F1E9)),
    // 🇧🇪 🇧🇪 🇧🇪
    FLAG_BELGIUM(intArrayOf(0x1F1E7,0x1F1EA)),
    // 🇧🇫 🇧🇫 🇧🇫
    FLAG_BURKINA_FASO(intArrayOf(0x1F1E7,0x1F1EB)),
    // 🇧🇬 🇧🇬 🇧🇬
    FLAG_BULGARIA(intArrayOf(0x1F1E7,0x1F1EC)),
    // 🇧🇭 🇧🇭 🇧🇭
    FLAG_BAHRAIN(intArrayOf(0x1F1E7,0x1F1ED)),
    // 🇧🇮 🇧🇮 🇧🇮
    FLAG_BURUNDI(intArrayOf(0x1F1E7,0x1F1EE)),
    // 🇧🇯 🇧🇯 🇧🇯
    FLAG_BENIN(intArrayOf(0x1F1E7,0x1F1EF)),
    // 🇧🇱 🇧🇱 🇧🇱
    FLAG_ST_BARTHÉLEMY(intArrayOf(0x1F1E7,0x1F1F1)),
    // 🇧🇲 🇧🇲 🇧🇲
    FLAG_BERMUDA(intArrayOf(0x1F1E7,0x1F1F2)),
    // 🇧🇳 🇧🇳 🇧🇳
    FLAG_BRUNEI(intArrayOf(0x1F1E7,0x1F1F3)),
    // 🇧🇴 🇧🇴 🇧🇴
    FLAG_BOLIVIA(intArrayOf(0x1F1E7,0x1F1F4)),
    // 🇧🇶 🇧🇶 🇧🇶
    FLAG_CARIBBEAN_NETHERLANDS(intArrayOf(0x1F1E7,0x1F1F6)),
    // 🇧🇷 🇧🇷 🇧🇷
    FLAG_BRAZIL(intArrayOf(0x1F1E7,0x1F1F7)),
    // 🇧🇸 🇧🇸 🇧🇸
    FLAG_BAHAMAS(intArrayOf(0x1F1E7,0x1F1F8)),
    // 🇧🇹 🇧🇹 🇧🇹
    FLAG_BHUTAN(intArrayOf(0x1F1E7,0x1F1F9)),
    // 🇧🇻 🇧🇻 🇧🇻
    FLAG_BOUVET_ISLAND(intArrayOf(0x1F1E7,0x1F1FB)),
    // 🇧🇼 🇧🇼 🇧🇼
    FLAG_BOTSWANA(intArrayOf(0x1F1E7,0x1F1FC)),
    // 🇧🇾 🇧🇾 🇧🇾
    FLAG_BELARUS(intArrayOf(0x1F1E7,0x1F1FE)),
    // 🇧🇿 🇧🇿 🇧🇿
    FLAG_BELIZE(intArrayOf(0x1F1E7,0x1F1FF)),
    // 🇨🇦 🇨🇦 🇨🇦
    FLAG_CANADA(intArrayOf(0x1F1E8,0x1F1E6)),
    // 🇨🇨 🇨🇨 🇨🇨
    FLAG_COCOS_KEELING_ISLANDS(intArrayOf(0x1F1E8,0x1F1E8)),
    // 🇨🇩 🇨🇩 🇨🇩
    FLAG_CONGO___KINSHASA(intArrayOf(0x1F1E8,0x1F1E9)),
    // 🇨🇫 🇨🇫 🇨🇫
    FLAG_CENTRAL_AFRICAN_REPUBLIC(intArrayOf(0x1F1E8,0x1F1EB)),
    // 🇨🇬 🇨🇬 🇨🇬
    FLAG_CONGO___BRAZZAVILLE(intArrayOf(0x1F1E8,0x1F1EC)),
    // 🇨🇭 🇨🇭 🇨🇭
    FLAG_SWITZERLAND(intArrayOf(0x1F1E8,0x1F1ED)),
    // 🇨🇮 🇨🇮 🇨🇮
    FLAG_CÔTE_DIVOIRE(intArrayOf(0x1F1E8,0x1F1EE)),
    // 🇨🇰 🇨🇰 🇨🇰
    FLAG_COOK_ISLANDS(intArrayOf(0x1F1E8,0x1F1F0)),
    // 🇨🇱 🇨🇱 🇨🇱
    FLAG_CHILE(intArrayOf(0x1F1E8,0x1F1F1)),
    // 🇨🇲 🇨🇲 🇨🇲
    FLAG_CAMEROON(intArrayOf(0x1F1E8,0x1F1F2)),
    // 🇨🇳 🇨🇳 🇨🇳
    FLAG_CHINA(intArrayOf(0x1F1E8,0x1F1F3)),
    // 🇨🇴 🇨🇴 🇨🇴
    FLAG_COLOMBIA(intArrayOf(0x1F1E8,0x1F1F4)),
    // 🇨🇵 🇨🇵 🇨🇵
    FLAG_CLIPPERTON_ISLAND(intArrayOf(0x1F1E8,0x1F1F5)),
    // 🇨🇷 🇨🇷 🇨🇷
    FLAG_COSTA_RICA(intArrayOf(0x1F1E8,0x1F1F7)),
    // 🇨🇺 🇨🇺 🇨🇺
    FLAG_CUBA(intArrayOf(0x1F1E8,0x1F1FA)),
    // 🇨🇻 🇨🇻 🇨🇻
    FLAG_CAPE_VERDE(intArrayOf(0x1F1E8,0x1F1FB)),
    // 🇨🇼 🇨🇼 🇨🇼
    FLAG_CURAÇAO(intArrayOf(0x1F1E8,0x1F1FC)),
    // 🇨🇽 🇨🇽 🇨🇽
    FLAG_CHRISTMAS_ISLAND(intArrayOf(0x1F1E8,0x1F1FD)),
    // 🇨🇾 🇨🇾 🇨🇾
    FLAG_CYPRUS(intArrayOf(0x1F1E8,0x1F1FE)),
    // 🇨🇿 🇨🇿 🇨🇿
    FLAG_CZECHIA(intArrayOf(0x1F1E8,0x1F1FF)),
    // 🇩🇪 🇩🇪 🇩🇪
    FLAG_GERMANY(intArrayOf(0x1F1E9,0x1F1EA)),
    // 🇩🇬 🇩🇬 🇩🇬
    FLAG_DIEGO_GARCIA(intArrayOf(0x1F1E9,0x1F1EC)),
    // 🇩🇯 🇩🇯 🇩🇯
    FLAG_DJIBOUTI(intArrayOf(0x1F1E9,0x1F1EF)),
    // 🇩🇰 🇩🇰 🇩🇰
    FLAG_DENMARK(intArrayOf(0x1F1E9,0x1F1F0)),
    // 🇩🇲 🇩🇲 🇩🇲
    FLAG_DOMINICA(intArrayOf(0x1F1E9,0x1F1F2)),
    // 🇩🇴 🇩🇴 🇩🇴
    FLAG_DOMINICAN_REPUBLIC(intArrayOf(0x1F1E9,0x1F1F4)),
    // 🇩🇿 🇩🇿 🇩🇿
    FLAG_ALGERIA(intArrayOf(0x1F1E9,0x1F1FF)),
    // 🇪🇦 🇪🇦 🇪🇦
    FLAG_CEUTA_AND_MELILLA(intArrayOf(0x1F1EA,0x1F1E6)),
    // 🇪🇨 🇪🇨 🇪🇨
    FLAG_ECUADOR(intArrayOf(0x1F1EA,0x1F1E8)),
    // 🇪🇪 🇪🇪 🇪🇪
    FLAG_ESTONIA(intArrayOf(0x1F1EA,0x1F1EA)),
    // 🇪🇬 🇪🇬 🇪🇬
    FLAG_EGYPT(intArrayOf(0x1F1EA,0x1F1EC)),
    // 🇪🇭 🇪🇭 🇪🇭
    FLAG_WESTERN_SAHARA(intArrayOf(0x1F1EA,0x1F1ED)),
    // 🇪🇷 🇪🇷 🇪🇷
    FLAG_ERITREA(intArrayOf(0x1F1EA,0x1F1F7)),
    // 🇪🇸 🇪🇸 🇪🇸
    FLAG_SPAIN(intArrayOf(0x1F1EA,0x1F1F8)),
    // 🇪🇹 🇪🇹 🇪🇹
    FLAG_ETHIOPIA(intArrayOf(0x1F1EA,0x1F1F9)),
    // 🇪🇺 🇪🇺 🇪🇺
    FLAG_EUROPEAN_UNION(intArrayOf(0x1F1EA,0x1F1FA)),
    // 🇫🇮 🇫🇮 🇫🇮
    FLAG_FINLAND(intArrayOf(0x1F1EB,0x1F1EE)),
    // 🇫🇯 🇫🇯 🇫🇯
    FLAG_FIJI(intArrayOf(0x1F1EB,0x1F1EF)),
    // 🇫🇰 🇫🇰 🇫🇰
    FLAG_FALKLAND_ISLANDS(intArrayOf(0x1F1EB,0x1F1F0)),
    // 🇫🇲 🇫🇲 🇫🇲
    FLAG_MICRONESIA(intArrayOf(0x1F1EB,0x1F1F2)),
    // 🇫🇴 🇫🇴 🇫🇴
    FLAG_FAROE_ISLANDS(intArrayOf(0x1F1EB,0x1F1F4)),
    // 🇫🇷 🇫🇷 🇫🇷
    FLAG_FRANCE(intArrayOf(0x1F1EB,0x1F1F7)),
    // 🇬🇦 🇬🇦 🇬🇦
    FLAG_GABON(intArrayOf(0x1F1EC,0x1F1E6)),
    // 🇬🇧 🇬🇧 🇬🇧
    FLAG_UNITED_KINGDOM(intArrayOf(0x1F1EC,0x1F1E7)),
    // 🇬🇩 🇬🇩 🇬🇩
    FLAG_GRENADA(intArrayOf(0x1F1EC,0x1F1E9)),
    // 🇬🇪 🇬🇪 🇬🇪
    FLAG_GEORGIA(intArrayOf(0x1F1EC,0x1F1EA)),
    // 🇬🇫 🇬🇫 🇬🇫
    FLAG_FRENCH_GUIANA(intArrayOf(0x1F1EC,0x1F1EB)),
    // 🇬🇬 🇬🇬 🇬🇬
    FLAG_GUERNSEY(intArrayOf(0x1F1EC,0x1F1EC)),
    // 🇬🇭 🇬🇭 🇬🇭
    FLAG_GHANA(intArrayOf(0x1F1EC,0x1F1ED)),
    // 🇬🇮 🇬🇮 🇬🇮
    FLAG_GIBRALTAR(intArrayOf(0x1F1EC,0x1F1EE)),
    // 🇬🇱 🇬🇱 🇬🇱
    FLAG_GREENLAND(intArrayOf(0x1F1EC,0x1F1F1)),
    // 🇬🇲 🇬🇲 🇬🇲
    FLAG_GAMBIA(intArrayOf(0x1F1EC,0x1F1F2)),
    // 🇬🇳 🇬🇳 🇬🇳
    FLAG_GUINEA(intArrayOf(0x1F1EC,0x1F1F3)),
    // 🇬🇵 🇬🇵 🇬🇵
    FLAG_GUADELOUPE(intArrayOf(0x1F1EC,0x1F1F5)),
    // 🇬🇶 🇬🇶 🇬🇶
    FLAG_EQUATORIAL_GUINEA(intArrayOf(0x1F1EC,0x1F1F6)),
    // 🇬🇷 🇬🇷 🇬🇷
    FLAG_GREECE(intArrayOf(0x1F1EC,0x1F1F7)),
    // 🇬🇸 🇬🇸 🇬🇸
    FLAG_SOUTH_GEORGIA_AND_SOUTH_SANDWICH_ISLANDS(intArrayOf(0x1F1EC,0x1F1F8)),
    // 🇬🇹 🇬🇹 🇬🇹
    FLAG_GUATEMALA(intArrayOf(0x1F1EC,0x1F1F9)),
    // 🇬🇺 🇬🇺 🇬🇺
    FLAG_GUAM(intArrayOf(0x1F1EC,0x1F1FA)),
    // 🇬🇼 🇬🇼 🇬🇼
    FLAG_GUINEA_BISSAU(intArrayOf(0x1F1EC,0x1F1FC)),
    // 🇬🇾 🇬🇾 🇬🇾
    FLAG_GUYANA(intArrayOf(0x1F1EC,0x1F1FE)),
    // 🇭🇰 🇭🇰 🇭🇰
    FLAG_HONG_KONG_SAR_CHINA(intArrayOf(0x1F1ED,0x1F1F0)),
    // 🇭🇲 🇭🇲 🇭🇲
    FLAG_HEARD_AND_MCDONALD_ISLANDS(intArrayOf(0x1F1ED,0x1F1F2)),
    // 🇭🇳 🇭🇳 🇭🇳
    FLAG_HONDURAS(intArrayOf(0x1F1ED,0x1F1F3)),
    // 🇭🇷 🇭🇷 🇭🇷
    FLAG_CROATIA(intArrayOf(0x1F1ED,0x1F1F7)),
    // 🇭🇹 🇭🇹 🇭🇹
    FLAG_HAITI(intArrayOf(0x1F1ED,0x1F1F9)),
    // 🇭🇺 🇭🇺 🇭🇺
    FLAG_HUNGARY(intArrayOf(0x1F1ED,0x1F1FA)),
    // 🇮🇨 🇮🇨 🇮🇨
    FLAG_CANARY_ISLANDS(intArrayOf(0x1F1EE,0x1F1E8)),
    // 🇮🇩 🇮🇩 🇮🇩
    FLAG_INDONESIA(intArrayOf(0x1F1EE,0x1F1E9)),
    // 🇮🇪 🇮🇪 🇮🇪
    FLAG_IRELAND(intArrayOf(0x1F1EE,0x1F1EA)),
    // 🇮🇱 🇮🇱 🇮🇱
    FLAG_ISRAEL(intArrayOf(0x1F1EE,0x1F1F1)),
    // 🇮🇲 🇮🇲 🇮🇲
    FLAG_ISLE_OF_MAN(intArrayOf(0x1F1EE,0x1F1F2)),
    // 🇮🇳 🇮🇳 🇮🇳
    FLAG_INDIA(intArrayOf(0x1F1EE,0x1F1F3)),
    // 🇮🇴 🇮🇴 🇮🇴
    FLAG_BRITISH_INDIAN_OCEAN_TERRITORY(intArrayOf(0x1F1EE,0x1F1F4)),
    // 🇮🇶 🇮🇶 🇮🇶
    FLAG_IRAQ(intArrayOf(0x1F1EE,0x1F1F6)),
    // 🇮🇷 🇮🇷 🇮🇷
    FLAG_IRAN(intArrayOf(0x1F1EE,0x1F1F7)),
    // 🇮🇸 🇮🇸 🇮🇸
    FLAG_ICELAND(intArrayOf(0x1F1EE,0x1F1F8)),
    // 🇮🇹 🇮🇹 🇮🇹
    FLAG_ITALY(intArrayOf(0x1F1EE,0x1F1F9)),
    // 🇯🇪 🇯🇪 🇯🇪
    FLAG_JERSEY(intArrayOf(0x1F1EF,0x1F1EA)),
    // 🇯🇲 🇯🇲 🇯🇲
    FLAG_JAMAICA(intArrayOf(0x1F1EF,0x1F1F2)),
    // 🇯🇴 🇯🇴 🇯🇴
    FLAG_JORDAN(intArrayOf(0x1F1EF,0x1F1F4)),
    // 🇯🇵 🇯🇵 🇯🇵
    FLAG_JAPAN(intArrayOf(0x1F1EF,0x1F1F5)),
    // 🇰🇪 🇰🇪 🇰🇪
    FLAG_KENYA(intArrayOf(0x1F1F0,0x1F1EA)),
    // 🇰🇬 🇰🇬 🇰🇬
    FLAG_KYRGYZSTAN(intArrayOf(0x1F1F0,0x1F1EC)),
    // 🇰🇭 🇰🇭 🇰🇭
    FLAG_CAMBODIA(intArrayOf(0x1F1F0,0x1F1ED)),
    // 🇰🇮 🇰🇮 🇰🇮
    FLAG_KIRIBATI(intArrayOf(0x1F1F0,0x1F1EE)),
    // 🇰🇲 🇰🇲 🇰🇲
    FLAG_COMOROS(intArrayOf(0x1F1F0,0x1F1F2)),
    // 🇰🇳 🇰🇳 🇰🇳
    FLAG_ST_KITTS_AND_NEVIS(intArrayOf(0x1F1F0,0x1F1F3)),
    // 🇰🇵 🇰🇵 🇰🇵
    FLAG_NORTH_KOREA(intArrayOf(0x1F1F0,0x1F1F5)),
    // 🇰🇷 🇰🇷 🇰🇷
    FLAG_SOUTH_KOREA(intArrayOf(0x1F1F0,0x1F1F7)),
    // 🇰🇼 🇰🇼 🇰🇼
    FLAG_KUWAIT(intArrayOf(0x1F1F0,0x1F1FC)),
    // 🇰🇾 🇰🇾 🇰🇾
    FLAG_CAYMAN_ISLANDS(intArrayOf(0x1F1F0,0x1F1FE)),
    // 🇰🇿 🇰🇿 🇰🇿
    FLAG_KAZAKHSTAN(intArrayOf(0x1F1F0,0x1F1FF)),
    // 🇱🇦 🇱🇦 🇱🇦
    FLAG_LAOS(intArrayOf(0x1F1F1,0x1F1E6)),
    // 🇱🇧 🇱🇧 🇱🇧
    FLAG_LEBANON(intArrayOf(0x1F1F1,0x1F1E7)),
    // 🇱🇨 🇱🇨 🇱🇨
    FLAG_ST_LUCIA(intArrayOf(0x1F1F1,0x1F1E8)),
    // 🇱🇮 🇱🇮 🇱🇮
    FLAG_LIECHTENSTEIN(intArrayOf(0x1F1F1,0x1F1EE)),
    // 🇱🇰 🇱🇰 🇱🇰
    FLAG_SRI_LANKA(intArrayOf(0x1F1F1,0x1F1F0)),
    // 🇱🇷 🇱🇷 🇱🇷
    FLAG_LIBERIA(intArrayOf(0x1F1F1,0x1F1F7)),
    // 🇱🇸 🇱🇸 🇱🇸
    FLAG_LESOTHO(intArrayOf(0x1F1F1,0x1F1F8)),
    // 🇱🇹 🇱🇹 🇱🇹
    FLAG_LITHUANIA(intArrayOf(0x1F1F1,0x1F1F9)),
    // 🇱🇺 🇱🇺 🇱🇺
    FLAG_LUXEMBOURG(intArrayOf(0x1F1F1,0x1F1FA)),
    // 🇱🇻 🇱🇻 🇱🇻
    FLAG_LATVIA(intArrayOf(0x1F1F1,0x1F1FB)),
    // 🇱🇾 🇱🇾 🇱🇾
    FLAG_LIBYA(intArrayOf(0x1F1F1,0x1F1FE)),
    // 🇲🇦 🇲🇦 🇲🇦
    FLAG_MOROCCO(intArrayOf(0x1F1F2,0x1F1E6)),
    // 🇲🇨 🇲🇨 🇲🇨
    FLAG_MONACO(intArrayOf(0x1F1F2,0x1F1E8)),
    // 🇲🇩 🇲🇩 🇲🇩
    FLAG_MOLDOVA(intArrayOf(0x1F1F2,0x1F1E9)),
    // 🇲🇪 🇲🇪 🇲🇪
    FLAG_MONTENEGRO(intArrayOf(0x1F1F2,0x1F1EA)),
    // 🇲🇫 🇲🇫 🇲🇫
    FLAG_ST_MARTIN(intArrayOf(0x1F1F2,0x1F1EB)),
    // 🇲🇬 🇲🇬 🇲🇬
    FLAG_MADAGASCAR(intArrayOf(0x1F1F2,0x1F1EC)),
    // 🇲🇭 🇲🇭 🇲🇭
    FLAG_MARSHALL_ISLANDS(intArrayOf(0x1F1F2,0x1F1ED)),
    // 🇲🇰 🇲🇰 🇲🇰
    FLAG_NORTH_MACEDONIA(intArrayOf(0x1F1F2,0x1F1F0)),
    // 🇲🇱 🇲🇱 🇲🇱
    FLAG_MALI(intArrayOf(0x1F1F2,0x1F1F1)),
    // 🇲🇲 🇲🇲 🇲🇲
    FLAG_MYANMAR_BURMA(intArrayOf(0x1F1F2,0x1F1F2)),
    // 🇲🇳 🇲🇳 🇲🇳
    FLAG_MONGOLIA(intArrayOf(0x1F1F2,0x1F1F3)),
    // 🇲🇴 🇲🇴 🇲🇴
    FLAG_MACAO_SAR_CHINA(intArrayOf(0x1F1F2,0x1F1F4)),
    // 🇲🇵 🇲🇵 🇲🇵
    FLAG_NORTHERN_MARIANA_ISLANDS(intArrayOf(0x1F1F2,0x1F1F5)),
    // 🇲🇶 🇲🇶 🇲🇶
    FLAG_MARTINIQUE(intArrayOf(0x1F1F2,0x1F1F6)),
    // 🇲🇷 🇲🇷 🇲🇷
    FLAG_MAURITANIA(intArrayOf(0x1F1F2,0x1F1F7)),
    // 🇲🇸 🇲🇸 🇲🇸
    FLAG_MONTSERRAT(intArrayOf(0x1F1F2,0x1F1F8)),
    // 🇲🇹 🇲🇹 🇲🇹
    FLAG_MALTA(intArrayOf(0x1F1F2,0x1F1F9)),
    // 🇲🇺 🇲🇺 🇲🇺
    FLAG_MAURITIUS(intArrayOf(0x1F1F2,0x1F1FA)),
    // 🇲🇻 🇲🇻 🇲🇻
    FLAG_MALDIVES(intArrayOf(0x1F1F2,0x1F1FB)),
    // 🇲🇼 🇲🇼 🇲🇼
    FLAG_MALAWI(intArrayOf(0x1F1F2,0x1F1FC)),
    // 🇲🇽 🇲🇽 🇲🇽
    FLAG_MEXICO(intArrayOf(0x1F1F2,0x1F1FD)),
    // 🇲🇾 🇲🇾 🇲🇾
    FLAG_MALAYSIA(intArrayOf(0x1F1F2,0x1F1FE)),
    // 🇲🇿 🇲🇿 🇲🇿
    FLAG_MOZAMBIQUE(intArrayOf(0x1F1F2,0x1F1FF)),
    // 🇳🇦 🇳🇦 🇳🇦
    FLAG_NAMIBIA(intArrayOf(0x1F1F3,0x1F1E6)),
    // 🇳🇨 🇳🇨 🇳🇨
    FLAG_NEW_CALEDONIA(intArrayOf(0x1F1F3,0x1F1E8)),
    // 🇳🇪 🇳🇪 🇳🇪
    FLAG_NIGER(intArrayOf(0x1F1F3,0x1F1EA)),
    // 🇳🇫 🇳🇫 🇳🇫
    FLAG_NORFOLK_ISLAND(intArrayOf(0x1F1F3,0x1F1EB)),
    // 🇳🇬 🇳🇬 🇳🇬
    FLAG_NIGERIA(intArrayOf(0x1F1F3,0x1F1EC)),
    // 🇳🇮 🇳🇮 🇳🇮
    FLAG_NICARAGUA(intArrayOf(0x1F1F3,0x1F1EE)),
    // 🇳🇱 🇳🇱 🇳🇱
    FLAG_NETHERLANDS(intArrayOf(0x1F1F3,0x1F1F1)),
    // 🇳🇴 🇳🇴 🇳🇴
    FLAG_NORWAY(intArrayOf(0x1F1F3,0x1F1F4)),
    // 🇳🇵 🇳🇵 🇳🇵
    FLAG_NEPAL(intArrayOf(0x1F1F3,0x1F1F5)),
    // 🇳🇷 🇳🇷 🇳🇷
    FLAG_NAURU(intArrayOf(0x1F1F3,0x1F1F7)),
    // 🇳🇺 🇳🇺 🇳🇺
    FLAG_NIUE(intArrayOf(0x1F1F3,0x1F1FA)),
    // 🇳🇿 🇳🇿 🇳🇿
    FLAG_NEW_ZEALAND(intArrayOf(0x1F1F3,0x1F1FF)),
    // 🇴🇲 🇴🇲 🇴🇲
    FLAG_OMAN(intArrayOf(0x1F1F4,0x1F1F2)),
    // 🇵🇦 🇵🇦 🇵🇦
    FLAG_PANAMA(intArrayOf(0x1F1F5,0x1F1E6)),
    // 🇵🇪 🇵🇪 🇵🇪
    FLAG_PERU(intArrayOf(0x1F1F5,0x1F1EA)),
    // 🇵🇫 🇵🇫 🇵🇫
    FLAG_FRENCH_POLYNESIA(intArrayOf(0x1F1F5,0x1F1EB)),
    // 🇵🇬 🇵🇬 🇵🇬
    FLAG_PAPUA_NEW_GUINEA(intArrayOf(0x1F1F5,0x1F1EC)),
    // 🇵🇭 🇵🇭 🇵🇭
    FLAG_PHILIPPINES(intArrayOf(0x1F1F5,0x1F1ED)),
    // 🇵🇰 🇵🇰 🇵🇰
    FLAG_PAKISTAN(intArrayOf(0x1F1F5,0x1F1F0)),
    // 🇵🇱 🇵🇱 🇵🇱
    FLAG_POLAND(intArrayOf(0x1F1F5,0x1F1F1)),
    // 🇵🇲 🇵🇲 🇵🇲
    FLAG_ST_PIERRE_AND_MIQUELON(intArrayOf(0x1F1F5,0x1F1F2)),
    // 🇵🇳 🇵🇳 🇵🇳
    FLAG_PITCAIRN_ISLANDS(intArrayOf(0x1F1F5,0x1F1F3)),
    // 🇵🇷 🇵🇷 🇵🇷
    FLAG_PUERTO_RICO(intArrayOf(0x1F1F5,0x1F1F7)),
    // 🇵🇸 🇵🇸 🇵🇸
    FLAG_PALESTINIAN_TERRITORIES(intArrayOf(0x1F1F5,0x1F1F8)),
    // 🇵🇹 🇵🇹 🇵🇹
    FLAG_PORTUGAL(intArrayOf(0x1F1F5,0x1F1F9)),
    // 🇵🇼 🇵🇼 🇵🇼
    FLAG_PALAU(intArrayOf(0x1F1F5,0x1F1FC)),
    // 🇵🇾 🇵🇾 🇵🇾
    FLAG_PARAGUAY(intArrayOf(0x1F1F5,0x1F1FE)),
    // 🇶🇦 🇶🇦 🇶🇦
    FLAG_QATAR(intArrayOf(0x1F1F6,0x1F1E6)),
    // 🇷🇪 🇷🇪 🇷🇪
    FLAG_RÉUNION(intArrayOf(0x1F1F7,0x1F1EA)),
    // 🇷🇴 🇷🇴 🇷🇴
    FLAG_ROMANIA(intArrayOf(0x1F1F7,0x1F1F4)),
    // 🇷🇸 🇷🇸 🇷🇸
    FLAG_SERBIA(intArrayOf(0x1F1F7,0x1F1F8)),
    // 🇷🇺 🇷🇺 🇷🇺
    FLAG_RUSSIA(intArrayOf(0x1F1F7,0x1F1FA)),
    // 🇷🇼 🇷🇼 🇷🇼
    FLAG_RWANDA(intArrayOf(0x1F1F7,0x1F1FC)),
    // 🇸🇦 🇸🇦 🇸🇦
    FLAG_SAUDI_ARABIA(intArrayOf(0x1F1F8,0x1F1E6)),
    // 🇸🇧 🇸🇧 🇸🇧
    FLAG_SOLOMON_ISLANDS(intArrayOf(0x1F1F8,0x1F1E7)),
    // 🇸🇨 🇸🇨 🇸🇨
    FLAG_SEYCHELLES(intArrayOf(0x1F1F8,0x1F1E8)),
    // 🇸🇩 🇸🇩 🇸🇩
    FLAG_SUDAN(intArrayOf(0x1F1F8,0x1F1E9)),
    // 🇸🇪 🇸🇪 🇸🇪
    FLAG_SWEDEN(intArrayOf(0x1F1F8,0x1F1EA)),
    // 🇸🇬 🇸🇬 🇸🇬
    FLAG_SINGAPORE(intArrayOf(0x1F1F8,0x1F1EC)),
    // 🇸🇭 🇸🇭 🇸🇭
    FLAG_ST_HELENA(intArrayOf(0x1F1F8,0x1F1ED)),
    // 🇸🇮 🇸🇮 🇸🇮
    FLAG_SLOVENIA(intArrayOf(0x1F1F8,0x1F1EE)),
    // 🇸🇯 🇸🇯 🇸🇯
    FLAG_SVALBARD_AND_JAN_MAYEN(intArrayOf(0x1F1F8,0x1F1EF)),
    // 🇸🇰 🇸🇰 🇸🇰
    FLAG_SLOVAKIA(intArrayOf(0x1F1F8,0x1F1F0)),
    // 🇸🇱 🇸🇱 🇸🇱
    FLAG_SIERRA_LEONE(intArrayOf(0x1F1F8,0x1F1F1)),
    // 🇸🇲 🇸🇲 🇸🇲
    FLAG_SAN_MARINO(intArrayOf(0x1F1F8,0x1F1F2)),
    // 🇸🇳 🇸🇳 🇸🇳
    FLAG_SENEGAL(intArrayOf(0x1F1F8,0x1F1F3)),
    // 🇸🇴 🇸🇴 🇸🇴
    FLAG_SOMALIA(intArrayOf(0x1F1F8,0x1F1F4)),
    // 🇸🇷 🇸🇷 🇸🇷
    FLAG_SURINAME(intArrayOf(0x1F1F8,0x1F1F7)),
    // 🇸🇸 🇸🇸 🇸🇸
    FLAG_SOUTH_SUDAN(intArrayOf(0x1F1F8,0x1F1F8)),
    // 🇸🇹 🇸🇹 🇸🇹
    FLAG_SÃO_TOMÉ_AND_PRÍNCIPE(intArrayOf(0x1F1F8,0x1F1F9)),
    // 🇸🇻 🇸🇻 🇸🇻
    FLAG_EL_SALVADOR(intArrayOf(0x1F1F8,0x1F1FB)),
    // 🇸🇽 🇸🇽 🇸🇽
    FLAG_SINT_MAARTEN(intArrayOf(0x1F1F8,0x1F1FD)),
    // 🇸🇾 🇸🇾 🇸🇾
    FLAG_SYRIA(intArrayOf(0x1F1F8,0x1F1FE)),
    // 🇸🇿 🇸🇿 🇸🇿
    FLAG_ESWATINI(intArrayOf(0x1F1F8,0x1F1FF)),
    // 🇹🇦 🇹🇦 🇹🇦
    FLAG_TRISTAN_DA_CUNHA(intArrayOf(0x1F1F9,0x1F1E6)),
    // 🇹🇨 🇹🇨 🇹🇨
    FLAG_TURKS_AND_CAICOS_ISLANDS(intArrayOf(0x1F1F9,0x1F1E8)),
    // 🇹🇩 🇹🇩 🇹🇩
    FLAG_CHAD(intArrayOf(0x1F1F9,0x1F1E9)),
    // 🇹🇫 🇹🇫 🇹🇫
    FLAG_FRENCH_SOUTHERN_TERRITORIES(intArrayOf(0x1F1F9,0x1F1EB)),
    // 🇹🇬 🇹🇬 🇹🇬
    FLAG_TOGO(intArrayOf(0x1F1F9,0x1F1EC)),
    // 🇹🇭 🇹🇭 🇹🇭
    FLAG_THAILAND(intArrayOf(0x1F1F9,0x1F1ED)),
    // 🇹🇯 🇹🇯 🇹🇯
    FLAG_TAJIKISTAN(intArrayOf(0x1F1F9,0x1F1EF)),
    // 🇹🇰 🇹🇰 🇹🇰
    FLAG_TOKELAU(intArrayOf(0x1F1F9,0x1F1F0)),
    // 🇹🇱 🇹🇱 🇹🇱
    FLAG_TIMOR_LESTE(intArrayOf(0x1F1F9,0x1F1F1)),
    // 🇹🇲 🇹🇲 🇹🇲
    FLAG_TURKMENISTAN(intArrayOf(0x1F1F9,0x1F1F2)),
    // 🇹🇳 🇹🇳 🇹🇳
    FLAG_TUNISIA(intArrayOf(0x1F1F9,0x1F1F3)),
    // 🇹🇴 🇹🇴 🇹🇴
    FLAG_TONGA(intArrayOf(0x1F1F9,0x1F1F4)),
    // 🇹🇷 🇹🇷 🇹🇷
    FLAG_TURKEY(intArrayOf(0x1F1F9,0x1F1F7)),
    // 🇹🇹 🇹🇹 🇹🇹
    FLAG_TRINIDAD_AND_TOBAGO(intArrayOf(0x1F1F9,0x1F1F9)),
    // 🇹🇻 🇹🇻 🇹🇻
    FLAG_TUVALU(intArrayOf(0x1F1F9,0x1F1FB)),
    // 🇹🇼 🇹🇼 🇹🇼
    FLAG_TAIWAN(intArrayOf(0x1F1F9,0x1F1FC)),
    // 🇹🇿 🇹🇿 🇹🇿
    FLAG_TANZANIA(intArrayOf(0x1F1F9,0x1F1FF)),
    // 🇺🇦 🇺🇦 🇺🇦
    FLAG_UKRAINE(intArrayOf(0x1F1FA,0x1F1E6)),
    // 🇺🇬 🇺🇬 🇺🇬
    FLAG_UGANDA(intArrayOf(0x1F1FA,0x1F1EC)),
    // 🇺🇲 🇺🇲 🇺🇲
    FLAG_US_OUTLYING_ISLANDS(intArrayOf(0x1F1FA,0x1F1F2)),
    // 🇺🇳 🇺🇳 🇺🇳
    FLAG_UNITED_NATIONS(intArrayOf(0x1F1FA,0x1F1F3)),
    // 🇺🇸 🇺🇸 🇺🇸
    FLAG_UNITED_STATES(intArrayOf(0x1F1FA,0x1F1F8)),
    // 🇺🇾 🇺🇾 🇺🇾
    FLAG_URUGUAY(intArrayOf(0x1F1FA,0x1F1FE)),
    // 🇺🇿 🇺🇿 🇺🇿
    FLAG_UZBEKISTAN(intArrayOf(0x1F1FA,0x1F1FF)),
    // 🇻🇦 🇻🇦 🇻🇦
    FLAG_VATICAN_CITY(intArrayOf(0x1F1FB,0x1F1E6)),
    // 🇻🇨 🇻🇨 🇻🇨
    FLAG_ST_VINCENT_AND_GRENADINES(intArrayOf(0x1F1FB,0x1F1E8)),
    // 🇻🇪 🇻🇪 🇻🇪
    FLAG_VENEZUELA(intArrayOf(0x1F1FB,0x1F1EA)),
    // 🇻🇬 🇻🇬 🇻🇬
    FLAG_BRITISH_VIRGIN_ISLANDS(intArrayOf(0x1F1FB,0x1F1EC)),
    // 🇻🇮 🇻🇮 🇻🇮
    FLAG_US_VIRGIN_ISLANDS(intArrayOf(0x1F1FB,0x1F1EE)),
    // 🇻🇳 🇻🇳 🇻🇳
    FLAG_VIETNAM(intArrayOf(0x1F1FB,0x1F1F3)),
    // 🇻🇺 🇻🇺 🇻🇺
    FLAG_VANUATU(intArrayOf(0x1F1FB,0x1F1FA)),
    // 🇼🇫 🇼🇫 🇼🇫
    FLAG_WALLIS_AND_FUTUNA(intArrayOf(0x1F1FC,0x1F1EB)),
    // 🇼🇸 🇼🇸 🇼🇸
    FLAG_SAMOA(intArrayOf(0x1F1FC,0x1F1F8)),
    // 🇽🇰 🇽🇰 🇽🇰
    FLAG_KOSOVO(intArrayOf(0x1F1FD,0x1F1F0)),
    // 🇾🇪 🇾🇪 🇾🇪
    FLAG_YEMEN(intArrayOf(0x1F1FE,0x1F1EA)),
    // 🇾🇹 🇾🇹 🇾🇹
    FLAG_MAYOTTE(intArrayOf(0x1F1FE,0x1F1F9)),
    // 🇿🇦 🇿🇦 🇿🇦
    FLAG_SOUTH_AFRICA(intArrayOf(0x1F1FF,0x1F1E6)),
    // 🇿🇲 🇿🇲 🇿🇲
    FLAG_ZAMBIA(intArrayOf(0x1F1FF,0x1F1F2)),
    // 🇿🇼 🇿🇼 🇿🇼
    FLAG_ZIMBABWE(intArrayOf(0x1F1FF,0x1F1FC)),
    // 🏴󠁧󠁢󠁥󠁮󠁧󠁿 🏴󠁧󠁢󠁥󠁮󠁧󠁿 🏴󠁧󠁢󠁥󠁮󠁧󠁿
    FLAG_ENGLAND(intArrayOf(0x1F3F4,0xE0067,0xE0062,0xE0065,0xE006E,0xE0067,0xE007F)),
    // 🏴󠁧󠁢󠁳󠁣󠁴󠁿 🏴󠁧󠁢󠁳󠁣󠁴󠁿 🏴󠁧󠁢󠁳󠁣󠁴󠁿
    FLAG_SCOTLAND(intArrayOf(0x1F3F4,0xE0067,0xE0062,0xE0073,0xE0063,0xE0074,0xE007F)),
    // 🏴󠁧󠁢󠁷󠁬󠁳󠁿 🏴󠁧󠁢󠁷󠁬󠁳󠁿 🏴󠁧󠁢󠁷󠁬󠁳󠁿
    FLAG_WALES(intArrayOf(0x1F3F4,0xE0067,0xE0062,0xE0077,0xE006C,0xE0073,0xE007F));

    override fun toString() = String(intArray, 0, intArray.size)
}
