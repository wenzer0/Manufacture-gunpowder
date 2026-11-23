# Changelog

## 3.5.0 / 3.6.0 / 3.7.0 — 2026-11-23

- Ported to the 26.x era on **Fabric** (requires [Fabric API](https://modrinth.com/mod/fabric-api))
  - 3.5.0 → Minecraft 26.1.2
  - 3.6.0 → Minecraft 26.2
  - 3.7.0 → Minecraft 26.3
- Recipe format carried over from 1.21.2+ (string `ingredient`, `result` object) — verified working unchanged
- All four recipes verified on dedicated servers (26.1.2 / 26.2 / 26.3, furnace + blast furnace, coal + charcoal)
- Note: Minecraft 26.x dedicated servers require **Java 25**

## 3.2.1 — 2026-11-22

- **Removed the coal block → gunpowder blasting recipe** on all 1.21+ loaders (Forge / NeoForge / Fabric)
- Reason: the furnace engine ignores the `count` field of cooking recipes on every version and loader, so a coal block only ever yielded 1 gunpowder instead of 9 — not worth a whole block (verified on dedicated servers: Fabric 1.21.1, Forge 1.21.1, Fabric 1.21.4, Fabric 1.21.11)
- 1.20.1 / 1.20.4 builds unaffected (they never had the coal block recipe)

## 2.2.0 — 2026-11-22

- Ported to Minecraft 1.20.4 on **Forge / NeoForge / Fabric** (Fabric requires [Fabric API](https://modrinth.com/mod/fabric-api))

## 3.3.0 — 2026-11-22

- Ported to Minecraft 1.21.4 on **Fabric / NeoForge** (Fabric requires [Fabric API](https://modrinth.com/mod/fabric-api))
- Recipe format updated for 1.21.2+ (string `ingredient`)

## 3.4.0 — 2026-11-22

- Ported to Minecraft 1.21.11 on **Fabric / NeoForge** (Fabric requires [Fabric API](https://modrinth.com/mod/fabric-api))

## 2.1.0 — 2026-11-21

- 1.20.1 **Fabric** build (requires [Fabric API](https://modrinth.com/mod/fabric-api))
- 1.20.1 Forge repackaged as 2.1.0 with blast-furnace recipes added (parity with 1.21.1)
- Note: on 1.20.1 the furnace engine cannot output more than 1 item per smelt, so the coal-block bulk recipe (→ 9 gunpowder) is exclusive to 1.21.1+

## 3.2.0 — 2026-11-21（已被 3.2.1 取代）

- Ported to Minecraft 1.21.1 on **Forge / NeoForge / Fabric** (Fabric version requires [Fabric API](https://modrinth.com/mod/fabric-api))
- Recipe format updated to 1.21 (`data/.../recipe/`, `result.id`)
- Repository cleaned: removed build artifacts, logs and game saves from git history tip; added README / CHANGELOG / .gitignore

## 3.0.0 — 2026-01-25

- 1.21.1 Forge: 4 recipes (coal/charcoal × smelting/blasting → gunpowder, 0.1 XP)

## 2.0.0 — 2026-01-24

- 1.20.1 Forge

## 1.3.0 — 2026-01-25

- 1.19.2 Forge

## 1.2.0 — 2026-01-25

- 1.18.2 Forge

## 1.1.0 — 2026-01-25

- 1.17.1 Forge

## 1.0.0 — 2026-01-25

- 1.16.5 Forge

## 0.1.0 — 2026-01-25

- 1.12.2 Forge — first release
