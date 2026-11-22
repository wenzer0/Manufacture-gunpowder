# Manufacture Gunpowder (火药制造)

[![CurseForge](https://img.shields.io/curseforge/dt/1442472)](https://www.curseforge.com/minecraft/mc-mods/manufacture-gunpowder)
![Minecraft](https://img.shields.io/badge/MC-1.12.2%20~%201.21.11-green)

**EN**: A lightweight vanilla-plus mod that adds reliable gunpowder production routes for modpacks where creepers are scarce — zombie apocalypse, hardcore survival, or expert packs. No new items, no new blocks: it only extends the vanilla furnace system, so it stays 100% compatible with automation mods.

**中文**：一个轻量级原版增强模组，为丧尸末日、硬核生存等难以刷苦力怕的整合包提供可靠的火药来源。不新增任何物品和方块，只扩展原版熔炉系统，与自动化模组 100% 兼容。

## Recipes / 配方

| Input 输入 | Machine 机器 | Output 输出 |
|---|---|---|
| 1 Coal / 煤炭 | Furnace 熔炉（200t） | 1 Gunpowder 火药 |
| 1 Coal / 煤炭 | Blast Furnace 高炉（100t） | 1 Gunpowder 火药 |
| 1 Charcoal / 木炭 | Furnace 熔炉（200t） | 1 Gunpowder 火药 |
| 1 Charcoal / 木炭 | Blast Furnace 高炉（100t） | 1 Gunpowder 火药 |

> Note / 说明：a coal block can't be smelted — vanilla treats it as fuel, and the furnace engine ignores recipe output counts on every version, so a "coal block → 9 gunpowder" recipe is impossible and has been removed. / 煤炭块不可烧炼：原版把它当燃料，且烧炼引擎在所有版本都会无视配方产出数量，所以「煤炭块 → 9 火药」做不到，该配方已移除。

## Version matrix / 版本矩阵

| MC 版本 | Loader 加载器 | File 文件 |
|---|---|---|
| 1.21.11 | Fabric | 3.4.0（需要 Fabric API） |
| 1.21.11 | NeoForge | 3.4.0 |
| 1.21.4 | Fabric | 3.3.0（需要 Fabric API） |
| 1.21.4 | NeoForge | 3.3.0 |
| 1.21.1 | Forge | 3.2.1 |
| 1.21.1 | NeoForge | 3.2.1 |
| 1.21.1 | Fabric | 3.2.1（需要 Fabric API） |
| 1.20.4 | Forge | 2.2.0 |
| 1.20.4 | NeoForge | 2.2.0 |
| 1.20.4 | Fabric | 2.2.0（需要 Fabric API） |
| 1.20.1 | Forge | 2.1.0 |
| 1.20.1 | Fabric | 2.1.0（需要 Fabric API） |
| 1.19.2 | Forge | 1.3.0 |
| 1.18.2 | Forge | 1.2.0 |
| 1.17.1 | Forge | 1.1.0 |
| 1.16.5 | Forge | 1.0.0 |
| 1.12.2 | Forge | 0.1.0 |

成品的 jar 请在 [GitHub Releases](https://github.com/wenzer0/Manufacture-gunpowder/releases)、[CurseForge](https://www.curseforge.com/minecraft/mc-mods/manufacture-gunpowder) 或 [Modrinth](https://modrinth.com/mod/manufacture-gunpowder) 下载。

## Repository layout / 仓库结构

```
src/            Forge 1.20.1 完整可编译工程（配方即数据包 JSON，无 Java 逻辑）
1.21.11/        v3.4.0 源文件（配方 + NeoForge/Fabric 元数据）
1.21.4/         v3.3.0 源文件（配方 + NeoForge/Fabric 元数据）
1.21.1/         v3.2.1 三加载器源文件（配方 + Forge/NeoForge/Fabric 元数据）
1.20.4/         v2.2.0 三加载器源文件（配方 + Forge/NeoForge/Fabric 元数据）
1.20.1/         v2.1.0 双加载器源文件（配方 + Forge/Fabric 元数据）
```

## Building / 构建（Forge 1.20.1）

```bash
./gradlew build
```

## License / 许可证

All Rights Reserved © lingzhihe. 未经许可不得转载、修改或再分发。Forge/Gradle 模板文件自带的声明归其原作者所有。
